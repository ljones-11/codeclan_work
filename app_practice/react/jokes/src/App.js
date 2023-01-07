import React, { useState, useEffect } from 'react'
import './App.css';
import Joke from './components/Joke';
import Header from './components/Header';
import Footer from './components/Footer';

function App() {

  const [jokes, setJokes] = useState([])

  useEffect (() => {
    getJokes();
  },[])


  const getJokes = function() {
    fetch("https://official-joke-api.appspot.com/jokes/ten")
    .then(res => res.json())
    .then(data => setJokes(data))
  }

  const jokeElements = jokes.map((joke) => {

      return <Joke key={joke.id} setup={joke.setup} punchline = {joke.punchline}/>

    })


  return (
    <>
      <Header />
        <main>
          <ul className='joke-list'>
            <li>
              {jokeElements}
            </li>
          </ul>
        </main>
        
      <Footer />
    </>
  );
}

export default App;

        // <Joke 
        //           setup="I got my daughter a fridge for her birthday." 
        //           punchline="I can't wait to see her face light up when she opens it." 
        //           upvotes={17}
        //           downvotes={3}
        //       />
        //       <Joke 
        //           setup="How did the hacker escape the police?" 
        //           punchline="He just ransomware!" 
        //       />
        //       <Joke 
        //           setup="Why don't pirates travel on mountain roads?" 
        //           punchline="Scurvy." 
        //       />
        //       <Joke 
        //           setup="Why do bees stay in the hive in the winter?" 
        //           punchline="Swarm." 
        //       />
        //       <Joke 
        //           setup="What's the best thing about Switzerland?" 
        //           punchline="I don't know, but the flag is a big plus!" 
        //       />
