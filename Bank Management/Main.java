import java.util.ArrayList;
import java.util.Scanner;

class Bank_Function {
    private String cname;
    private long acc_num;
    private long c_phone_number;
    private int acc_bal;
    private String username;
    private String password;

    // Static ArrayList to store multiple accounts
    private static ArrayList<Bank_Function> accounts = new ArrayList<>();

    // Default constructor
    public Bank_Function() {}

    // Method to authenticate user
    public boolean authenticate(Scanner sc) {
        System.out.print("Enter username: ");
        String enteredUsername = sc.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = sc.nextLine();

        // Find account with matching username and password
        for (Bank_Function account : accounts) {
            if (account.username.equals(enteredUsername) && account.password.equals(enteredPassword)) {
                System.out.println("Authentication successful!");
                return true;
            }
        }
        
        System.out.println("Invalid username or password. Please try again.");
        return false;
    }

    // Method to open an account
    public void openacc(Scanner sc) {
        // Create a new Bank_Function instance for each new account
        Bank_Function newAccount = new Bank_Function();
        
        System.out.print("Enter the name of customer: ");
        newAccount.cname = sc.nextLine();
        
        System.out.print("Enter the account number: ");
        newAccount.acc_num = sc.nextLong();
        sc.nextLine(); // Consume newline
        
        System.out.print("Enter username: ");
        newAccount.username = sc.nextLine();

        System.out.print("Enter password: ");
        newAccount.password = sc.nextLine();

        System.out.print("Enter the account balance: ");
        newAccount.acc_bal = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter the phone number: ");
        newAccount.c_phone_number = sc.nextLong();
        while (String.valueOf(newAccount.c_phone_number).length() != 10) {
            System.out.print("Invalid phone number. ");
            System.out.print("Enter a 10-digit phone number: ");
            newAccount.c_phone_number = sc.nextLong();
        }
        sc.nextLine(); // Consume newline
        
        // Add new account to the ArrayList
        accounts.add(newAccount);
        System.out.println("Account created successfully!\n");
    }

    // Method to print account details
    public void printacc() {
        System.out.println("\nAccount Details: Customer Name: " + cname + 
                            " | Account Number: " + acc_num + 
                            " | Account Balance: " + acc_bal);
    }

    // Method to change password
    public void changePassword(Scanner sc) {
        for (Bank_Function account : accounts) {
            System.out.print("Enter current username: ");
            String enteredUsername = sc.nextLine();
            
            System.out.print("Enter current password: ");
            String enteredPassword = sc.nextLine();

            if (account.username.equals(enteredUsername) && account.password.equals(enteredPassword)) {
                System.out.print("Enter new password: ");
                account.password = sc.nextLine();
                System.out.println("Password changed successfully.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    // Method to deposit money
    public void deposit(Scanner sc) {
        for (Bank_Function account : accounts) {
            System.out.print("Enter your username: ");
            String enteredUsername = sc.nextLine();
            
            if (account.username.equals(enteredUsername)) {
                System.out.print("\nEnter the amount to deposit: ");
                int deposit_amt = sc.nextInt();
                if (deposit_amt > 0) {
                    account.acc_bal += deposit_amt;
                    System.out.println("Deposit successful! New balance: " + account.acc_bal);
                } else {
                    System.out.println("Invalid deposit amount.");
                }
                return;
            }
        }
        System.out.println("Account not found.");
    }

    // Method to withdraw money
    public void withdraw(Scanner sc) {
        for (Bank_Function account : accounts) {
            System.out.print("Enter your username: ");
            String enteredUsername = sc.nextLine();
            
            if (account.username.equals(enteredUsername)) {
                System.out.print("\nEnter the amount to withdraw: ");
                int withdraw_amt = sc.nextInt();
                if (withdraw_amt > 0 && withdraw_amt <= account.acc_bal) {
                    account.acc_bal -= withdraw_amt;
                    System.out.println("Withdrawal successful! New balance: " + account.acc_bal);
                } else {
                    System.out.println("Invalid withdrawal amount or insufficient balance.");
                }
                return;
            }
        }
        System.out.println("Account not found.");
    }

    // Method to print all accounts
    public static void printAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts exist.");
            return;
        }
        System.out.println("\nAll Account Details:");
        for (Bank_Function account : accounts) {
            account.printacc();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank_Function bank = new Bank_Function();
        
        while (true) {
            System.out.println("\nBanking System Menu:");
            System.out.println("1. Open Account");
            System.out.println("2. Print Account Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Change Password");
            System.out.println("6. Final list of all accounts");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            switch (choice) {
                case 1 -> bank.openacc(sc);
                case 2 -> {
                    if (bank.authenticate(sc)) {
                        bank.printacc();
                    }
                }
                case 3 -> bank.deposit(sc);
                case 4 -> bank.withdraw(sc);
                case 5 -> bank.changePassword(sc);
                case 6 -> Bank_Function.printAllAccounts();
                case 7 -> {
                    System.out.println("Exited Successfully");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
        }
    }
}