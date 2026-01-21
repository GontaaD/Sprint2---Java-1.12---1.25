package org.tasks.OOP.Task1;

public class BankAccount {
    private String accountNumber;
    private double balance;


    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit amount: " + amount);
        } else {
            System.out.println("Desired deposit amount: " + amount + "\nAmount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            System.out.println("Desired withdrawal amount: " + amount + "\nNot enough funds in the account.");
        } else if (amount < 0) {
            System.out.println("Desired withdrawal amount: " + amount + "\nWithdraw amount must be greater than zero.");
        } else {
            balance -= amount;
            System.out.println("Cash withdrawn: " + amount);
        }
    }
}
