
function isPrime(number) {
    let primeCounter = 0;
    for(let index = 1; index <= number; index++){
        if(number % index == 0){
            primeCounter++;
        }
    }
    return primeCounter == 2;
}
function sortedArrayOf(numbers){
    
    for(let index = 0; index < numbers.length; index++){
        for(let secondIndex = index + 1; secondIndex < numbers.length; secondIndex++){
            if(numbers[index] > numbers[secondIndex]){
                let temp = numbers[index];
                numbers[index] = numbers[secondIndex];
                numbers[secondIndex] = temp;
            }
        }
    }
    return numbers;
}
function countNumberOfPrimesIn(numbers) {
    let count = 0;
    for(let index = 0; index < numbers.length; index++){
        if(isPrime(numbers[index])){
            count++;
        }
    }
    return count;
}
function arraysOfPrimesIn(numbers){
    let  primes = [];
    let  sortedArray = sortedArrayOf(numbers);
    let primesIndex = 0;
    for(let index = 0; index < sortedArray.length; index++){
        if(isPrime(sortedArray[index])){
            primes[primesIndex] = sortedArray[index];
            primesIndex++;
        }
    }
    return primes;
}
    
    
let numbers = [5,9,3,6,2]
console.log(arraysOfPrimesIn(numbers));

