package com.wallet.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "reminders")
@Getter @Setter
public class Reminder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reminder_id")
    private Long reminderId;

    @Column(name = "wallet_id")
    private Long walletId;

    LocalDate date;

    private Type type;

    private Double quantity;

    private String description;

    @ManyToOne
    @JoinColumn(name = "wallet_id", insertable = false, updatable = false)
    private Wallet walletReminder;
}
