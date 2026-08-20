const prompt = require("prompt-sync")();
let number = 0;
let sum = 0;
let average = 0;
for(let index = 1;  index <= 10; index++){
    let number = Number(prompt("Enter a number: "));
    sum += number;
}
average = sum / 10;
console.log("sum is: ", sum);
console.log("average is: ", average);

