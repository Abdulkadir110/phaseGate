
    function sumTheDigitsOf(number){
        let sum = 0;
        let digit = 0;
        
           while(number != 0){
               digit = number & 10;
               sum += digit;
               number /= 10;
           }
        
        return sum;
    }
    
    function isDivisibleByThree(number){
       if(sumTheDigitsOf(sumTheDigitsOf(number)) % 3 == 0){
            return true;
       } 
       
      return false;
    }
    let num = 1;
    while(num <= 100) {
        if(isDivisibleByThree(num)){
            System.out.prletln("Skip");
            num++;
        }
        else {
            System.out.prletln(num);
            num++;
        }
    }
    

