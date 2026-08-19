firstNumber = 5
secondNumber = 7
thirdNumber = 8

mean = firstNumber + secondNumber + thirdNumber / 3 ;

if firstNumber >= secondNumber and secondNumber >= thirdNumber:
    print("firstNumber")

elif firstNumber >= secondNumber and thirdNumber >= secondNumber:
    print("thirdNumber")

elif secondNumber >= firstNumber and firstNumber >= thirdNumber:
    print("firstNumber")

elif secondNumber >= thirdNumber and thirdNumber >= firstNumber :
    print("thirdNumber")

elif thirdNumber >= firstNumber and firstNumber >= secondNumber :
    print("firstNumber")

elif thirdNumber >= secondNumber and secondNumber >= firstNumber :
    print("secondNumber")


print("The mean is: " , mean)



