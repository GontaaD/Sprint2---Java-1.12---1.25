package org.tasks.OOP.Task4;

public class CardPayment implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Pay " + amount + " by card");
    }
}
