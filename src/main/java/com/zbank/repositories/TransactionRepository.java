package com.zbank.repositories;

import com.zbank.models.Transaction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TransactionRepository {
    private final List<Transaction> transactions = new ArrayList<>();

    public void save(Transaction transaction) {
        transactions.add(transaction);
    }

    public List<Transaction> findAll() {
        return Collections.unmodifiableList(transactions);
    }

    public List<Transaction> findByAccountNumber(String accountNumber) {
        List<Transaction> accountTransactions = new ArrayList<>();
        for (Transaction transaction : transactions) {
            if (transaction.getSourceAccountNumber().equals(accountNumber) || transaction.getTargetAccountNumber().equals(accountNumber)) {
                accountTransactions.add(transaction);
            }
        }
        return Collections.unmodifiableList(accountTransactions);
    }
}
