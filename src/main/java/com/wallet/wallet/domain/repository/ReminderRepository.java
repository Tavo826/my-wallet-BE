package com.wallet.wallet.domain.repository;

import com.wallet.wallet.domain.dto.ReminderDTO;

import java.util.List;

public interface ReminderRepository {

    List<ReminderDTO> findAll();
}
