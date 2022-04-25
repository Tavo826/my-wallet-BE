package com.wallet.wallet.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;

@Getter @Setter
public class TransactionDTO {

    private Long walletId;
    private Long transactiontId;
    private LocalDate date;
    private String type;
    private Double quantity;
    private String description;

}
