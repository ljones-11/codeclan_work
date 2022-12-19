const Cinema = function (films) {
  this.films = films;
};

Cinema.prototype.getFilmTitles = function () {
  return this.films.map((film) => {
    return film.title
  });
      
};

Cinema.prototype.findByTitle = function (title) {
  return this.films.find((film) => {
    return film.title === title
  });
}

// Cinema.prototype.findByGenre = function (genre) {
//   return this.films.filter((film) => {
//     return film.genre === genre
//   });
// }

Cinema.prototype.findByYear = function (year) {
  return this.films.some((film) => {
    return film.year === year;
  });
}

Cinema.prototype.checkAllOverLength = function (length) {
  return this.films.every((film) => {
    return film.length > length
  });
}

Cinema.prototype.totalRunningTime = function () {
  return this.films.reduce((total, film) => {
    return total + film.length
  }, 0)
}

// refactored to find by genre or year

Cinema.prototype.filterByProperty = function (value, property) {
  return this.films.filter((film) => {
    if (property === 'year') {
      return film.year === value;
    } else {
      return film.genre === value;
    };
  });
}

module.exports = Cinema;
