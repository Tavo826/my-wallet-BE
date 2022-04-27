package com.wallet.wallet.domain.repository;

import com.wallet.wallet.domain.dto.TransactionDTO;
import org.springframework.stereotype.Repository;


public interface TransactionRepository {

    String saveTransaction(TransactionDTO transactionDTO);

}
