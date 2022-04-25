package com.wallet.persistence.crud;

import com.wallet.persistence.entity.Reminder;
import com.wallet.persistence.entity.Transaction;
import com.wallet.persistence.entity.Type;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface TransactionCrudRepository extends CrudRepository<Transaction, Long> {
    Optional<List<Reminder>> findByDate(LocalDate date);
    Optional<List<Reminder>> findByQuantity(double quantity);
    List<Reminder> findByType(Type type);
}
