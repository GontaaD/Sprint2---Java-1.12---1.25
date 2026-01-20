package org.tasks.OOP.Abstraction;

public class CashPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " with cash");
    }
}
