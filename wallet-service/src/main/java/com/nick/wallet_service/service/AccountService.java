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

        Account newAccount = new Account(UUID.randomUUID(), initialDeposit);
        Profile newProfile = new Profile(firstName, lastName, email, password, dob);

        newProfile.setAccount(newAccount);
        newAccount.setProfile(newProfile);

        accountRepository.save(newAccount);

        return new CreateAccountResponse(
                newProfile.getFirstName(),
                newProfile.getLastName(),
                newProfile.getEmail(),
                newProfile.getDob(),
                newAccount.getAccountNumber(),
                newAccount.getBalance()
        );
    }


}
