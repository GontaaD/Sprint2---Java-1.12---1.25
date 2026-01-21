package org.tasks.StreamAPI.Task2;

import org.tasks.StreamAPI.Transaction;
import org.tasks.StreamAPI.TransactionType;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transaction> transactions = Transaction.createSampleTransactions();
        List<String> incomeCategories = transactions.stream()
                .filter(t -> t.getType() == TransactionType.INCOME)
                .map(Transaction::getCategory)
                .distinct()
                .sorted()
                .toList();

        for (String s : incomeCategories)
            System.out.println(s);
    }
}
