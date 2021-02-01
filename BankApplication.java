/**
 * @author Rhiana Thelemaque
 */

/**
 * Import packages
 */


public class BankApplication{

}

class BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    // Updating the account with the deposited amount.
    void deposit(int amount){
        // Only perform this if amount entered is not zero.
        if (amount != 0){
            balance += amount;
            previousTransaction = amount;
        }
    }

    // Updating the account with the withdrawn amount.
    void withdraw(int amount){
        // Only perform this if amount entered is not zero.
        if (amount != 0){
            balance -= amount;
            previousTransaction = -amount;
        }
    }

    // Shows the account holder the amount deposited or withdrawn in the most recent transaction.
    void getPreviousTransaction(){
        if (previousTransaction > 0){
            // If the account holder has deposited
            System.out.println("Amount deposited: " + previousTransaction);
        } else if (previousTransaction < 0){
            // If the account holder has withdrawn
            System.out.println("Amount withdrawn: " + previousTransaction);
        } else{
            // If there has been no transaction
            System.out.println("There was no transaction");
        }

        
    }
}