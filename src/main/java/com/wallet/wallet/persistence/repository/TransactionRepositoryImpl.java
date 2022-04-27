package com.wallet.wallet.persistence.repository;

import com.wallet.wallet.domain.dto.TransactionDTO;
import com.wallet.wallet.domain.repository.TransactionRepository;
import com.wallet.wallet.persistence.crud.TransactionCrudRepository;
import com.wallet.wallet.persistence.entity.Transaction;
import com.wallet.wallet.persistence.mapper.TransactionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TransactionRepositoryImpl implements TransactionRepository {

    @Autowired
    TransactionCrudRepository repository;

    @Autowired
    TransactionMapper mapper;

    @Override
    public String saveTransaction(TransactionDTO transactionDTO) {
        repository.save(mapper.toTransaction(transactionDTO));
        return transactionDTO.getQuantity().toString();
    }
}
