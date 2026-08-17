import java.util.Scanner;
public class GreetingsAndDate {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = inputCollector.next();

        System.out.println("\"My name is \"" + name + "\"\"\n\"Today is 17/08/2026\"");
       
    }
}
