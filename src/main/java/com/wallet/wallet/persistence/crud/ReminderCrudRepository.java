package com.wallet.persistence.crud;

import com.wallet.persistence.entity.Reminder;
import org.springframework.data.repository.CrudRepository;
import com.wallet.persistence.entity.Type;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ReminderCrudRepository extends CrudRepository<Reminder, Long> {

    Optional<List<Reminder>> findByDate(LocalDate date);
    Optional<List<Reminder>> findByQuantity(double quantity);
    List<Reminder> findByType(Type type);
}
