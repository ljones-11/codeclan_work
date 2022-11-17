def fizzbuzz(input):
    
    # if input % 3 == 0 and input % 5 ==0:
    #     return "Fizzbuzz"
    # if input % 3 == 0:
    #     return "Fizz"
    # if input % 5 == 0:
    #     return "Buzz"
    # return f"{input}, no Fizzbuzz"

    # refactoring

    div_by_3 = input % 3 == 0
    div_by_5 = input % 5 == 0

    if div_by_3 and div_by_5:
        return "Fizzbuzz"
    elif div_by_3:
        return "Fizz"
    elif div_by_5:
        return "Buzz"
    else:
        return f"{input}, no Fizzbuzz"


   