package org.tasks.OOP.Encapsulation;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount() {
        this.accountNumber = "8r7834734r6844789r87r";
        this.balance = 100;
    }

    public void getBalance() {
        System.out.println(balance);
    }

    public void getAccountNumber() {
        System.out.println(accountNumber);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }  else {
            System.out.println("Amount is negative or 0");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("withdrawal must be greater than 0");
        } else if (this.balance - amount < 0) {
            System.out.println("Not enough funds");
        }  else {
            this.balance -= amount;
        }
    }
}