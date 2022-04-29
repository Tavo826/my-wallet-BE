package com.wallet.wallet.domain.service;

import com.wallet.wallet.domain.dto.WalletDTO;
import com.wallet.wallet.domain.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WalletService {

    @Autowired
    WalletRepository repository;

    public List<WalletDTO> getAll() {
        return repository.findAll();
    }

    public Optional<WalletDTO> getByUserId(String uId) {
        return repository.findByUserId(uId);
    }

    public WalletDTO saveWallet(WalletDTO wallet) {
        return repository.save(wallet);
    }

    public String delete(Long id) {
        return repository.delete(id);
    }

}
