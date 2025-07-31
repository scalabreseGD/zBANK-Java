package com.zbank.model;

import java.math.BigDecimal;

public class User {
    private Long id;
    private String username;
    private String password;
    private BigDecimal balance;

    public User() {
    }

    public User(String username, String password, BigDecimal balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}