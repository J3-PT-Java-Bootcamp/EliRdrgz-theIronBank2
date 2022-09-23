package com.example.theironbank2.service;


import com.example.theironbank2.dto.CreditAccountDTO;
import com.example.theironbank2.dto.SavingsAccountDTO;

import java.security.Principal;
import java.util.List;

public interface CreditAccountService {

    List<CreditAccountDTO> findAllByPrimaryOwner(Principal principal);

}
