
def addElementsInEachListOf(numbers):
    newArray = [];
    newArrayIndex = 0;
    total = 0;
    for index in range(len(numbers)):
        total = 0;
        for second_index in range(len(numbers[index])):
            total += numbers[index][second_index];

        newArray.append(total);

    return newArray;


