package com.wallet.wallet.domain.dto;

import lombok.*;

import java.util.List;
import java.util.Objects;

@Getter @Setter
// for Testing
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WalletDTO {

    private long walletId;
    private String userId;
    private double total;
    private List<ReminderDTO> reminders;
    private List<TransactionDTO> transactions;

}
