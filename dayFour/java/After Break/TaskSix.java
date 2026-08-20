import java.util.Scanner;
public class TaskSix {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double number = 0;
        double sum = 0;
        double count = 0;
        for(int index = 1;  index <= 10; index++){
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            if(number % 2 == 0){
                count++;
                sum += number;
            }
        }
        double average = sum / count;
        System.out.println("average is: " + average);
        
    }
}

