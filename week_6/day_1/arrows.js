// FUNCTION DECLARATION (NAMED FUNCTIONS)
function addFunction(num1, num2) {
    return num1 + num2;
}

//FUNCTION EXPRESSION

var add = function addFunction (firstNum, secondNum) {
    return firstNum + secondNum;
}

// ARROW FUNCTION
var addArrowFunc = (firstNum, secondNum) =>{
    return firstNum + secondNum;
}

// ARROW FUNCTION - implicit return if no curly braces. code in one line
var addArrowFunc = (firstNum, secondNum) => firstNum + secondNum
    
var result = addArrowFunc(1,2)
console.log(result);