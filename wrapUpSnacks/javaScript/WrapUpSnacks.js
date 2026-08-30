
function factorialOf(number) {
    let factorial = 1;
    for(let eachNumber = number; eachNumber >= 1; eachNumber--){
        factorial *= eachNumber
    }
    return factorial
}
const greatestCommonDivisorOf = function(firstNumber, secondNumber) {
    let divisor = 1
    let commonDivisor = 0;
    while (divisor <= firstNumber || divisor <= secondNumber) {
        if(firstNumber % divisor === 0 && secondNumber % divisor === 0) {
            commonDivisor = divisor
        }
        divisor++
    }
    return commonDivisor
}
const lowestCommonMultipleOf = function(firstNumber, secondNumber) {
    let commonDivisor = greatestCommonDivisorOf(firstNumber, secondNumber)
    return (firstNumber * secondNumber) / commonDivisor
}
function isPerfectNumber(number) {
    let total = 0
    let factor = 1
    while (factor < number) {
        if(number % factor == 0){
            total += factor
        }
        factor++
    }
    return total === number
}
const numberOfDigitsIn = function(number) {
    let count = 0
    while (number != 0) {
        let digit = number % 10
        count++
        number = Math.floor(number / 10)
    }
    return count
}
const isArmstrong = function(number) {
    const givenNumber = number
    let total = 0
    let exponient = numberOfDigitsIn(number)
    while(number != 0){
        let digit = number % 10
        total += digit ** exponient
        number = Math.floor(number / 10)
    }
    return total === givenNumber
}
const isStrong = function(number) {
    const givenNumber = number
    let total = 0
    while (number != 0){
        let digit = number % 10
        total += factorialOf(digit)
        number = Math.floor(number / 10)
    }
    return total === givenNumber
}
const isLeapYear = function(year) {
    if(year % 4 === 0) {
        if(year % 100 !== 0 || year % 400 === 0) {
            return true
        }
    }
    return false
}
console.log(factorialOf(5))
console.log(greatestCommonDivisorOf(18,12))
console.log(lowestCommonMultipleOf(18,12))
console.log(isPerfectNumber(6))
console.log(numberOfDigitsIn(416))
console.log(isArmstrong(153))
console.log(isStrong(145))
console.log(isLeapYear(2000))
console.log()
for(let number = 1; number <= 1000; number++){
    if(isArmstrong(number)) {
        console.log("Armstrong number --> " + number)
    }
}
console.log()
for(let number = 1; number <= 1000; number++){
    if(isPerfectNumber(number)) {
        console.log("Perfect number --> " + number)
    }
}
console.log()
for(let number = 1900; number <= 2025; number++){
    if(isLeapYear(number)) {
        console.log("Leap year --> " + number)
    }
}
console.log()
let leapYearCount = 0
for(let number = 1900; number <= 2025; number++){
    if(isLeapYear(number)) {
        leapYearCount++;
    }
}
console.log("The number of leap year between 1900 to 2025 is: " + leapYearCount)
