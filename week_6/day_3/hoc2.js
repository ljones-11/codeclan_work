const addNums = function (arrayofNums) {
    let sum = 0;


    // for(const number of arrayofNums) {
    //     sum += number;
    // }
    
    arrayofNums.forEach((number) => {
        sum+= number;
    });

    return sum;
}

