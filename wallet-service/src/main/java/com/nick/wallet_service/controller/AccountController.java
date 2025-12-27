package com.nick.wallet_service.controller;

import com.nick.wallet_service.model.Account;
import com.nick.wallet_service.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

//    private Account createAccount(Account account) {
//        return accountService.createAccount()
//    }



}
