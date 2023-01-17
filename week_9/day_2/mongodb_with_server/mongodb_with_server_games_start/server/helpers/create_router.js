const express = require('express');
const ObjectID = require('mongodb').ObjectID

const createRouter = function (collection) {

  const router = express.Router();

  //  Handle index route

  router.get('/', (req, res) => {
    collection
      .find()
      .toArray()
      .then(games => res.json(games))
      .catch(error => {
        console.error(error);
        res.status(500);
        res.json({ status: 500, error: error })
      })
  });

  // Handle Show (individual game) route

  router.get('/:id', (req, res) => {
    const id = req.params.id;
    collection
    .findOne({ _id: ObjectID(id) })
    .then(game => res.json(game))
    .catch(error => {
      console.error(error);
      res.status(500);
      res.json({ status: 500, error: error });
  });

});

// Handle POST request (create)

router.post('/', (req, res) => {
  const newGameData = req.body;

  collection
    .insertOne(newGameData)
    .then((result) => {
      res.json(result.ops[0])
    })
    .catch(error => {
      console.error(error);
      res.status(500);
      res.json({ status: 500, error: error })
    });
});

// Handle DELETE request

router.delete('/:id', (req, res) => {
  const id = req.params.id;

  collection
    .deleteOne({ _id: ObjectID(id) })
    .then(game => res.json(game))
    .catch(error => {
      console.error(error);
      res.status(500);
      res.json({ status: 500, error: error });
  });

});

// handle UPDATE

router.put('/:id', (req, res) => {
  const id = req.params.id;
  const updatedGame = req.body;

  collection
  .updateOne(
    { _id: ObjectID(id) }, 
    { $set: updatedGame }
    )
    .then(result => res.json(result))
    .catch(error => {
      console.error(error);
      res.status(500);
      res.json({ status: 500, error: error });
  });
});

  return router;

};

module.exports = createRouter;
