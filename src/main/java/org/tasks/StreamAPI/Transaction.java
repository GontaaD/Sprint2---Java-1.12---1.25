package org.tasks.StreamAPI;

import java.time.LocalDate;
import java.util.List;

public class Transaction {
    private long id;
    private String category;
    private double amount;
    private TransactionType type;
    private LocalDate date;
    private List<String> tags;

    public Transaction(long id, String category, double amount, TransactionType type, LocalDate date, List<String> tags) {
        this.id = id;
        this.category = category;
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.tags = tags;
    }

    public long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    public LocalDate getDate() {
        return date;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", amount=" + amount +
                ", type=" + type +
                ", date=" + date +
                ", tags=" + tags +
                '}';
    }

    public static List<Transaction> createSampleTransactions() {
        return List.of(
                new Transaction(
                        1L,
                        "Salaries",
                        75000.00,
                        TransactionType.EXPENSE,
                        LocalDate.of(2025, 1, 31),
                        List.of("Internal", "Urgent")
                ),
                new Transaction(
                        2L,
                        "Logistics",
                        18000.00,
                        TransactionType.EXPENSE,
                        LocalDate.of(2025, 2, 10),
                        List.of("External", "Compliance")
                ),
                new Transaction(
                        3L,
                        "Software",
                        9500.00,
                        TransactionType.EXPENSE,
                        LocalDate.of(2025, 2, 15),
                        List.of("Subscription", "Tax-Exempt")
                ),
                new Transaction(
                        4L,
                        "Consulting",
                        32000.00,
                        TransactionType.INCOME,
                        LocalDate.of(2025, 3, 1),
                        List.of("Client", "External")
                ),
                new Transaction(
                        5L,
                        "Product Sales",
                        54000.00,
                        TransactionType.INCOME,
                        LocalDate.of(2025, 3, 12),
                        List.of("Retail", "Taxable")
                ),
                new Transaction(
                        6L,
                        "Licensing",
                        12000.00,
                        TransactionType.INCOME,
                        LocalDate.of(2025, 4, 5),
                        List.of("IP", "Recurring")
                ),
                new Transaction(
                        7L,
                        "Marketing",
                        22000.00,
                        TransactionType.EXPENSE,
                        LocalDate.of(2025, 4, 18),
                        List.of("Campaign", "External")
                ),
                new Transaction(
                        8L,
                        "Logistics",
                        6700.00,
                        TransactionType.EXPENSE,
                        LocalDate.of(2025, 5, 2),
                        List.of("Internal")
                ),
                new Transaction(
                        9L,
                        "Consulting",
                        15000.00,
                        TransactionType.INCOME,
                        LocalDate.of(2025, 5, 20),
                        List.of("Client", "Urgent")
                ),
                new Transaction(
                        10L,
                        "Software",
                        14500.00,
                        TransactionType.EXPENSE,
                        LocalDate.of(2025, 6, 10),
                        List.of("Upgrade", "Compliance")
                )
        );
    }
}
