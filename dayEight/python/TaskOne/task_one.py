def isEven(number) :
   return number % 2 == 0;
def isOdd(number) :
    return number % 2 != 0;
def AddOneToEveryOddAndMultiplyEveryEvenIn(numbers) :
    newArray = []   
    for index in range(len(numbers)):
        if(isEven(numbers[index])) :
            newArray.append(numbers[index] * 2);
        elif(isOdd(numbers[index])):
            newArray.append(numbers[index] + 1);
    return newArray;

numbers = [5,4,3,2,1]

print(AddOneToEveryOddAndMultiplyEveryEvenIn(numbers))
