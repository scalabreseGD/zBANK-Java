package com.zbank.repositories;

import com.zbank.models.Account;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AccountRepository {
    private final Map<String, Account> accounts = new HashMap<>();

    public void save(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public Optional<Account> findByAccountNumber(String accountNumber) {
        return Optional.ofNullable(accounts.get(accountNumber));
    }

    public void update(Account account) {
        if (accounts.containsKey(account.getAccountNumber())) {
            accounts.put(account.getAccountNumber(), account);
        } else {
            throw new IllegalArgumentException("Account not found: " + account.getAccountNumber());
        }
    }
}
