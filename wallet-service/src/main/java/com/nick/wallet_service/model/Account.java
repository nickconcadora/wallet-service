package com.nick.wallet_service.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class Account {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_id", unique = true)
    private Profile profile;

    private UUID accountNumber;
    private BigDecimal balance;

    public Account(){}

    public Account(UUID id, UUID accountNumber, BigDecimal balance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public UUID getId() {
        return id;
    }

    public UUID getAccountNumber() {
        return accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setAccountNumber(UUID accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
    public void setProfile(Profile profile) {
        this.profile = profile;
    }


}
