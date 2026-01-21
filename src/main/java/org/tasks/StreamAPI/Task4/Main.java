package org.tasks.StreamAPI.Task4;

import org.tasks.StreamAPI.Transaction;
import org.tasks.StreamAPI.TransactionType;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Transaction> transactions = Transaction.createSampleTransactions();
        Map<String, Double> expenseByCategory = transactions.stream()
                .filter(t -> t.getType() == TransactionType.EXPENSE)
                .collect(Collectors.groupingBy(Transaction::getCategory,
                        Collectors.summingDouble(Transaction::getAmount)));

        for (Map.Entry<String, Double> entry : expenseByCategory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
