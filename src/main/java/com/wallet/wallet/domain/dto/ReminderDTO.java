package com.wallet.wallet.domain.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter @Setter
// for Testing
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReminderDTO {

    private long walletId;
    private long reminderId;
    private LocalDate date;
    private LocalDateTime remind;
    private String type;
    private double quantity;
    private String description;


}
