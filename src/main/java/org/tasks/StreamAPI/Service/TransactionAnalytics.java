package org.tasks.StreamAPI.Service;

import org.tasks.StreamAPI.Model.*;

import java.util.*;
import java.util.stream.Collectors;

public class TransactionAnalytics {

    public static List<String> highValueExpenses(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getType() == TransactionType.EXPENSE)
                .filter(t -> t.getAmount() > 10_000)
                .map(t -> "ID: " + t.getId() + ", Category: " + t.getCategory())
                .toList();
    }

    public static List<String> incomeCategories(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getType() == TransactionType.INCOME)
                .map(Transaction::getCategory)
                .distinct()
                .sorted()
                .toList();
    }

    public static double totalExpenses(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getType() == TransactionType.EXPENSE)
                .mapToDouble(Transaction::getAmount)
                .sum();
    }

    public static Transaction maxTransaction(List<Transaction> transactions) {
        return transactions.stream()
                .max(Comparator.comparingDouble(Transaction::getAmount))
                .orElse(null);
    }

    public static Map<String, Double> expensesByCategory(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.getType() == TransactionType.EXPENSE)
                .collect(Collectors.groupingBy(
                        Transaction::getCategory,
                        Collectors.summingDouble(Transaction::getAmount)
                ));
    }

    public static Set<String> allUniqueTags(List<Transaction> transactions) {
        return transactions.stream()
                .flatMap(t -> t.getTags().stream())
                .collect(Collectors.toSet());
    }
}
