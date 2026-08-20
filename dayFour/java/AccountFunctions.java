public class AccountFunctions {

    public static double checkBalance(double balance) {
        return balance;
    }
    public static double deposit(double amount, double balance, String transactions) {
        double newBalance = 0;
        newBalance = balance + amount;
        balance = newBalance;
        
        transactions = "Deposited: ₦" + amount + "| New Balance: ₦" + balance;

        return balance;
    }
    public static double withdraw(double amount, double balance, String transactions) {
        double newBalance = 0;
        if(amount <= balance) {
            newBalance = balance - amount;
            balance = newBalance;
        }

        
        transactions = "Withdrew: ₦" + amount + "| New Balance: ₦" + balance;
        
        return balance;
    }
}
