package org.tasks.OOP;
class Encapsulation {
    class BankAccount {

        private String accountNumber;
        private double balance;

        public BankAccount(String accountNumber) {
            this.accountNumber = accountNumber;
            this.balance = 0;
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println("Invalid deposit amount");
                return;
            }
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount <= 0 || amount > balance) {
                System.out.println("Invalid withdrawal amount");
                return;
            }
            balance -= amount;
        }

        public double getBalance() {
            return balance;
        }
    }
}

