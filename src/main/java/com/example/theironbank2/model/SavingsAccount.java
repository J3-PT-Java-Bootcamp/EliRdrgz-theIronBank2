package com.example.theironbank2.model;

import com.example.theironbank2.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SavingsAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //min balance 250
    private BigDecimal balance;

    @ManyToOne
    private AccountHolder primaryOwner;


    @CreationTimestamp
    private Instant creationDate;

    @Enumerated(EnumType.STRING)
    private Status status;


}
