package com.wallet.wallet.domain.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter @Setter
public class ReminderDTO {

    private String walletId;
    private Long reminderId;
    private LocalDate date;
    private String type;
    private Double quantity;
    private String description;
    private LocalDateTime remind;

}
