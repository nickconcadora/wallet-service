package com.nick.wallet_service.dto;

public class ChangeEmailRequest {

    private String currentEmail;
    private String newEmail;

    public ChangeEmailRequest(){}

    public ChangeEmailRequest(String currentEmail, String newEmail) {
        this.currentEmail = currentEmail;
        this.newEmail = newEmail;
    }

    public String getCurrentEmail() {
        return currentEmail;
    }

    public String getNewEmail(){
        return newEmail;
    }

    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
    }




}
