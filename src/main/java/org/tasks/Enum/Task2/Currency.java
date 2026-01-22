package org.tasks.Enum.Task2;

public enum Currency {
    USD(1.00),
    EUR(1.08),
    UK(1.26),
    JPY(0.0067);

    private final double usdRate;

    Currency(double usdRate) {
        this.usdRate = usdRate;
    }

    public double toUsd(double amount) {
        return amount * usdRate;
    }
}
