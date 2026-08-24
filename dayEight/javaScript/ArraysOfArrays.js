
function addElementsInEachArraysOf(numbers){
    let newArray = [];
    let newArrayIndex = 0;
    let total = 0;
    for(let index = 0; index < numbers.length; index++){
        total = 0;
        for(let secondIndex = 0; secondIndex < numbers[index].length; secondIndex++){
            total += numbers[index][secondIndex];
        }
        newArray.push(total);
    }
    return newArray;
}


