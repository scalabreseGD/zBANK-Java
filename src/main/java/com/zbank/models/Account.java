package com.zbank.models;

import java.math.BigDecimal;

public class Account {
    private Long id;
    private Long userId;
    private String accountNumber;
    private BigDecimal balance;

    public Account(Long id, Long userId, String accountNumber, BigDecimal balance) {
        this.id = id;
        this.userId = userId;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public Long getUserId() {
        return userId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
               "id=" + id +
               ", userId=" + userId +
               ", accountNumber='" + accountNumber + ''' +
               ", balance=" + balance +
               '}';
    }
}
