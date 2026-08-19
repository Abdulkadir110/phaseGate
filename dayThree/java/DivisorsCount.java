public class DivisorsCount {
    public static void main(String[] args) {
    int number = 30;
    for (int divisor = 1; divisor <= number; divisor++) {
        if(number % divisor == 0){
            counter++;
        }
        
     }
     System.out.println(counter);
    }
}
