
let number =  1234;
let reverse = 0;
let digit = 0;
    while(true) {
        digit = number % 10;
        reverse = (reverse * 10) +  digit;
        number /= 10;
        
    }  
console.log(reverse); 
