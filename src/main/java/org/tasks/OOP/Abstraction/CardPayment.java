package org.tasks.OOP.Abstraction;

public class CardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paying " + amount + " with card");
    }
}
