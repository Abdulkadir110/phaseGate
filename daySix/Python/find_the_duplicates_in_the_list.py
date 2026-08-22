def countNumberOfDuplicatesIn(list) :
    duplicateCounter = 0;
    duplicates_list = []
    for index in range(len(list)):
        duplicateCounter = 1;
        for secondIndex in range(index +1, len(list)):
            if list[index] == list[secondIndex] :
                duplicateCounter +=1
        
        if(duplicateCounter > 1) :
            duplicates_list.append(list[index])
        
    
    return duplicates_list;

numbers = [3,4,3,2,4,7]
print(countNumberOfDuplicatesIn(numbers))
