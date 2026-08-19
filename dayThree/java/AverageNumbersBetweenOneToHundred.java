public class AverageNumbersBetweenOneToHundred {
    public static void main(String [] args){
       
       double average = 0;
       double sum = 0;

       for(int number = 1; number <= 100; number++){
            sum += number;

       }
       average = sum / 100;
       System.out.println(average);
    }
}
