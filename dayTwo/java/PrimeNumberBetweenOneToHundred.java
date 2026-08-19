public class PrimeNumberBetweenOneToHundred {
    public static void main(String[] args){

        int num = 1;
        while(num <= 100) {
            if(isDivisibleByThree(num)){
                System.out.println("Skip");
                num++;
            }
            else {
                System.out.println(num);
                num++;
            }
        }
        
        
    }
    
    public static int sumTheDigitsOf(int number){
        int sum = 0;
        int digit = 0;
        
           while(number != 0){
               digit = number & 10;
               sum += digit;
               number /= 10;
           }
        
        return sum;
    }
    
    public static boolean isDivisibleByThree(int number){
       if(sumTheDigitsOf(sumTheDigitsOf(number)) % 3 == 0){
            return true;
       } 
       
      return false;
    }
  
}
