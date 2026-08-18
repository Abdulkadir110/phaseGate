firstNumber = 5
secondNumber = 7
thirdNumber = 8

mean = firstNumber + secondNumber + thirdNumber / 3 ;
median = 0;

if firstNumber >= secondNumber and secondNumber >= thirdNumber:
    median = secondNumber;

elif firstNumber >= secondNumber and thirdNumber >= secondNumber:
    median = thirdNumber;

elif secondNumber >= firstNumber and firstNumber >= thirdNumber:
    median = firstNumber;

elif secondNumber >= thirdNumber and thirdNumber >= firstNumber :
    median = thirdNumber;

elif thirdNumber >= firstNumber and firstNumber >= secondNumber :
    median = firstNumber;

elif thirdNumber >= secondNumber and secondNumber >= firstNumber :
    median = secondNumber;


print("The mean is: " , mean)
print("The median is: ", median)


