package org.tasks.Enum;

public class Task2 {
    enum Currency {
        USD(1.0),
        EUR(1.1),
        GBP(1.3),
        JPY(0.009);

        private final double rateToUsd;

        Currency(double rateToUsd) {
            this.rateToUsd = rateToUsd;
        }

        public double getRateToUsd() {
            return rateToUsd;
        }
    }
    class AccountBalance {
        private final double amount;
        private final Currency currency;

        public AccountBalance(double amount, Currency currency) {
            this.amount = amount;
            this.currency = currency;
        }

        public double getAmount() {
            return amount;
        }

        public Currency getCurrency() {
            return currency;
        }

        public double toUsd() {
            return amount * currency.getRateToUsd();
        }
    }
}
