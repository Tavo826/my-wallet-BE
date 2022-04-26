package com.wallet.wallet.persistence.mapper;

import com.wallet.wallet.domain.dto.ReminderDTO;
import com.wallet.wallet.domain.dto.TransactionDTO;
import com.wallet.wallet.domain.dto.WalletDTO;
import com.wallet.wallet.persistence.entity.Reminder;
import com.wallet.wallet.persistence.entity.Transaction;
import com.wallet.wallet.persistence.entity.Wallet;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {WalletMapperImpl.class, ReminderMapperImpl.class, TransactionMapperImpl.class})
public class WalletMapperTest {

    @Autowired
    WalletMapper mapper;

    Wallet entity = Wallet.builder()
            .walletId(1L)
            .userId("xxx-xxx-xxx")
            .total(50000D)
            .reminders(List.of(Reminder.builder()
                    .reminderId(1L)
                    .walletId(1L)
                    .date(LocalDate.of(2022, 4, 26))
                    .type("IN")
                    .quantity(10000D)
                    .remind(LocalDateTime.of(2022, 4, 26, 18, 0, 0))
                    .description("xxxx")
                    .build()))
            .transactions(List.of(Transaction.builder()
                    .transactionId(1L)
                    .walletId(1L)
                    .date(LocalDate.of(2022, 4, 26))
                    .type("IN")
                    .quantity(10000D)
                    .description("xxxx")
                    .build()))
            .build();

    Wallet entity2 = Wallet.builder()
            .walletId(2L)
            .userId("yyy-yyy-yyy")
            .total(20000D)
            .reminders(List.of(Reminder.builder()
                    .reminderId(1L)
                    .walletId(1L)
                    .date(LocalDate.of(2022, 4, 26))
                    .type("IN")
                    .quantity(10000D)
                    .remind(LocalDateTime.of(2022, 4, 26, 18, 0, 0))
                    .description("xxxx")
                    .build()))
            .transactions(List.of(Transaction.builder()
                    .transactionId(1L)
                    .walletId(1L)
                    .date(LocalDate.of(2022, 4, 26))
                    .type("IN")
                    .quantity(10000D)
                    .description("xxxx")
                    .build()))
            .build();

    Wallet entity3 = Wallet.builder()
            .walletId(3L)
            .userId("zzz-zzz-zzz")
            .total(30000D)
            .reminders(List.of(Reminder.builder()
                    .reminderId(1L)
                    .walletId(1L)
                    .date(LocalDate.of(2022, 4, 26))
                    .type("IN")
                    .quantity(10000D)
                    .remind(LocalDateTime.of(2022, 4, 26, 18, 0, 0))
                    .description("xxxx")
                    .build()))
            .transactions(List.of(Transaction.builder()
                    .transactionId(1L)
                    .walletId(1L)
                    .date(LocalDate.of(2022, 4, 26))
                    .type("IN")
                    .quantity(10000D)
                    .description("xxxx")
                    .build()))
            .build();

    WalletDTO dto = WalletDTO.builder()
            .walletId(1L)
            .userId("xxx-xxx-xxx")
            .total(50000D)
            .reminders(List.of(ReminderDTO.builder()
                    .reminderId(1L)
                    .walletId(1L)
                    .date(LocalDate.of(2022, 4, 26))
                    .type("IN")
                    .quantity(10000D)
                    .remind(LocalDateTime.of(2022, 4, 26, 18, 0, 0))
                    .description("xxxx")
                    .build()))
            .transactions(List.of(TransactionDTO.builder()
                    .transactionId(1L)
                    .walletId(1L)
                    .date(LocalDate.of(2022, 4, 26))
                    .type("IN")
                    .quantity(10000D)
                    .description("xxxx").build()))
            .build();

    List<Wallet> entities = List.of(entity, entity2, entity3);

    @Test
    public void when_use_toWalletDTO_return_WalletDTO() {

        WalletDTO result = mapper.toWalletDTO(entity);

        assertEquals((long) entity.getWalletId(), result.getWalletId());
        assertEquals(entity.getUserId(), result.getUserId());
        assertEquals(entity.getTotal(), result.getTotal(), 0.0);
        assertEquals(entity.getReminders().size(), result.getReminders().size());
        assertEquals(entity.getTransactions().size(), result.getTransactions().size());

    }

    @Test
    public void when_use_toWallet_return_WalletEntity() {

        Wallet result = mapper.toWallet(dto);

        assertEquals(dto.getWalletId(), (long) result.getWalletId());
        assertEquals(dto.getUserId(), result.getUserId());
        assertEquals(dto.getTotal(), result.getTotal(), 0.0);
        assertEquals(dto.getReminders().size(), result.getReminders().size());
        assertEquals(dto.getTransactions().size(), result.getTransactions().size());

    }

    @Test
    public void when_use_toWalletsDTO_return_ListOfWalletsDTO() {

        List<WalletDTO> result = mapper.toWalletsDTO(entities);

        assertEquals(entities.size(), result.size());

        for (int i = 0; i < entities.size(); i++) {
            assertEquals( (long) entities.get(i).getWalletId(),result.get(i).getWalletId());
            assertEquals(entities.get(i).getUserId(), result.get(i).getUserId());
            assertEquals(entities.get(i).getTotal(), result.get(i).getTotal(), 0.0);
            assertEquals(entities.get(i).getReminders().size(), result.get(i).getReminders().size());
            assertEquals(entities.get(i).getTransactions().size(), result.get(i).getTransactions().size());
        }
    }
}