def theSingleNumberIn(numbers) :
    singleNumber = 0;
    duplicateCounter = 0
    length = len(numbers)
    for index in range(length):
        duplicateCounter = 0;
        for secondIndex in range(length):
            if(numbers[index] == numbers[secondIndex]):
                duplicateCounter += 1
            
        
        if duplicateCounter == 1 :
            return numbers[index];
        
        
    
    
print(theSingleNumberIn([1]))
