package org.tasks.Enum.MultiCurrencyBalanceAuditor;

import java.util.Comparator;
import java.util.List;

public class Main {

    public enum Currency {
        USD(1.0),
        EUR(1.1),
        GBP(1.3),
        JPY(0.007);

        private final double value;

        Currency(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        List<AccountBalance> accountBalance = List.of(
                new AccountBalance(1000.0, Currency.USD),
                new AccountBalance(360.0, Currency.GBP),
                new AccountBalance(3560.5, Currency.EUR),
                new AccountBalance(2100.0, Currency.JPY)
        );

        accountBalance.stream()
                .max(Comparator.comparing(t -> t.getBalance() * t.getCurrency().getValue()))
                .ifPresent(t -> System.out.printf("Currency: %s, Amount: %s",
                        t.getBalance(), t.getCurrency()));
    }
}