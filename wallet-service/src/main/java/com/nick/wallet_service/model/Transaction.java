package com.nick.wallet_service.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Transaction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private Long transactionAmount;
    private Date timestamp;
    private String referenceId;

    public Transaction(Long transactionAmount, Date timestamp, String referenceId) {
        this.transactionAmount = transactionAmount;
        this.timestamp = timestamp;
        this.referenceId = referenceId;
    }

    public Long getTransactionAmount() {
        return transactionAmount;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getReferenceId() {
        return referenceId;
    }


}
