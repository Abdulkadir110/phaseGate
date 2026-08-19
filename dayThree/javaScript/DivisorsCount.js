let number = 30;
let counter = 0
for (let divisor = 1; divisor <= number; divisor++) {
    if(number % divisor == 0){
        counter++;
    }
    
 }
console.log(counter)

