package com.wallet.wallet.domain.service;

import com.wallet.wallet.domain.dto.WalletDTO;
import com.wallet.wallet.domain.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class WalletService {

    @Autowired
    WalletRepository repository;

    private Optional<WalletDTO> getWalletByUserId(String userId) {
        return repository.findByUserId(userId);
    }

}
