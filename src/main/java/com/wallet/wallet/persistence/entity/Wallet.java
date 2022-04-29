package com.wallet.wallet.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "wallets")
@Getter @Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wallet_id")
    private Long walletId;

    @Column(name = "user_id")
    private String userId;

    private Double total;

    //Relations:

    @OneToMany(mappedBy = "walletTransaction", cascade = {CascadeType.ALL})
    private List<Transaction> transactions;

    @OneToMany(mappedBy = "walletReminder", cascade = {CascadeType.ALL})
    private List<Reminder> reminders;
}
