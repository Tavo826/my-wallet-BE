package com.wallet.wallet.domain.repository;

import com.wallet.wallet.domain.dto.ReminderDTO;
import com.wallet.wallet.persistence.entity.Reminder;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ReminderRepository {

    List<ReminderDTO> findAll();

}
