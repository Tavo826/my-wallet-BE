package com.wallet.wallet.domain.service;

import com.wallet.wallet.domain.dto.TransactionDTO;
import com.wallet.wallet.domain.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    TransactionRepository repository;

    public List<TransactionDTO> getByWalletId(Long walletId) {
        return repository.findByWalletId(walletId);
    }

    public TransactionDTO save(TransactionDTO transaction) {
        return repository.save(transaction);
    }

    public Optional<TransactionDTO> getById(Long id){
        return repository.findById(id);
    }

    public Optional<List<TransactionDTO>> getByDate(LocalDate date){
        return repository.findByDate(date);
    }

    public Optional<List<TransactionDTO>> getByQuantity(double quantity){
        return repository.findByQuantity(quantity);
    }

    public Optional<List<TransactionDTO>> getByType(String type){
        return repository.findByType(type);
    }
}
