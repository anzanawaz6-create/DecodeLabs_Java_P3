import java.util.Scanner;

/**
 * Represents a bank account with basic operations
 * such as deposit, withdrawal, and balance inquiry.
 * Balance and account number are encapsulated (private)
 * to protect data integrity.
 */
class BankAccount {
    private double balance;
    private String accountNumber;

    /**
     * Creates a new BankAccount with the given initial balance
     * and account number.
     * @param balance initial balance of the account
     * @param accountNumber unique identifier for the account
     */
    BankAccount(double balance, String accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Balance : " + balance +
                "AccountNumber :" + accountNumber;
    }

    /**
     * Displays the current account balance.
     */
    public void checkBalance() {
        System.out.println(" Your Current Balance is : " + getBalance());
    }

    /**
     * Withdraws the specified amount from the account.
     * Rejects the transaction if the amount is invalid (<= 0)
     * or exceeds the current balance.
     * @param amount the amount to withdraw
     */
    public void withDrawCash(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount, must be greater than 0");
            return;
        }
        if (amount > balance) {
            System.out.println(" Transaction Failed");
            return;
        }
        setBalance(balance - amount);
    }

    /**
     * Deposits the specified amount into the account.
     * Rejects the transaction if the amount is invalid (<= 0).
     * @param amount the amount to deposit
     */
    public void depositBalance(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount, must be greater than 0");
            return;
        }
        setBalance(balance + amount);
    }
}

/**
 * ATM class provides a console-based interface for users
 * to interact with their BankAccount — deposit, withdraw,
 * and check balance — through a menu-driven loop.
 */
public class DecodeLabs_Java_P3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(20000, "Anza12345");
        Scanner sc = new Scanner(System.in);
        int choice;

        // Keep showing the menu until the user chooses to exit (option 4)
        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(" Enter Amount for Deposit");
                    double depositAmount = sc.nextDouble();
                    account.depositBalance(depositAmount);
                    break;
                case 2:
                    System.out.println(" Enter amount for withdraw ");
                    double amount = sc.nextDouble();
                    account.withDrawCash(amount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice, try again");
            }

        } while (choice != 4);
    }
}