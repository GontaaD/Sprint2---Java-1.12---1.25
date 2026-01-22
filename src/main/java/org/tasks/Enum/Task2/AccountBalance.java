package org.tasks.Enum.Task2;

import java.util.List;

public class AccountBalance {
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

    public double getAmountInUsd() {
        return currency.toUsd(amount);
    }

    @Override
    public String toString() {
        return String.format("Account balance: %s %s, %s in USD", amount, currency.name(), getAmountInUsd());
    }

    public static List<AccountBalance> createSampleBalances() {
        return List.of(
                new AccountBalance(10_000, Currency.USD),
                new AccountBalance(40_000, Currency.EUR),
                new AccountBalance(30_000, Currency.UK),
                new AccountBalance(6_000_000, Currency.JPY)
        );
    }
}
