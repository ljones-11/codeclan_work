function sumOfArray(array) {

    var total = 0;

    for (var value of array) {
        
        total += value;
    
    }
    return total;
}

var array1 = [1,2,3,4,5,6];
console.log(sumOfArray(array1));


var stringPresent = function (string, object) {
    //loop through object and return true if string is present. else false

    for (var key in object) {
        if(key === string) {
            return true;
        }
}
return false;
}

var person = {
    name: 'Ben', 
    colour: 'green'
};

var key = 'name';
var wasPresent = stringPresent(key, person);
console.log(wasPresent)
