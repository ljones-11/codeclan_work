// const getEvens = function (arrayOfNums) {
//     const evenNumbers = [];

//     arrayOfNums.forEach((number) => {
//         // % operator (aka Mod or Modulo) works by dividing the LHS value with the RHS
//         // value and determining the remainder - if it comes out as 0, the LHS must divide
//         // exactly by the RHS
//         if (number % 2 === 0) {
//             evenNumbers.push(number);
//         }
//     });

//     return evenNumbers;
// }

const getEvens = function (arrayOfNums) {
    const evenNums = arrayOfNums.filter((number) => {

        return (number % 2 ===0);

        // is the equivalent to
        // if (number % 2 === 0) {
        //     return true;
        // } else {
        //     return false;
        // }

    });

    return evenNums
}

const numbers = [1,2,3,4,5,6,7,8,9]
console.log('Even numbers: ', getEvens(numbers))


const getOdds = function (arrayOfNums) {
    const oddNums = arrayOfNums.filter((number) => {

        return (number % 2 === 1);

        // is the equivalent to
        // if (number % 2 === 0) {
        //     return true;
        // } else {
        //     return false;
        // }

    });
    return oddNums
}

console.log('Odd numbers: ', getOdds(numbers))

