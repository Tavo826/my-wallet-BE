package com.wallet.wallet.persistence.crud;

import com.wallet.wallet.persistence.entity.Reminder;
import com.wallet.wallet.persistence.entity.Transaction;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface TransactionCrudRepository extends CrudRepository<Transaction, Long> {
    List<Reminder> findByDate(LocalDate date);
    List<Reminder> findByQuantity(double quantity);
    List<Reminder> findByType(String type);
}
