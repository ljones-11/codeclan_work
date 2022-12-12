var myArray = [];
var sports = ['football', 'tennis', 'rugby'];

// console.log(sports.length);
// console.log(sports[1]);
// console.log(sports[0]);

sports.push('golf');
sports.push('squash', 'baseball')
// console.log(sports);

var removedSport = sports.pop();
// console.log(sports);
// console.log(removedSport);

sports.unshift('bowls');
// console.log(sports);

var shiftedSport = sports.shift();
// console.log(sports);
// console.log(shiftedSport);

var removedElements = sports.splice(1, 2);
// console.log(removedElements);
// console.log(sports);

for (var currentSport of sports) {
    var upperCaseSport = currentSport.toUpperCase();
    console.log(upperCaseSport);
}


// i++ equivalent to i = i + 1
for (var i = 0; i < sports.length; i++) {
    console.log('counter was: ', i, ' sport was', sports[i])
}




