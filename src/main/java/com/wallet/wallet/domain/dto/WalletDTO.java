package com.wallet.wallet.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WalletDTO {

    private Long walletId;
    private String userId;
    private Double total;

    private List<TransactionDTO> transactions;
    private List<ReminderDTO> reminders;

}
