package com.wallet.wallet.persistence.repository;

import com.wallet.wallet.domain.dto.ReminderDTO;
import com.wallet.wallet.domain.repository.ReminderRepository;
import com.wallet.wallet.persistence.crud.ReminderCrudRepository;
import com.wallet.wallet.persistence.entity.Reminder;
import com.wallet.wallet.persistence.mapper.ReminderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class ReminderRepositoryImpl  implements ReminderRepository {

    @Autowired
    ReminderCrudRepository repository;

    @Autowired
    ReminderMapper mapper;

    @Override
    public List<ReminderDTO> findByWalletId(Long walletId) {
        return null;
    }

    @Override
    public ReminderDTO save() {
        return null;
    }

    @Override
    public Optional<ReminderDTO> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<List<ReminderDTO>> findByDate(LocalDate date) {
        return Optional.empty();
    }

    @Override
    public Optional<List<ReminderDTO>> findByQuantity(double quantity) {
        return Optional.empty();
    }

    @Override
    public Optional<List<ReminderDTO>> findByType(String type) {
        return Optional.empty();
    }

}
