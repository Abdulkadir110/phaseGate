import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
        double depositAmount = 5000;
        double expected = AccountFunctions.deposit(depositAmount, 0.0, "");
        double actual = 5000;
        
        assertEquals(expected, actual);
    }
    public void testThatWithdrawIsDeductedFromTheUpdatedBalance() {
        double withdrawAmount = 2000;
        double expected = AccountFunctions.withdraw(withdrawAmount, balance, transactions);
        double actual = 3000;
        
        assertEquals(expected, actual);
    }
    
}
