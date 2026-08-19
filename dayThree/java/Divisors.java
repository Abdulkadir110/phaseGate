public class Divisors {
    public static void main(String[] args) {
    int number = 30;
    for (int divisor = 1; divisor <= number; divisor++) {
        if(number % divisor == 0){
            System.out.println(divisor);
        }
        
     }
    }
}
