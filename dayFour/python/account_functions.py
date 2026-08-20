
def checkBalance( balance) :
    return balance;

def deposit(amount,balance, transactions) :
    newBalance = 0.0;
    newBalance = balance + amount;
    balance = newBalance;

    return newBalance;
    
def withdraw(amount,balance, transactions) :
    newBalance = balance;
    if(amount <= balance) :
        newBalance = balance - amount;

    return newBalance;

def store_transaction(amount, balance):

    transactions = [amount, balance];


def showTransactions( transactions):

    return transactions;
        
    

