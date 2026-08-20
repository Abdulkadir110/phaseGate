import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestAccountFunctions {
    
    @Test
    public void testThatTheBalanceIsZero() {
        double balance = 0.0;
        double expected = AccountFunctions.checkBalance(balance);
        double actual = 0.0;
        
        assertEquals(expected, actual);
    }
    @Test
    public void testThatDepositedAmountIsEqualToBalance(){
        double balance = 0.0;
        double depositAmount = 5000;
        balance = AccountFunctions.checkBalance(balance);
        double expected = AccountFunctions.deposit(depositAmount,balance, "");
        double actual = 5000;
        
        assertEquals(expected, actual);
    }
    @Test
    public void testThatWithdrawIsDeductedFromTheUpdatedBalance() {
        double withdrawAmount = 2000;
        double balance = AccountFunctions.deposit(5000, 0.0, "" );
        double expected = AccountFunctions.withdraw(withdrawAmount, balance, "");
        double actual = 3000;
        
        assertEquals(expected, actual);
    }
    @Test
    public void testThatWithdrawalIsNotGreaterThanBalance() {
        double withdrawAmount = 5000;
        double balance = 4000;
        balance = AccountFunctions.checkBalance(balance);
        double expected = AccountFunctions.withdraw(withdrawAmount, balance, "");
        double actual = AccountFunctions.checkBalance(balance);
        
        assertEquals(expected, actual);
    }
    @Test
    public void testThatTransactionsIsStoredInAllTransactionsArray() {
        double depositAmount = 5000;
        double balance = 0.0;
        balance = AccountFunctions.deposit(depositAmount, balance, "" );
        balance = AccountFunctions.checkBalance(balance);
        String transactions = "Deposited: ₦"; // + depositAmount + "| New Balance: ₦" + balance;
        
        String expected = AccountFunctions.showTransactions(transactions);
        String actual = transactions;
        
        assertEquals(expected, actual);
    }    
}
