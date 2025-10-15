package org.example;


import java.util.Scanner;

//Account Class: Track account number, owner name, and balance.
// User class (login)
class User{
    private String userName;
    //String password;
    private Account userAccount;

    User(String userName){
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String username) {
        this.userName = username;
    }
}

// Account class
class Account{

    private int accountNumber;
    private String ownerName;
    private double balance=0.0 ;

    Account(User user){
        this.accountNumber = (int)(Math.random()*1000000);
        this.ownerName = user.getUserName();
        System.out.println("Your account number is:" + accountNumber);
        System.out.println("Your account balance " + balance);
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    public void withdraw(double withdrawAmount) {
        if(withdrawAmount<0) {
            System.out.println("Invalid Input");
        } else if(withdrawAmount<this.balance){
            this.balance -= withdrawAmount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount>0) {
            this.balance += depositAmount;
        } else {
            System.out.println("Invalid input! Enter positive amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: "+ this.balance);
    }
}

public class Main {
    static void main() {
        System.out.println("Welcome to the ATM Simulator");
        // Account Class: Track account number, owner name, and balance.

        System.out.println("Enter the User name : ");
        Scanner scanner = new Scanner(System.in);
        String userName= scanner.nextLine();

        User user = new User(userName);
        System.out.println("Welcome " + user.getUserName());

        Account account = new Account(user);
        //System.out.println("Your account number is:" + account.getAccountNumber());
        //System.out.println("Your account number is:" + account.getAccountNumber());
        int choice = -1;

        while(choice!=4) {
            System.out.println("====ATM MENU====");
            System.out.println("Choose an option: ");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Quit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter the withdrawal amount");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Enter valid input");
            }
        }
    }
}
