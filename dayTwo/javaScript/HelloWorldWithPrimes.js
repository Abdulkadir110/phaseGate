
 
function reversedOf(number){
        let count = 0;
        let reversed = 0;
        let digits = 0;
            while(number != 0){
                digits = number % 10;
                reversed = reversed * 10 + digits;
                number /= 10;
            }
        return reversed;
}
 
let num = 1;
while(num <= 100) {
    if( num % 3 == 0) {
        console.log("hello");
    }
    else if(num % 5 == 0){
        console.log("world");
    }
    else if(num % 7 == 0) {
        console.log("orion");
    }
    else {
        console.log(reversedOf(num));
    }
    num++;
}


