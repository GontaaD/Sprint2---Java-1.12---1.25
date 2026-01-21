package org.tasks.StreamAPI.Task5;

import org.tasks.StreamAPI.Transaction;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Transaction> transactions = Transaction.createSampleTransactions();
        Set<String> globalAuditTags = transactions.stream()
                .flatMap(t -> t.getTags().stream())
                .collect(Collectors.toSet());

        for (String s : globalAuditTags)
            System.out.println(s);
    }
}
