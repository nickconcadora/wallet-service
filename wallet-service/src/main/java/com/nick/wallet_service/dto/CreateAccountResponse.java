package com.nick.wallet_service.dto;


import java.math.BigDecimal;
import java.util.UUID;

public class CreateAccountResponse {

    private String firstName;
    private String lastName;
    private String email;
    private String dob;
    private UUID accountNumber;
    private BigDecimal balance;

    public CreateAccountResponse() {}

    public CreateAccountResponse(String firstName, String lastName, String email, String dob, UUID accountNumber, BigDecimal balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dob = dob;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public void setAccountNumber(UUID accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getDob() {
        return dob;
    }
    public UUID getAccountNumber() {
        return accountNumber;
    }
    public BigDecimal getBalance() {
        return balance;
    }

}
