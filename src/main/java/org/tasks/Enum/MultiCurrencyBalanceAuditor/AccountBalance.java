package org.tasks.Enum.MultiCurrencyBalanceAuditor;

import org.tasks.Enum.MultiCurrencyBalanceAuditor.Main.Currency;

public class AccountBalance {
    private double balance;
    private Currency currency;

    public AccountBalance(double balance, Currency currency) {
        this.balance = balance;
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public Currency getCurrency() {
        return currency;
    }
}
