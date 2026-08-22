def replaceNegativesIn(list):
    for index in range(len(list)):
        if list[index] < 0 : list[index] = 0
    return list
 
numbers = [2,-3,4,-5,6,-7,8,-9]
print(replaceNegativesIn(numbers))
