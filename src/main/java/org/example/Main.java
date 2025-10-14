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


    }
}
