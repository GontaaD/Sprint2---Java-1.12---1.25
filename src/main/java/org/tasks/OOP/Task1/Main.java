package org.tasks.OOP.Task1;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("#23113",0);
        System.out.println("Bank account number: " + bankAccount.getAccountNumber());
        System.out.println("Current balance: " + bankAccount.getBalance());

        bankAccount.deposit(3000);
        System.out.println("Current balance: " + bankAccount.getBalance());

        bankAccount.deposit(-3000);
        System.out.println("Current balance: " + bankAccount.getBalance());

        bankAccount.withdraw(4000);
        System.out.println("Current balance: " + bankAccount.getBalance());

        bankAccount.withdraw(-2000);
        System.out.println("Current balance: " + bankAccount.getBalance());

        bankAccount.withdraw(2000);
        System.out.println("Current balance: " + bankAccount.getBalance());
    }
}