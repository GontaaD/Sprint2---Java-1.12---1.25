package org.tasks.StreamAPI.Task3;

import org.tasks.StreamAPI.Transaction;
import org.tasks.StreamAPI.TransactionType;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transaction> transactions = Transaction.createSampleTransactions();

        double totalExpenses = transactions.stream()
                .filter(t -> t.getType() == TransactionType.EXPENSE)
                .mapToDouble(Transaction::getAmount)
                .sum();

        System.out.println(totalExpenses);

        Transaction largestTransaction = transactions.stream()
                .max(Comparator.comparingDouble(Transaction::getAmount))
                .orElseThrow(() -> new IllegalStateException("No transactions found"));

        System.out.println(largestTransaction);
    }
}
