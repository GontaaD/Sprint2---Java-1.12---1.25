package org.tasks.Enum.TaxJurisdictionAndRevenueReport;

import org.tasks.Enum.TaxJurisdictionAndRevenueReport.Main.TaxZone;

public class Invoice {
    private double amount;
    private TaxZone  taxZone;

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
