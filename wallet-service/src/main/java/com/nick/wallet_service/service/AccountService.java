package com.nick.wallet_service.service;

import com.nick.wallet_service.dto.CreateAccountRequest;
import com.nick.wallet_service.dto.CreateAccountResponse;
import com.nick.wallet_service.model.Account;
import com.nick.wallet_service.model.Profile;
import com.nick.wallet_service.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public CreateAccountResponse createAccount(CreateAccountRequest createAccountRequest){
        String firstName = createAccountRequest.getFirstName();
        String lastName = createAccountRequest.getLastName();
        String email = createAccountRequest.getEmail();
        String password = createAccountRequest.getPassword();
        String dob = createAccountRequest.getDob();
        BigDecimal initialDeposit = createAccountRequest.getInitialDeposit();

        Profile newProfile = new Profile();
        newProfile.setFirstName(firstName);
        newProfile.setLastName(lastName);
        newProfile.setEmail(email);
        newProfile.setPassword(password);
        newProfile.setDob(dob);

        Account newAccount = new Account();
        newAccount.setAccountNumber(UUID.randomUUID());
        newAccount.setBalance(initialDeposit);

        newProfile.setAccount(newAccount);
        newAccount.setProfile(newProfile);

        accountRepository.save(newAccount);

        CreateAccountResponse resp = new CreateAccountResponse();
        resp.setFirstName(newProfile.getFirstName());
        resp.setLastName(newProfile.getLastName());
        resp.setEmail(newProfile.getEmail());
        resp.setDob(newProfile.getDob());
        resp.setAccountNumber(newAccount.getAccountNumber());
        resp.setBalance(newAccount.getBalance());

        return resp;



    }


}
