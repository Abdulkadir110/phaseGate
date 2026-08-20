import java.util.Scanner;
public class TaskTen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double number = 0;
        double sum = 0;
        int count = 1;
        while(count <= 10){
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            if(number < 0 && number < 100){
                System.out.println("Invalid input(Enter number between 1 to 100)");
            }
            else {
            sum += number;
            count++;
            }
        }
        double average = sum / count;
        System.out.println("average is: " +  average);
        
    }
}
