package com.wallet.wallet.domain.repository;

import com.wallet.wallet.domain.dto.ReminderDTO;
import com.wallet.wallet.domain.dto.TransactionDTO;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface TransactionRepository {

    List<TransactionDTO> findAll();

    TransactionDTO save(TransactionDTO transactionDTO);

    boolean delete(Long transactionId);

}
