package com.wallet.wallet.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class TransactionDTO {

    private Long transactionId;
    private String walletId;
    private LocalDate date;
    private String type;
    private Double quantity;
    private String description;

}
