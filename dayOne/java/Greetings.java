import java.util.Scanner;
public class Greetings {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = inputCollector.next();
        
        System.out.println();
        System.out.println("Hello, " + name);
    }
}
