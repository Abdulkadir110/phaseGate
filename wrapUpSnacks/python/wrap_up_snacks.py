def factorial_of(number):
    factorial = 1
    for each_number in range(number, 0, -1):
        factorial *= each_number
    return factorial
    
def greatest_common_divisor_of(first_number, second_number):
    divisor = 1
    common_divisor = 0
    while divisor <= first_number or divisor <= second_number :
        if first_number % divisor == 0 and second_number % divisor == 0 :
            common_divisor = divisor;
        divisor += 1
    return common_divisor
    
def lowest_common_multiple_of(first_number, second_number) :
    common_divisor = greatest_common_divisor_of(first_number, second_number)
    return (first_number * second_number) / common_divisor

def is_perfect_number(number):
    total = 0;
    factor = 1
    while factor < number :
        if number % factor == 0 :
            total += factor
        factor += 1
    return total == number
    
def count_number_of_digits_in(number) :
    digits_number = 0
    digit = 0
    while number != 0 :
        digit = number % 10
        digits_number += 1
        number //= 10
    return digits_number
    
def is_armstrong(number):
    given_number = number
    total = 0
    exponient = count_number_of_digits_in(number)
    while number != 0 :
        digit = number % 10
        total += digit ** exponient
        number //= 10
    return total == given_number

def is_strong(number):
    given_number = number
    total = 0
    while number != 0 :
        digit = number % 10
        total += factorial_of(digit)
        number //= 10
    return total == given_number

def is_leap_year(year) :
    if year % 4 == 0 :
        if year % 100 != 0 or year % 400 == 0 :
            return True 
    return False

