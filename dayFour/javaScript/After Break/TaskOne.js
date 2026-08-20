const prompt = require("prompt-sync")();
let number = 0;
let sum = 0;
for(let index = 1;  index <= 10; index++){
    let number = Number(prompt("Enter a number: "));
    sum += number;
}
console.log("total is: ", sum);

