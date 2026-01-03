package com.nick.wallet_service.controller;

import com.nick.wallet_service.dto.CreateAccountRequest;
import com.nick.wallet_service.dto.CreateAccountResponse;
import com.nick.wallet_service.model.Account;
import com.nick.wallet_service.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping("/create_account")
    private CreateAccountResponse createAccount(@RequestBody CreateAccountRequest createAccountRequest) {
        return accountService.createAccount(createAccountRequest);
    }



}
