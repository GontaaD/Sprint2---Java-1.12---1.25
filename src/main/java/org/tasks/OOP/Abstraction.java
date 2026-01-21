package org.tasks.OOP;

public class Abstraction {
    interface Payment {
        void pay(double amount);
    }

    class CardPayment implements Payment {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " by card");
        }
    }

    class CashPayment implements Payment {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " in cash");
        }
    }

}
