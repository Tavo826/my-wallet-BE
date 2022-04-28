package com.wallet.wallet.persistence.repository;

import com.wallet.wallet.domain.dto.TransactionDTO;
import com.wallet.wallet.domain.repository.TransactionRepository;
import com.wallet.wallet.persistence.crud.TransactionCrudRepository;
import com.wallet.wallet.persistence.entity.Transaction;
import com.wallet.wallet.persistence.mapper.TransactionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransactionRepositoryImpl implements TransactionRepository {

    @Autowired
    TransactionCrudRepository repository;

    @Autowired
    TransactionMapper mapper;

    @Override
    public List<TransactionDTO> findAll() {
        return mapper.toTransactionsDTO((List<Transaction>) repository.findAll());
    }

    @Override
    public TransactionDTO save(TransactionDTO transactionDTO) {
        return mapper.toTransactionDTO(repository.save(mapper.toTransaction(transactionDTO)));
    }

    @Override
    public boolean delete(Long transactionId) {
        try {
            repository.deleteById(transactionId);
            return true;
        } catch (Exception err) {
            System.out.println("Transaction delete error: " + err);
            return false;
        }
    }
}
