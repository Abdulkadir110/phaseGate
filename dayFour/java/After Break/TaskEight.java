import java.util.Scanner;
public class TaskEight {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int count = 1;
        while(count <= 10){
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if(number < 0 || number > 100){
                System.out.println("Invalid input(Enter number between 1 to 100)");
            }
            else {
            sum += number;
            count++;
            }
        }
        System.out.println("sum is: " +  sum);
        
    }
}
