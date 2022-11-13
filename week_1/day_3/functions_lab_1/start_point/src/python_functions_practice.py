def return_10():
    return 10

def add(num1, num2):
    return num1 + num2

def subtract(num1, num2):
    return num1 - num2

def multiply(num1, num2):
    return num1 * num2

def divide(num1, num2):
    return num1 / num2

def length_of_string (num):
    return len(num)

def join_string (string_1, string_2):
    return string_1 + string_2

def add_string_as_number(string_1, string_2):
    sum = int(string_1) + int(string_2)
    return sum

def number_to_full_month_name(num_of_month):
    months = { 1:"January",
                    2:"Febuary",
                    3:"March",
                    4:"April",
                    5:"May",
                    6:"June",
                    7:"July",
                    8:"August",
                    9:"September",
                    10:"October",
                    11:"Novemeber",
                    12:"December"
    }

    return months[num_of_month] #num_of_months KEY points to month within dictionary

def number_to_short_month_name(num_of_month):

    #convert to month name first
   
    months = { 1:"January",
                    2:"Febuary",
                    3:"March",
                    4:"April",
                    5:"May",
                    6:"June",
                    7:"July",
                    8:"August",
                    9:"September",
                    10:"October",
                    11:"Novemeber",
                    12:"December"
    }

    #then return first three characters
    full_month = months[num_of_month]
    
    short_month = full_month[:3]
    return short_month

def volume_of_cube(length):
    return (length * length * length)

def reverse_string(word):
    
    reverse_string = word[::-1]
    return reverse_string

def fahrenheit_to_celsius(fahrenheit):
    celsius = fahrenheit * 1.8
    return celsius
    
def manipulate(num):
    num += 10
    print(num)

manipulate(10)