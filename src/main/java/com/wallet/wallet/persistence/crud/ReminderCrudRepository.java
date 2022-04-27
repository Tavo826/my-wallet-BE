package com.wallet.wallet.persistence.crud;

import com.wallet.wallet.persistence.entity.Reminder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ReminderCrudRepository extends CrudRepository<Reminder, Long> {

    List<Reminder> findByDate(LocalDate date);
    List<Reminder> findByQuantity(double quantity);
    List<Reminder> findByType(String type);
}
