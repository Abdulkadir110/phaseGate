const prompt = require("prompt-sync")();
let number = 0;
let sum = 0;
let average = 0;
let count = 0;
for(let index = 1;  index <= 10; index++){
    let number = Number(prompt("Enter a number: "));
    if (number % 2 == 0) {
        sum += number;
        count++;
    }
}
average = sum / count;
console.log("average is: ", average);


