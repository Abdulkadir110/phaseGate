const prompt = require("prompt-sync")();
let number = 0;
let sum = 0;

for(let index = 1;  index <= 10; index++){
    let number = Number(prompt("Enter a number: "));
    if (index % 2 == 0) {
        sum += number;
    }
}

console.log("sum is: ", sum);


