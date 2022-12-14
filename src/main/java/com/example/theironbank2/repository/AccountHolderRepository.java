package com.example.theironbank2.repository;

import com.example.theironbank2.model.AccountHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountHolderRepository extends JpaRepository<AccountHolder,Long> {


    Optional<AccountHolder> findById(Long id);

}
