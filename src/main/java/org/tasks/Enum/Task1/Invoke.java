package org.tasks.Enum.Task1;

import java.util.List;

public class Invoke {
    private final double amount;
    private final TaxZone taxZone;


    public Invoke(double amount, TaxZone taxZone) {
        this.amount = amount;
        this.taxZone = taxZone;
    }


    public double getAmount() {
        return amount;
    }

    public TaxZone getTaxZone() {
        return taxZone;
    }

    public static List<Invoke> createSampleInvokes() {
        return List.of(
                new Invoke(10_000.00, TaxZone.USA),
                new Invoke(15_000.00, TaxZone.EU),
                new Invoke(7_500.00, TaxZone.UK),
                new Invoke(12_000.00, TaxZone.ASIA),
                new Invoke(20_000.00, TaxZone.EU)
        );
    }
}
