package com.nick.wallet_service.dto;

import java.math.BigDecimal;

public class CreateAccountRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String dob;
    private BigDecimal initialDeposit;

    public CreateAccountRequest(){}

    public CreateAccountRequest(String firstName, String lastName, String email, String password, String dob, BigDecimal initialDeposit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.initialDeposit = initialDeposit;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setInitialDeposit(BigDecimal initialDeposit) {
        this.initialDeposit = initialDeposit;
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

    public String getPassword() {
        return password;
    }

    public String getDob() {
        return dob;
    }

    public BigDecimal getInitialDeposit() {
        return initialDeposit;
    }
}

