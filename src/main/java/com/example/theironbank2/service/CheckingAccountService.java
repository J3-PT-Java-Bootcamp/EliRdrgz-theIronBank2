package com.example.theironbank2.service;

import com.example.theironbank2.dto.CheckingAccountDTO;
import com.example.theironbank2.model.AccountHolder;
import com.example.theironbank2.model.CheckingAccount;
import com.example.theironbank2.security.requests.CreateAccountRequest;
import com.example.theironbank2.security.requests.ShowAccountsRequest;


import java.security.Principal;
import java.util.List;
import java.util.Optional;

public interface CheckingAccountService {

    List<CheckingAccountDTO> findAllByPrimaryOwner(Principal principal);

    CheckingAccountDTO create(CheckingAccountDTO checkingAccountDTO);

    CheckingAccountDTO createAccount(CreateAccountRequest createAccountRequest);

}
