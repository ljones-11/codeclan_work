const Traveller = function(journeys) {
  this.journeys = journeys;
};

Traveller.prototype.getJourneyStartLocations = function(journey) {
  return this.journeys.map((journey) => {
    return journey.startLocation
  })
};

Traveller.prototype.getJourneyEndLocations = function (journey) {
  return this.journeys.map((journey) => {
    return journey.endLocation
  })
};

Traveller.prototype.getJourneysByTransport = function (transport) {
  return this.journeys.filter((journey) => {
  return journey.transport === transport;
  })
};

Traveller.prototype.getJourneysByMinDistance = function (minDistance) {
  return this.journeys.filter((journey) =>{
    return journey.distance > minDistance;
  })
};

Traveller.prototype.calculateTotalDistanceTravelled = function () {
  return this.journeys.reduce((total, journey) => {
    return total + journey.distance;
  }, 0)
};

Traveller.prototype.getUniqueModesOfTransport = function () {
  const mapTransportResults = this.journeys.map((journey) =>  journey.transport);

  const uniqueTransport = mapTransportResults.filter((transport, index) => {
  return mapTransportResults.indexOf(transport) === index
});

return uniqueTransport
  }


  // alternative

Traveller.prototype.getUniqueModesOfTransport = function () {
  const mapTransportResults = this.journeys.map((journey) =>  journey.transport);

  const uniqueTransport = mapTransportResults.filter((transport, index) => {
  return !mapTransportResults.includes(transport, index +1)
});

return uniqueTransport
  }


module.exports = Traveller;
