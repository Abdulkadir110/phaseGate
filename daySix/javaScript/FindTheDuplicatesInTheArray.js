function theDuplicatesIn(array) {
    let duplicateCounter = 0;
    let duplicatesArray = [];
    let thirdIndex = 0;
    for(let index = 0; index < array.length; index++){
        duplicateCounter = 1;
        for (let secondIndex = 0; secondIndex < array.length; secondIndex++){
            if(array[index] == array[secondIndex]) {
              duplicateCounter++;  
            }
        }
        if(duplicateCounter > 1){
            duplicatesArray.push(array[index]); 
        }
    }
    return duplicatesArray;
}

let numbers = [2,3,4,5,4,3,2,4,5]
console.log(theDuplicatesIn(numbers));

