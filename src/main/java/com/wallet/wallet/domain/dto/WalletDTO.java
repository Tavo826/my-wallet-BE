package com.wallet.wallet.domain.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Getter @Setter
public class WalletDTO {

    private Long walletId;
    private String userId;
    private Double total;
    private List<ReminderDTO> reminders;
    private List<TransactionDTO> transactions;

}
