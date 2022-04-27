package com.wallet.wallet.persistence.repository;

import com.wallet.wallet.domain.dto.ReminderDTO;
import com.wallet.wallet.domain.repository.ReminderRepository;
import com.wallet.wallet.persistence.crud.ReminderCrudRepository;
import com.wallet.wallet.persistence.entity.Reminder;
import com.wallet.wallet.persistence.mapper.ReminderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ReminderRepositoryImpl implements ReminderRepository {

    @Autowired
    ReminderCrudRepository repository;

    @Autowired
    ReminderMapper mapper;

    @Override
    public List<ReminderDTO> findAll() {
        return mapper.toRemindersDTO((List<Reminder>) repository.findAll());
    }

    @Override
    public ReminderDTO save(ReminderDTO reminderDTO) {
        return mapper.toReminderDTO(repository.save(mapper.toReminder(reminderDTO)));
    }

    @Override
    public void delete(ReminderDTO reminderDTO) {
        repository.delete(mapper.toReminder(reminderDTO));
    }
}
