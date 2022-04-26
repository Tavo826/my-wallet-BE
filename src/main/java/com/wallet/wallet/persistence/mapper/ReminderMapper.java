package com.wallet.wallet.persistence.mapper;

import com.wallet.wallet.domain.dto.ReminderDTO;
import com.wallet.wallet.persistence.entity.Reminder;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReminderMapper {

    ReminderDTO toReminderDTO(Reminder reminder);


    @InheritInverseConfiguration
    @Mapping(target = "walletReminder", ignore = true)
    Reminder toReminder(ReminderDTO reminderDTO);

    List<ReminderDTO> toRemindersDTO(List<Reminder> reminders);
}
