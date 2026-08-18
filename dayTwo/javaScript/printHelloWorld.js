let textOne = "Hello";
let textTwo = "World";
let interleaved = "";
let combined = "";

combined = textOne + textTwo;

for(let index = 0; index < 2; index++){
    interleaved += textOne.charAt(index);
    interleaved += textTwo.charAt(index);
}

for(let index = 2; index < 5; index++){
    interleaved += textTwo.charAt(index);
    interleaved += textOne.charAt(index);           
}

console.log(interleaved);

