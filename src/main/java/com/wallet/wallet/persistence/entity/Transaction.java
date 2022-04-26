package com.wallet.wallet.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "transactions")
@Getter @Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long transactionId;

    @Column(name = "wallet_id")
    private Long walletId;

    private LocalDate date;

    private String type;

    private Double quantity;

    private String description;

    @ManyToOne
    @JoinColumn(name = "wallet_id", insertable = false, updatable = false)
    private Wallet walletTransaction;
}
