function MoveAllZeroIn(numbers){
    
    for(let index = 0; index < numbers.length; index++){
        for(let secondIndex = index + 1; secondIndex < numbers.length; secondIndex++){
            if(numbers[index] < numbers[secondIndex]){
                let temp = numbers[index];
                numbers[index] = numbers[secondIndex];
                numbers[secondIndex] = temp;
            }
        }
    }
    return numbers;
}
let numbers = [5,0,2,0,3,0];
console.log(MoveAllZeroIn(numbers))
