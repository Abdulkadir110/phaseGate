

from unittest import TestCase

from account_functions import *

class Testaccount_functions(TestCase) :

    def testThatTheBalanceIsZero(self) :
        balance = 0.0
        actual = checkBalance(balance)
        expected = 0.0

        self.assertEqual(expected, actual)
    
    
    def testThatDepositedAmountIsEqualToBalance(self):
        balance = 0.0
        depositAmount = 5000
        balance = checkBalance(balance)
        actual = deposit(depositAmount,balance, "")
        expected = 5000

        self.assertEqual(expected, actual)
    
    
    def testThatWithdrawIsDeductedFromTheUpdatedBalance(self) :
        withdrawAmount = 2000
        balance = deposit(5000, 0.0, "" )
        actual = withdraw(withdrawAmount, balance, "")
        expected = 3000

        self.assertEqual(expected, actual)
    
    def testThatTheUserWithdrawedTwiceFromTheUpdatedBalance(self) :
        withdrawAmount = 2000
        balance = deposit(5000, 0.0, "" )
        first_withdraw = withdraw(withdrawAmount, balance, "")
        balance = checkBalance(first_withdraw)
        second_withdraw = withdraw(1000, balance, "")
 
        actual = checkBalance(second_withdraw)
        expected = 2000

        self.assertEqual(expected, actual)
    
    
    def testThatWithdrawalIsNotGreaterThanBalance(self) :
        withdrawAmount = 5000
        balance = 4000
        balance = checkBalance(balance)
        actual = withdraw(withdrawAmount, balance, "")
        expected = balance
        self.assertEqual(expected, actual)
        
    
    def testThatTheUserDepositedTwice(self) :
        balance = 0.0
        depositAmount = 5000;
        balance = checkBalance(balance)
        first_deposit = deposit(depositAmount,balance, "")
        balance = checkBalance(first_deposit)
        second_deposit = deposit(5000,balance, "")
        actual = checkBalance(second_deposit)
        expected = 10000
        self.assertEqual(expected, actual)
        
        
    def testThatTransactionsIsStoredInAllTransactionsArray(self) :
        depositAmount = 5000
        balance = 0.0
        balance = deposit(depositAmount, balance, "" )
        balance = checkBalance(balance)
        transactions = "Deposited: ₦" # + depositAmount + "| New Balance: ₦" + balance

        actual = showTransactions(transactions)
        expected = transactions

        self.assertEqual(expected, actual)
        
    
