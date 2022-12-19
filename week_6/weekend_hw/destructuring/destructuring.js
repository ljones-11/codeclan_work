const names = ['Fred', 'George', 'Harry', 'Ron', 'Peter' ];
console.log(names);

// const fred = names[0];
// const george = names[1];
// console.log(george);

const [fred, george, ...remainingNames] = names;
console.log(remainingNames);

const person = {
    name: 'Joni',
    age: 76
}

const { name, age } = person;

console.log(name, age)