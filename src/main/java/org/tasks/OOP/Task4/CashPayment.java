package org.tasks.OOP.Task4;

public class CashPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.printf("Paid $%s in Cash.%n",amount);
    }
}
