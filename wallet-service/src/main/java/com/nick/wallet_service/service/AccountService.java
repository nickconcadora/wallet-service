package com.nick.wallet_service.service;

import com.nick.wallet_service.model.Account;
import com.nick.wallet_service.model.User;
import com.nick.wallet_service.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public void createAccount(){
    }


}
