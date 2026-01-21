package org.tasks.Enum;

public class Task1 {
    enum TaxZone {
        USA(0.21),
        EU(0.25),
        UK(0.20),
        ASIA(0.18);

        private final double taxRate;

        TaxZone(double taxRate) {
            this.taxRate = taxRate;
        }

        public double getTaxRate() {
            return taxRate;
        }

    }

    class Invoice {
        private final double amount;
        private final TaxZone taxZone;

        public Invoice(double amount, TaxZone taxZone) {
            this.amount = amount;
            this.taxZone = taxZone;
        }

        public double getAmount() {
            return amount;
        }

        public TaxZone getTaxZone() {
            return taxZone;
        }
    }
}