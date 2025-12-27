package com.nick.wallet_service.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Account {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @OneToOne(mappedBy = "account")
    private User user;

    private Long accountNumber;
    private float balance = 0;

    public Account(){}

    public Account(UUID id, Long accountNumber, float balance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public UUID getId() {
        return id;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public float getBalance() {
        return balance;
    }
}
