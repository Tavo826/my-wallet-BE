package com.wallet.wallet.domain.service;

import com.wallet.wallet.domain.dto.ReminderDTO;
import com.wallet.wallet.domain.repository.ReminderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ReminderService {

    @Autowired
    ReminderRepository repository;

    public List<ReminderDTO> getByWalletId(Long walletId){
        return repository.findByWalletId(walletId);
    }

    public ReminderDTO save(ReminderDTO reminder){
        return repository.save(reminder);
    }

    public Optional<ReminderDTO> getById(Long id){
        return repository.findById(id);
    }

    public Optional<List<ReminderDTO>> getByDate(LocalDate date){
        return repository.findByDate(date);
    }

    public Optional<List<ReminderDTO>> getByQuantity(double quantity){
        return repository.findByQuantity(quantity);
    }

    public Optional<List<ReminderDTO>> getByType(String type){
        return repository.findByType(type);
    }
}
