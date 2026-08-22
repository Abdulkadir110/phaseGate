

function replaceNegativesIn(numbers){
    for(let index = 0; index < numbers.length; index++){
        if(numbers[index] < 0){
            numbers[index] = 0;
        }
    }
    return numbers;
}

let numbers = [2,-3,4,-7,9,-3];
console.log(replaceNegativesIn(numbers));
