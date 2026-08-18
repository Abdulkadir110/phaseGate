public class PrimeNumberBetweenOneToHundred {
    public static void main(String[] args){
        int count = 1;
        int num = 2;
        while(num <= 100) {
            if(isPrime(num) && isDivisibleByThree(num)){
                System.out.println(num);
                num++;
            }
            else {
                num++;
            }
        }
        
        
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
    
    public static boolean isDivisibleByThree(int number){
       if(sumTheDigitsOf(number) % 3 == 0){
            return true;
       } 
       
      return false;
    }
  
}
