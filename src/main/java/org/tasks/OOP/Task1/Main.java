package org.tasks.OOP.Task1;

public class Main {
    public static void main(String[] args){
        BankAccount account = new BankAccount("Bohdan", 0);
        System.out.println(account.getAccountNumber());
        System.out.println(account.getBalance());
        account.deposit(155.35);
        System.out.println(account.getBalance());
        account.withdraw(45.75);
        System.out.println(account.getBalance());
        account.deposit(-48.78);
        System.out.println(account.getBalance());
        account.withdraw(-500);
        System.out.println(account.getBalance());
    }
}
