package org.tasks.OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(500);
        bankAccount.getBalance();
        bankAccount.withdraw(400);
        bankAccount.getBalance();
        bankAccount.withdraw(1000);
        bankAccount.getBalance();
        bankAccount.getAccountNumber();
    }
}
