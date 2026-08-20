import java.util.Scanner;
public class TaskTen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double number = 0;
        double sum = 0;
        double averagecount = 0;
        int count = 1;
        while(count <= 10){
            System.out.print("Enter a number: ");
            number = input.nextDouble();
            if(number >= 0 && number <= 100){
                sum += number;
                averagecount++;
            }
            count++;
        }
        double average = sum / averagecount;
        System.out.println("average is: " +  average);
        
    }
}
