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

    void deposit(int amount){
        if (amount != 0){
            balance += amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount){
        if (amount != 0){
            balance -= amount;
            previousTransaction = -amount;
        }
    }
}