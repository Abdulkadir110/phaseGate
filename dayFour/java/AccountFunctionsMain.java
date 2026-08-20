import java.util.Scanner;
public class AccountFunctionsMain{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double balance = 0.0;
        balance = AccountFunctions.checkBalance(balance);
        double newBalance = 0.0;
        double amount = 0.0;
        String transactions = "";
        int options = 0;
        while(options != 4){

            String MenuFunctions = """
                [1] Deposit Money
                [2] Withdraw Money
                [3] Show transactions history
                [4] Exit the program 
            """;
            System.out.println(MenuFunctions);
            
            System.out.print("Enter your choice: ");
            options = input.nextInt();
            
            switch(options){
                case 1 : {
                    System.out.print("Enter deposit amount: ₦");
                    amount = input.nextDouble();
                    newBalance = AccountFunctions.deposit(amount, balance, "");
                    System.out.printf("Deposited: ₦%.2f | New Balance: ₦%.2f%n", amount, newBalance);
                    break;
                }
                case 2 : {
                    System.out.print("Enter withdrawal amount: ₦");
                    amount = input.nextDouble();
                    balance = newBalance;
                        if (amount > balance) {
                            System.out.println("Withdrawal failed: insufficent funds");
                            break;
                        }
                    newBalance = AccountFunctions.withdraw(amount, balance, "");
                    System.out.printf("Withdrew: ₦%.2f | New Balance: ₦%.2f%n", amount, newBalance);
                    break;
                }
                case 3 : {
                    
                    break;
                }
                case 4 : {
                    balance = newBalance;
                    System.out.printf("Final Balance: ₦%.2f%n", balance);
                    System.out.println("Thank you for using Transaction Log App!");
                    break;
                }
            }
       }
            
   }
            
}

