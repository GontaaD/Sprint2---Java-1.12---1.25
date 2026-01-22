package org.tasks.Enum.Task1;

public enum TaxZone {
    USA(0.21),
    EU(0.25),
    UK(0.23),
    ASIA(0.18);

    private final double taxRate;

    TaxZone(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
