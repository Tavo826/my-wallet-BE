package com.wallet.wallet.domain.dto;

import com.wallet.wallet.domain.enums.TypeEnum;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
public class TransactionDTO {

    private String walletID;
    private LocalDate date;
    private TypeEnum type;
    private Double quantity;
    private String description;

}
