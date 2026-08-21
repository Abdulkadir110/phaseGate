

def addTheDigits(number) :
    addDigits = 0;
    digit = 0;
    digitSum = 0;
    while (number != 0) :
        digit = number % 10;
        addDigits = addDigits + digit;

        number //= 10;

    if addDigits >= 10 :
        while(addDigits != 0):
            digit = addDigits % 10;
            digitSum = digitSum + digit;
        
            addDigits //= 10;


    else :
        digitSum = addDigits;



    return digitSum;

print (addTheDigits(38));
