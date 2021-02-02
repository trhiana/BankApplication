/**
 * @author Rhiana Thelemaque
 */


/**
 * Import packages
 */
import java.util.Scanner;

public class BankApplication{
    public static void main(String[] args) {
        BankAccount obj = new BankAccount ("Rhiana", "A0108");
        obj1.showMenu();
    }
}

class BankAccount{
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    // Bank account information
    BankAccount(String cname, String cid){
        customerName = cname;
        customerId = cid;
    }

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
            System.out.println("Amount withdrawn: " + Math.abs(previousTransaction));
        } else{
            // If there has been no transaction
            System.out.println("There was no transaction.");
        }        
    }

    // Displaying welcome message and menu
    void showMenu(){
        char option = '\0';
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerId); 
        System.out.println("\n");
        System.out.println("A. Check Balance.");
        System.out.println("B. Deposit.");
        System.out.println("C. Withdraw.");
        System.out.println("D. Previous Transaction.");
        System.out.println("E. Exit.");

        // Account holder selects option from the above 
        do{
            System.out.println("=============================================================");
            System.out.println("Enter an option: ");
            System.out.println("=============================================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch(option){
                // Check balance
                case 'A':
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Account balance: " + balance);
                    System.out.println("-----------------------------------------------------");
                    System.out.println("\n");
                    break;
                
                // Deposit
                case 'B':
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Enter amount to deposit: ");
                    System.out.println("-----------------------------------------------------");
                    int amount = scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                
                // Withdraw
                case 'C':
                    System.out.println("-----------------------------------------------------");
                    System.out.println("Enter amount to withdraw: ");
                    System.out.println("-----------------------------------------------------");
                    int amountTwo = scanner.nextInt();
                    deposit(amountTwo);
                    System.out.println("\n");
                    break;
                
                // Previous transaction
                case 'D':
                    System.out.println("-----------------------------------------------------");
                    getPreviousTransaction();
                    System.out.println("-----------------------------------------------------");
                    System.out.println("\n");
                    break;
                
                // If input is not in the given options
                default:
                    System.out.println("Invalid selection! Please enter another option.");
                    break;

            }

        } while (option != 'E');

        System.out.println("Thank you for using our services!");
    }
}