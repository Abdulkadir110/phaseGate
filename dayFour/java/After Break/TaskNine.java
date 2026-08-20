import java.util.Scanner;
public class TaskNine {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int count = 1;
        while(count <= 10){
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if(number >= 0 && number <= 100){
                sum += number;
               
            }
            count++;
        }
        System.out.println("sum is: " +  sum);
        
    }
}
