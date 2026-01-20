package org.tasks.OOP.Abstraction;

public class Main {
    public static void main(String[] args) {
        CardPayment cardPayment = new CardPayment();
        CashPayment cashPayment = new CashPayment();
        cashPayment.pay(500);
        cardPayment.pay(100.5);
    }
}
