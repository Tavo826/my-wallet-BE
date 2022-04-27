package com.wallet.wallet.domain.repository;

import com.wallet.wallet.domain.dto.ReminderDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ReminderRepository {

    List<ReminderDTO> findByWalletId(Long walletId);
    ReminderDTO save(ReminderDTO reminderDTO);
    Optional<ReminderDTO> findById(Long id);
    Optional<List<ReminderDTO>> findByDate(LocalDate date);
    Optional<List<ReminderDTO>> findByQuantity(double quantity);
    Optional<List<ReminderDTO>> findByType(String type);
}
