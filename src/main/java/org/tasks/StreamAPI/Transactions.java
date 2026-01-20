package org.tasks.StreamAPI;

import java.time.LocalDate;
import java.util.*;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingDouble;

public class Transactions {
    public List<Map<String, Object>> getTransactions() {
        List<Map<String, Object>> transactions = new ArrayList<>();

        transactions.add(new HashMap<>(Map.of(
                "id", 1,
                "category", "Freelance",
                "amount", 1500.0,
                "type", "INCOME",
                "date", LocalDate.of(2026, 1, 20),
                "tags", List.of("Internal", "Tax-Exempt")
        )));

        transactions.add(new HashMap<>(Map.of(
                "id", 2,
                "category", "Salary",
                "amount", 200.5,
                "type", "EXPENSE",
                "date", LocalDate.of(2026, 1, 18),
                "tags", "Tax-Exempt"
        )));

        transactions.add(new HashMap<>(Map.of(
                "id", 3,
                "category", "Freelance",
                "amount", 600.0,
                "type", "INCOME",
                "date", LocalDate.of(2026, 1, 15),
                "tags", List.of("Urgent", "Tax-Exempt")
        )));

        transactions.add(new HashMap<>(Map.of(
                "id", 4,
                "category", "Rent",
                "amount", 8001.0,
                "type", "EXPENSE",
                "date", LocalDate.of(2026, 1, 1),
                "tags", List.of("Tax-Exempt", "Internal")
        )));

        transactions.add(new HashMap<>(Map.of(
                "id", 5,
                "category", "Salary",
                "amount", 2500.0,
                "type", "INCOME",
                "date", LocalDate.of(2026, 1, 10),
                "tags", "Internal"
        )));

        transactions.add(new HashMap<>(Map.of(
                "id", 6,
                "category", "Groceries",
                "amount", 150.0,
                "type", "EXPENSE",
                "date", LocalDate.of(2026, 1, 19),
                "tags", "Urgent"
        )));

        transactions.add(new HashMap<>(Map.of(
                "id", 7,
                "category", "Freelance",
                "amount", 1200.0,
                "type", "INCOME",
                "date", LocalDate.of(2026, 1, 12),
                "tags", "Internal"
        )));

        transactions.add(new HashMap<>(Map.of(
                "id", 8,
                "category", "Rent",
                "amount", 8000.0,
                "type", "EXPENSE",
                "date", LocalDate.of(2026, 1, 5),
                "tags", "Tax-Exempt"
        )));

        transactions.add(new HashMap<>(Map.of(
                "id", 9,
                "category", "Groceries",
                "amount", 300.0,
                "type", "EXPENSE",
                "date", LocalDate.of(2026, 1, 20),
                "tags", List.of("Urgent", "Internal", "Tax-Exempt")
        )));

        transactions.add(new HashMap<>(Map.of(
                "id", 10,
                "category", "Salary",
                "amount", 2500.0,
                "type", "INCOME",
                "date", LocalDate.of(2026, 1, 15),
                "tags", List.of("Internal", "Tax-Exempt")
        )));

        return transactions;
    }

    public void highValueExpenseAudit() {
        getTransactions().stream()
                .filter(t -> t.get("type").equals("EXPENSE") && (Double) t.get("amount") > 1000)
                .forEach(t -> System.out.printf("Transaction - Type: %s | Amount: %s | Tags: %s | Date: %s \n",
                        t.get("type"),
                        t.get("amount"),
                        t.get("tags"),
                        t.get("date")));
    }

    public void revenueSourceCategorization() {
        List<String> list = getTransactions().stream()
                .filter(t -> t.get("type").equals("INCOME"))
                .map(t -> (String) t.get("category"))
                .sorted()
                .distinct()
                .toList();
        System.out.println("Revenue Source: " + list);
    }

    public void portfolioSummaryStatistics() {
        double sum = getTransactions().stream()
                .filter(t -> t.get("type").equals("EXPENSE"))
                .mapToDouble(t -> (Double) t.get("amount"))
                .sum();

        System.out.println("Summary Statistic: " + sum);

        getTransactions().stream()
                .filter(t -> t.get("type").equals("EXPENSE"))
                .max(comparing(t -> (Double) t.get("amount")))
                .ifPresent(t -> System.out.printf("Largest Transaction - Id: %s | Type: %s | Amount: %s | Tags: %s | Date: %s | Category: %s %n",
                        t.get("id"),
                        t.get("type"),
                        t.get("amount"),
                        t.get("tags"),
                        t.get("date"),
                        t.get("category")));
    }

    public void departmentalBudgetDistribution() {
        Map<String, Double> map = getTransactions().stream()
                .filter(t -> t.get("type").equals("EXPENSE"))
                .collect(groupingBy(t -> t.get("category").toString(), summingDouble(t -> (Double) t.get("amount"))));
        System.out.println("Department Budget Distribution: " + map);
    }

    public void complianceTagDiscovery() {
        List<String> list = getTransactions().stream()
                .map(t -> t.get("tags") instanceof String ? List.of((String) t.get("tags")) : (List<String>) t.get("tags"))
                .flatMap(List::stream)
                .distinct()
                .toList();
        System.out.println("Compliance Tags Discovery: " + list);
    }
}