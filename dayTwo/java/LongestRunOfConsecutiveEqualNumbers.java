public class LongestRunOfConsecutiveEqualNumbers {
    public static void main(String[] args){
       int length = 0;
       long number = 1122333123l;
       long digit = 0;
            while(number != 0){
            digit = number % 10;
            nextDigit = (number % 10) / 10;
                if(digit == nextDigit){
                    length++;
                    
                }
            number /= 10;
            System.out.println(digit + length);
       }
    }

}
