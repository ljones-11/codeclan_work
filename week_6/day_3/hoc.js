const myNumbers = [1,2,3,4];

// for (const number of myNumbers){
//     console.log(`Number was: ${number}`);
// }

// myNumbers.forEach((element) => {
//     console.log(`Number was: ${element}`);
// });

// const myNumberFunction = (number) => {
//     console.log(`Number was: ${number}`);
// };
// myNumbers.forEach(myNumberFunction);

// myNumbers.forEach((number, index) => {
//     console.log(`Next number was ${number} at ${index}`);

// });

// const myNumberFunction = (number, index) => {
//     console.log(`Next number was ${number} at ${index}`);

// };

// myNumbers.forEach(myNumberFunction);


const multiplyByTwo = function (numbers) {
    const multipliedNums = [];

    // we pass a claaback to the forEach method
    numbers.forEach(number => {
        const multipliedNum = number * 2;
        multipliedNums.push(multipliedNum)

    });

    return multipliedNums
}




// write a function called 'getEvens' that accepts an array of numbers and returns all the even numbers

const getEvens = function (numbers) {
    const evenNums = [];

    numbers.forEach((number) => {
        if (number % 2 === 0) {
            evenNums.push(number);
        } 
        
    });
    return evenNums
}

console.log('Numbers before multiplications: ', myNumbers);
console.log('Even numbers: ', getEvens(myNumbers));