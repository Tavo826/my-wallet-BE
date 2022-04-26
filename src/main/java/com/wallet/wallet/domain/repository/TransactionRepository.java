package com.wallet.wallet.domain.repository;

import com.wallet.wallet.domain.dto.TransactionDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface TransactionRepository {

    List<TransactionDTO> findByWalletId(Long walletId);
    TransactionDTO save();
    Optional<TransactionDTO> findById(Long id);
    Optional<List<TransactionDTO>> findByDate(LocalDate date);
    Optional<List<TransactionDTO>> findByQuantity(double quantity);
    Optional<List<TransactionDTO>> findByType(String type);
}
