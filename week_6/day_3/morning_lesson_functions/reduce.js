const arrayOfNums = [1,2,3,4]

const mySummingFunction = function(numbers) {
    const total = numbers.reduce((accumulator, currentElement) => {
        return accumulator + currentElement;
    }, 0); // this zero is what the accumulator starts at
    return total
}

console.log('Sum of numbers: ', mySummingFunction(arrayOfNums));