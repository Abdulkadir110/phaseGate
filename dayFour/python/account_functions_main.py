
from account_functions import *
      
balance = 0.0
balance = checkBalance(balance)
newBalance = 0.0
amount = 0.0
transactions = ""
options = 0
while options != 4 :

    MenuFunctions = """
        [1] Deposit Money
        [2] Withdraw Money
        [3] Show transactions history
        [4] Exit the program 
    """
    print(MenuFunctions)
    
    options = int(input("Enter your choice: "))
    
    
    match options :
        case 1 : 
            amount = float(input("Enter deposit amount: ₦"))
            newBalance = deposit(amount, balance, "")
            print(f"Withdrew: ₦{amount} | New Balance: ₦{newBalance}")
            store_transaction(amount, balance)
        
        case 2 : 
            withdraw = float(input("Enter withdrawal amount: ₦"))
            balance = newBalance
            if amount > balance :
                print("Withdrawal failed: insufficent funds")
                break
                
            newBalance = withdraw(amount, balance, "")
            print(f"Withdrew: ₦{amount} | New Balance: ₦{newBalance}")

        
#        case 3 : 
            
        
        case 4 : 
            balance = newBalance
            print(f"Final Balance: ₦{balance}")
            print("Thank you for using Transaction Log App!")
            break

    
       

