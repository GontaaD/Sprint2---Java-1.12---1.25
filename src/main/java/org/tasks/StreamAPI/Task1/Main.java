package org.tasks.StreamAPI.Task1;

import org.tasks.StreamAPI.Transaction;
import org.tasks.StreamAPI.TransactionType;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        double THRESHOLD = 10_000.0;

        List<Transaction> transactions = Transaction.createSampleTransactions();
        List<String> highValueExpenseAudit = transactions.stream()
                .filter(t -> t.getType() == TransactionType.EXPENSE)
                .filter(t -> t.getAmount() > THRESHOLD)
                .map(t -> "Transaction ID: " + t.getId() + ", Category: " + t.getCategory())
                .toList();

        for (String s : highValueExpenseAudit)
            System.out.println(s);
    }
}
