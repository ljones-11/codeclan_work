const Dinosaur = require("./dinosaur");

const Park  = function(name, ticketPrice) {
    this.name = name;
    this.ticketPrice = ticketPrice
    this.collectionOfDinosaurs = []

}

Park.prototype.addDinosaur = function(dinosaur){
    this.collectionOfDinosaurs.push(dinosaur)

}

Park.prototype.removeDinosaur = function(dinosaur){
    const indexOfDinosaur = this.collectionOfDinosaurs.indexOf(dinosaur);
    this.collectionOfDinosaurs.splice(indexOfDinosaur, 1)
}

// Park.prototype.findMostAttractiveDinosaur = function(){
//     for(let i = 0; i < this.collectionOfDinosaurs.length; i++) {
//         let lastDino = this.collectionOfDinosaurs[i-1]
//         let currentDino = this.collectionOfDinosaurs[i]
//         if (currentDino.guestsAttractedPerDay > lastDino.guestsAttractedPerDay) {
//             return lastDino
//         } else {
//             return currentDino
//         }
//     }
// }

module.exports = Park;