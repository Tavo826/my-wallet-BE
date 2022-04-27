package com.wallet.wallet.persistence.crud;

import com.wallet.wallet.persistence.entity.Transaction;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface TransactionCrudRepository extends CrudRepository<Transaction, Long> {
    List<Transaction> findByWalletId(Long id);
    Optional<List<Transaction>> findByDate(LocalDate date);
    Optional<List<Transaction>> findByQuantity(double quantity);
    Optional<List<Transaction>> findByType(String type);
}
