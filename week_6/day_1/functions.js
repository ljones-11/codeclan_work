// FUNCTION DECLARATION - (NAMED FUNCTIONS)
function sayHello(salutation, greetingName = 'World') { // World is a default parameter - always keep a default parameter last.
    return `${salutation} ${greetingName}`;
}

// var value = sayHello('Welcome', 'Lee');
// console.log(value);

// FUNCTION EXPRESSION
var add = function addFunction (firstNum, secondNum) {
    return firstNum + secondNum;
}

// ANONYMOUS FUNCTION EXPRESSION
var add = function (firstNum, secondNum) {
    return firstNum + secondNum;
}

console.log(add(1,3));