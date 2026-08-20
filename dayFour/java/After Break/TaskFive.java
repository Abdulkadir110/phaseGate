import java.util.Scanner;
public class TaskFive{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double number = 0;
        double sum = 0;
        for(int index = 1;  index <= 10; index++){
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            if(index % 2 == 0)sum += number;
        }
        System.out.println("sum is: " + sum);
        
    }
}

