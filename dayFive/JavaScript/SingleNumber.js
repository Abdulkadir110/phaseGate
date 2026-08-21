function theSingleNumberIn(numbers){
    let singleNumber = 0;
    let duplicateCounter = 0;
    for (let index = 0; index < numbers.length; index++){
        duplicateCounter = 0;
        for(let secondIndex = 0; secondIndex < numbers.length; secondIndex++){
            if(numbers[index] == numbers[secondIndex]){
                duplicateCounter++;
            }
        }
        if(duplicateCounter == 1){
            singleNumber = numbers[index];
        }
    }
    return singleNumber;
}

let list = [4,1,1,2,2]

console.log(theSingleNumberIn(list));
