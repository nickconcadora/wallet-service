package com.nick.wallet_service.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "wallet_users")
public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "account_id", unique = true)
    private Account account;


    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String dob;


    public User(){}

    public User(String firstName, String lastName, String email, String password, String dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.dob = dob;
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

}
