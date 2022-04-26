package com.wallet.wallet.domain.dto;

import lombok.*;

import java.time.LocalDate;

@Getter @Setter
// for Testing
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransactionDTO {

    private long walletId;
    private long transactionId;
    private LocalDate date;
    private String type;
    private double quantity;
    private String description;

}
