const prompt = require("prompt-sync")();
let number = 0;
let sum = 0;
let average = 0;
let count = 1;
while(count <= 10){
    let number = Number(prompt("Enter a number: "));
    if(number < 0 || number > 100){
        console.log("Invalid input(Enter number between 1 to 100)");
    }
    else {
    sum += number;
    }
    count++;
}
average = sum / count ;
console.log("average is: " +  average);


