public class palindromePrime{
    public static boolean isPalindromePrime(int number){
        int primecounter = 0;
        boolean isPalindromeAndPrime = false;
            for(int prime = 2; prime < number * number; prime++){
                if((number % 10 == 0 && (number /10000) % 10)) && ((number % 1000 == 0 && (number % 10) / 10))){
                    if( index % prime == 0){
                        primecounter++;
                        isPalindromeAndPrime = false;
                    }
                }
            if(primecounter == 2){
                isPalindromeAndPrime = true;
            }

        return isPalindromeAndPrime;        

    }
    
    
}
