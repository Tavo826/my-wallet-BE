package com.wallet.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "wallets")
@Getter @Setter
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wallet_id")
    private Long walletId;

    @Column(name = "user_id")
    private String userId;

    private Double total;

    //Relations:

    @OneToMany(mappedBy = "walletTransaction")
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "walletReminder")
    private List<Reminder> reminders;
}
