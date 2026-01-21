package org.tasks.StreamAPI.Model;

import java.time.LocalDate;
import java.util.List;

public class Transaction {

    private long id;
    private String category;
    private double amount;
    private TransactionType type;
    private LocalDate date;
    private List<String> tags;

    public Transaction(long id, String category, double amount,
                       TransactionType type, LocalDate date, List<String> tags) {
        this.id = id;
        this.category = category;
        this.amount = amount;
        this.type = type;
        this.date = date;
        this.tags = tags;
    }

    public long getId() { return id; }
    public String getCategory() { return category; }
    public double getAmount() { return amount; }
    public TransactionType getType() { return type; }
    public List<String> getTags() { return tags; }
}
