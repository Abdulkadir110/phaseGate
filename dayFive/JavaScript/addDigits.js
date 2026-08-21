
function addTheDigits(number){
    let addDigits = 0;
    let digit = 0;
    let digitSum = 0;
    while (number != 0){
        digit = number % 10;
        addDigits = addDigits + digit;
       
        number /= 10;
    }
    if(addDigits >= 10){
        while(addDigits != 0){
            digit = addDigits % 10;
            digitSum = digitSum + digit;
            
            addDigits /= 10;

        }
    }
    else{
        digitSum = addDigits;
    }
    Math.floor(digitSum)
    
    return digitSum;
}
console.log(addTheDigits(38))
