package com.wallet.wallet.persistence.mapper;

import com.wallet.wallet.domain.dto.ReminderDTO;
import com.wallet.wallet.persistence.entity.Reminder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ReminderMapperImpl.class})
public class ReminderMapperTest {

    @Autowired
    ReminderMapper mapper;

    Reminder entity = Reminder.builder()
            .reminderId(1L)
            .walletId(1L)
            .date(LocalDate.of(2022, 4, 26))
            .type("IN")
            .quantity(10000D)
            .remind(LocalDateTime.of(2022, 4, 26, 18, 0, 0))
            .description("xxxx")
            .build();

    Reminder entity2 = Reminder.builder()
            .reminderId(2L)
            .walletId(2L)
            .date(LocalDate.of(2023, 5, 26))
            .type("OUT")
            .quantity(20000D)
            .remind(LocalDateTime.of(2023, 5, 26, 19, 10, 10))
            .description("xxxx-xxxx")
            .build();

    Reminder entity3 = Reminder.builder()
            .reminderId(3L)
            .walletId(3L)
            .date(LocalDate.of(2024, 6, 28))
            .type("IN")
            .quantity(30000D)
            .remind(LocalDateTime.of(2024, 7, 29, 20, 30, 35))
            .description("xxxx-xxxx-xxxx")
            .build();

    ReminderDTO dto = ReminderDTO.builder()
            .reminderId(1L)
            .walletId(1L)
            .date(LocalDate.of(2022, 4, 26))
            .type("IN")
            .quantity(10000D)
            .remind(LocalDateTime.of(2022, 4, 26, 18, 0, 0))
            .description("xxxx")
            .build();

    List<Reminder> entities = List.of(entity, entity2, entity3);

    @Test
    public void when_use_toReminderDTO_return_ReminderDTO() {

        ReminderDTO result = mapper.toReminderDTO(entity);

        assertEquals((long) entity.getReminderId(), result.getReminderId());
        assertEquals((long) entity.getWalletId(), result.getWalletId());
        assertEquals(entity.getDate(), result.getDate());
        assertEquals(entity.getType(), result.getType());
        assertEquals(entity.getQuantity(), result.getQuantity(), 0.0);
        assertEquals(entity.getRemind(), result.getRemind());
        assertEquals(entity.getDescription(), result.getDescription());

    }

    @Test
    public void when_use_toReminder_return_ReminderEntity() {

        Reminder result = mapper.toReminder(dto);

        assertEquals(dto.getReminderId(), (long) result.getReminderId());
        assertEquals(dto.getWalletId(), (long) result.getWalletId());
        assertEquals(dto.getDate(), result.getDate());
        assertEquals(dto.getType(), result.getType());
        assertEquals(dto.getQuantity(), result.getQuantity(), 0.0);
        assertEquals(dto.getRemind(), result.getRemind());
        assertEquals(dto.getDescription(), result.getDescription());
    }

    @Test
    public void when_use_toRemindersDTO_return_ListOfRemindersDTO() {
         List<ReminderDTO> result = mapper.toRemindersDTO(entities);

         assertEquals(entities.size(), result.size());

        for (int i = 0; i < entities.size(); i++) {
            assertEquals((long) entities.get(i).getReminderId(), result.get(i).getReminderId());
            assertEquals((long) entities.get(i).getWalletId(), result.get(i).getWalletId());
            assertEquals(entities.get(i).getDate(), result.get(i).getDate());
            assertEquals(entities.get(i).getType(), result.get(i).getType());
            assertEquals(entities.get(i).getQuantity(), result.get(i).getQuantity(), 0.0);
            assertEquals(entities.get(i).getRemind(), result.get(i).getRemind());
            assertEquals(entities.get(i).getDescription(), result.get(i).getDescription());
        }

    }

}