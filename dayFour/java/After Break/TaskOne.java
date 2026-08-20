import java.util.Scanner;
public class TaskOne {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        for(int index = 1;  index <= 10; index++){
            System.out.print("Enter a number: ");
            number = input.nextInt();
            sum += number;
        }
        System.out.println("total is: " + sum);
        
    }
}
