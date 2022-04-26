package com.wallet.wallet.persistence.mapper;

import com.wallet.wallet.domain.dto.ReminderDTO;
import com.wallet.wallet.domain.dto.TransactionDTO;
import com.wallet.wallet.persistence.entity.Transaction;
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
@SpringBootTest(classes = {TransactionMapperImpl.class})
public class TransactionMapperTest {

    @Autowired
    TransactionMapper mapper;

    Transaction entity = Transaction.builder()
            .transactionId(1L)
            .walletId(1L)
            .date(LocalDate.of(2022, 4, 26))
            .type("IN")
            .quantity(10000D)
            .description("xxxx")
            .build();

    Transaction entity2 = Transaction.builder()
            .transactionId(2L)
            .walletId(2L)
            .date(LocalDate.of(2023, 5, 26))
            .type("OUT")
            .quantity(20000D)
            .description("xxxx-xxxx")
            .build();

    Transaction entity3 = Transaction.builder()
            .transactionId(3L)
            .walletId(3L)
            .date(LocalDate.of(2024, 6, 28))
            .type("IN")
            .quantity(30000D)
            .description("xxxx-xxxx-xxxx")
            .build();

    TransactionDTO dto = TransactionDTO.builder()
            .transactionId(1L)
            .walletId(1L)
            .date(LocalDate.of(2022, 4, 26))
            .type("IN")
            .quantity(10000D)
            .description("xxxx")
            .build();

    List<Transaction> entities = List.of(entity, entity2, entity3);

    @Test
    public void whern_use_toTransactionDTO_return_TransactionDTO() {

        TransactionDTO result = mapper.toTransactionDTO(entity);

        assertEquals((long) entity.getTransactionId(), result.getTransactionId());
        assertEquals((long) entity.getWalletId(), result.getWalletId());
        assertEquals(entity.getDate(), result.getDate());
        assertEquals(entity.getType(), result.getType());
        assertEquals(entity.getQuantity(), result.getQuantity(), 0.0);
        assertEquals(entity.getDescription(), result.getDescription());
    }

    @Test
    public void when_use_toTransaction_return_TransactionEntity() {

        Transaction result = mapper.toTransaction(dto);

        assertEquals(dto.getTransactionId(), (long) result.getTransactionId());
        assertEquals(dto.getWalletId(), (long) result.getWalletId());
        assertEquals(dto.getDate(), result.getDate());
        assertEquals(dto.getType(), result.getType());
        assertEquals(dto.getQuantity(), result.getQuantity(), 0.0);
        assertEquals(dto.getDescription(), result.getDescription());
    }

    @Test
    public void when_use_toTransactionsDTO_return_ListOfTransactionsDTO() {
        List<TransactionDTO> result = mapper.toTransactionsDTO(entities);

        assertEquals(entities.size(), result.size());

        for (int i = 0; i < entities.size(); i++) {
            assertEquals((long) entities.get(i).getTransactionId(), result.get(i).getTransactionId());
            assertEquals((long) entities.get(i).getWalletId(), result.get(i).getWalletId());
            assertEquals(entities.get(i).getDate(), result.get(i).getDate());
            assertEquals(entities.get(i).getType(), result.get(i).getType());
            assertEquals(entities.get(i).getQuantity(), result.get(i).getQuantity(), 0.0);
            assertEquals(entities.get(i).getDescription(), result.get(i).getDescription());
        }
    }
}