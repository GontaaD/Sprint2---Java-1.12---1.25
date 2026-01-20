package org.tasks.Enum.TaxJurisdictionAndRevenueReport;

import java.util.List;

public class Main {

    public enum TaxZone {
        USA(0.21),
        EU(0.25),
        UK(0.20),
        ASIA(0.15);

        private final double value;

        TaxZone(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        List<Invoice> invoices = List.of(
                new Invoice(1000.0, TaxZone.USA),
                new Invoice(2000.0, TaxZone.EU),
                new Invoice(1500.0, TaxZone.UK),
                new Invoice(800.0, TaxZone.ASIA)
        );

        invoices.stream()
                .filter(i -> (i.getTaxZone()).getValue() > 0.20)
                .map(i -> i.getAmount() - i.getAmount() * i.getTaxZone().getValue())
                .forEach(System.out::println);
    }
}