package org.tasks.OOP.Task4;

public class Main {
    public static void main(String[] args) {
        Payment pay1 = new CashPayment();
        Payment pay2 = new CardPayment();

        pay1.pay(300);
        pay1.pay(500);
    }
}
