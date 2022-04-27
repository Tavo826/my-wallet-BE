package com.wallet.wallet.persistence.mapper;

import com.wallet.wallet.domain.dto.ReminderDTO;
import com.wallet.wallet.persistence.entity.Reminder;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReminderMapper {

    ReminderDTO toReminderDTO(Reminder reminder);

    List<ReminderDTO> toRemindersDTO(List<Reminder> reminders);

    @InheritInverseConfiguration
    Reminder toReminder(ReminderDTO reminderDTO);

}
