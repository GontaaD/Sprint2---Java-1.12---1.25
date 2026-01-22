package org.tasks.Enum.Task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Invoke> invokes = Invoke.createSampleInvokes();

        double totalRevenue = invokes.stream()
                .filter(i -> i.getTaxZone() == TaxZone.EU || i.getTaxZone() == TaxZone.UK)
                .mapToDouble(i -> i.getAmount() * (1 - i.getTaxZone().getTaxRate()))
                .sum();

        System.out.println(totalRevenue);
    }
}
