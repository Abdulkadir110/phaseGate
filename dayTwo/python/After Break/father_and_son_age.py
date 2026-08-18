def calculateTheNumberOfYears(fatherAge, sonAge) :
    twiceSonAge = sonAge * 2
    difference = fatherAge - twiceSonAge
    
    if difference < 0 :
        difference = difference * -1
        print(f"{difference} years ago")
    
    elif difference == 0:
        print("It will be this year")
    else:
        print(f"{difference} years from now")
    
            
print(calculateTheNumberOfYears(40, 18))


