let firstNumber = 5;
let secondNumber = 8;
let thirdNumber = 7;

let mean = (firstNumber + secondNumber + thirdNumber) / 3 ;


if(firstNumber >= secondNumber && secondNumber >= thirdNumber){
    console.log("secondNumber")
}
else if(firstNumber >= secondNumber && thirdNumber >= secondNumber){
    console.log("thirdNumber")
}
else if(secondNumber >= firstNumber && firstNumber >= thirdNumber){
    console.log("firstNumber")
}
else if(secondNumber >= thirdNumber && thirdNumber >= firstNumber) {
    console.log("thirdNumber")
}
else if(thirdNumber >= firstNumber && firstNumber >= secondNumber) {
    console.log("firstNumber")
}
else if(thirdNumber >= secondNumber && secondNumber >= firstNumber) {
    console.log("secondNumber");
}


console.log("The mean is: " , mean);
