package com.wallet.wallet.persistence.crud;

import com.wallet.wallet.persistence.entity.Reminder;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ReminderCrudRepository extends CrudRepository<Reminder, Long> {

    List<Reminder> findByWalletId(Long walletId);
    Optional<List<Reminder>> findByDate(LocalDate date);
    Optional<List<Reminder>> findByQuantity(double quantity);
    Optional<List<Reminder>> findByType(String type);
}
