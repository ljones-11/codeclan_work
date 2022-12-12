var userName = 'Bill';


var secretsFunction = function () {
    var pinCode = [1,2,3,3]
    // console.log('pin code inside function: ', pinCode, 'user:', userName);
}



secretsFunction();
// console.log(pinCode, userName);

// var filterNamesByFirstLetter = function (names, letter) {
//     var filteredNames = [];
//     for (let name of names) {
//         if (name[0] === letter) {
//             filteredNames.push(name);
//         }
//     }
//     console.log('name is now: ', name)
//     return filteredNames
// }

// var students = ['Alan', 'Ben', 'Chris', 'David'];
// var filteredStudents = filterNamesByFirstLetter(students, 'C');
// console.log(filteredStudents)

let isItFive = function (number) {
    let result;
    
    if (number === 5) {
        result = true;
    } else {
        result = false;
    }
    return result;
}
