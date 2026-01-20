package org.tasks.OOP.Task4;

public class Main {
    public static void main(String[] args){
        Payment payment1 = new CardPayment();
        Payment payment2 = new CashPayment();
        payment1.pay(125.2);
        payment2.pay(21);
    }
}
