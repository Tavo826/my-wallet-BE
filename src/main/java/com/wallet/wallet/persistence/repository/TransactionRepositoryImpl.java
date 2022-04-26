package com.wallet.wallet.persistence.repository;

import com.wallet.wallet.domain.dto.TransactionDTO;
import com.wallet.wallet.domain.repository.TransactionRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class TransactionRepositoryImpl implements TransactionRepository {

    @Override
    public List<TransactionDTO> findByWalletId(Long walletId) {
        return null;
    }

    @Override
    public TransactionDTO save() {
        return null;
    }

    @Override
    public Optional<TransactionDTO> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<List<TransactionDTO>> findByDate(LocalDate date) {
        return Optional.empty();
    }

    @Override
    public Optional<List<TransactionDTO>> findByQuantity(double quantity) {
        return Optional.empty();
    }

    @Override
    public Optional<List<TransactionDTO>> findByType(String type) {
        return Optional.empty();
    }
}
