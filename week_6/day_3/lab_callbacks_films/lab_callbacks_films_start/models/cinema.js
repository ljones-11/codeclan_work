const Cinema = function (films) {
  this.films = films;
};


Cinema.prototype.getListOfTitles = function(films) {
  const listOfFilms = films.map((film) => {
    return film.title;
  });
  return listOfFilms

}

Cinema.prototype.findFilmByTitle = function(title) {
    return this.films.find((film) => {
    return film.title === title;
  });
    
}

Cinema.prototype.findFilmByGenre = function(genre) {
    return this.films.filter((film) => {
    return film.genre === genre
  })
}

Cinema.prototype.checkYears = function(year) {
  return this.films.some((film) => {
    return film.year === year
  });
}

Cinema.prototype.checkLength = function(length) {
  return this.films.every((film) => {
    return film.length >= length
  })
}

Cinema.prototype.totalRunningTime = function() {
  return this.films.reduce((total, film) => {
    return total + film.length;
  }, 0);
};

module.exports = Cinema;
