package org.tasks.StreamAPI.Data;

import org.tasks.StreamAPI.Model.*;

import java.time.LocalDate;
import java.util.List;

public class TransactionData {

    public static List<Transaction> getTransactions() {
        return List.of(
                new Transaction(1, "Logistics", 12000, TransactionType.EXPENSE,
                        LocalDate.now(), List.of("Internal", "Urgent")),

                new Transaction(2, "Software", 8000, TransactionType.EXPENSE,
                        LocalDate.now(), List.of("Tax-Exempt")),

                new Transaction(3, "Sales", 20000, TransactionType.INCOME,
                        LocalDate.now(), List.of("External")),

                new Transaction(4, "Marketing", 15000, TransactionType.EXPENSE,
                        LocalDate.now(), List.of("Urgent", "Audit"))
        );
    }
}
