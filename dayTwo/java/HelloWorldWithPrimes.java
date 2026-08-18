public class HelloWorldWithPrimes {
    public static void main(String[] args){
        int count = 1;
        int num = 2;
        while(num <= 100) {
            if(isPrime(num) && isDivisibleByThreeFiveAndSeven(num)){
                System.out.println("hello/world/orion");
                num++;
            }
            else {
                System.out.println(reversedOf(num));
            }
        }
        
        
    }
    public static int reversedOf(int number){
        int count = 0;
        int reversed = 0;
        int digits = 0;
        while(number != 0){
            digits = number % 10;
            reversed = reversed * 10 + digits;
            number /= 10;
        }
        return reversed;
    }
    public static boolean isPrime(int number){
        int primecounter = 0;
        boolean isAPrime = false;
        for(int index = 1; index < 100; index++){
            primecounter = 0;
            for(int prime = 2; prime < 100; prime++){
                primecounter = 0;
                if( index % prime == 0){
                    primecounter++;
                    isAPrime = false;
                }
            }
            if(primecounter == 2){
                isAPrime = true
            }

         }
 
        return isAPrime        

    }
    
    public static int sumTheDigitsOf(int number){
        int sum = 0;
        int digit = 0;
        
        if(isPrime(number)){
           while(number != 0){
               digit = number & 10;
               sum += digit;
               number /= 10;
           }
        }
        return sum;
    }
    
    public static boolean isDivisibleByThreeFiveAndSeven(int number){
     if(isPrime(number)){
          if(number % 3 == 0 && number % 5 == 0 && number % 7 == 0){
            return true;
         }
     }       
     return false;
    }
  
}
