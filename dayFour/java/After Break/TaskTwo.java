import java.util.Scanner;
public class TaskTwo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double number = 0;
        double sum = 0;
        for(int index = 1;  index <= 10; index++){
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            sum += number;
        }
        double average = sum / 10;
        System.out.println("average is: " + average);
        
    }
}
