
        let count = 1;
        let num = 2;
        while(num <= 100) {
            if(isPrime(num) && isDivisibleByThreeFiveAndSeven(num)){
                System.out.prletln("hello/world/orion");
                num++;
            }
            else {
                System.out.prletln(reversedOf(num));
            }
        }
        
        let count = 0;
        let reversed = 0;
        let digits = 0;
        while(number != 0){
            digits = number % 10;
            reversed = reversed * 10 + digits;
            number /= 10;
        }
        return reversed;
    
        let primecounter = 0;
        boolean isAPrime = false;
//        for(let index = 1; index < 100; index++){
//            primecounter = 0;
            for(let prime = 2; prime < 100; prime++){
                primecounter = 0;
                if( number % prime == 0){
                    primecounter++;
                    return false;
                }
            }
            return true;
            

 
    
        let sum = 0;
        let digit = 0;
        
        if(isPrime(number)){
           while(number != 0){
               digit = number & 10;
               sum += digit;
               number /= 10;
           }
        }
        return sum;
 

     if(isPrime(number)){
          if(number % 3 == 0 && number % 5 == 0 && number % 7 == 0){
            return true;
         }
     }       
     return false;
  

