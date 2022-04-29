package com.wallet.wallet.persistence.repository;

import com.wallet.wallet.domain.dto.TransactionDTO;
import com.wallet.wallet.domain.repository.TransactionRepository;
import com.wallet.wallet.persistence.crud.TransactionCrudRepository;
import com.wallet.wallet.persistence.mapper.TransactionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class TransactionRepositoryImpl implements TransactionRepository {

    @Autowired
    TransactionCrudRepository repository;

    @Autowired
    TransactionMapper mapper;


    @Override
    public String delete(Long id) {
        return findById(id).map(transactionDTO -> {
            repository.deleteById(id);
            return "Transaction with ID " + id + " Deleted!";
        }).orElse("Transaction with ID " + id + " not Found!");
    }

    @Override
    public List<TransactionDTO> findByWalletId(Long id) {
        return mapper.toTransactionsDTO(repository.findByWalletId(id));
    }

    @Override
    public TransactionDTO save(TransactionDTO transactionDTO) {
        return mapper.toTransactionDTO(repository.save(mapper.toTransaction(transactionDTO)));
    }

    @Override
    public Optional<TransactionDTO> findById(Long id) {
        return repository.findById(id).map(transaction -> mapper.toTransactionDTO(transaction));
    }

    @Override
    public Optional<List<TransactionDTO>> findByDate(LocalDate date) {
        return repository.findByDate(date).map(transactions -> mapper.toTransactionsDTO(transactions));
    }

    @Override
    public Optional<List<TransactionDTO>> findByQuantity(double quantity) {
        return repository.findByQuantity(quantity).map(transactions -> mapper.toTransactionsDTO(transactions));
    }

    @Override
    public Optional<List<TransactionDTO>> findByType(String type) {
        return repository.findByType(type).map(transactions -> mapper.toTransactionsDTO(transactions));
    }
}
