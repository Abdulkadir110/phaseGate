public class HelloWorldWithPrimes {
    public static void main(String[] args){

        int num = 1;
        while(num <= 100) {
            if( num % 3 == 0) {
                System.out.println("hello");
            }
            else if(num % 5 == 0){
                System.out.println("world");
            }
            else if(num % 7 == 0) {
                System.out.println("orion");
            }
            else {
                System.out.println(reversedOf(num));
            }
            num++;
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

}
