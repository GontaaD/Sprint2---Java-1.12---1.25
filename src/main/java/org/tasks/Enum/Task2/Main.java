package org.tasks.Enum.Task2;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AccountBalance> balances = AccountBalance.createSampleBalances();

        AccountBalance richestBalance = balances.stream()
                .max(Comparator.comparingDouble(AccountBalance::getAmountInUsd))
                .orElseThrow(() -> new IllegalStateException("No balance found"));

        System.out.println(richestBalance);
    }
}
