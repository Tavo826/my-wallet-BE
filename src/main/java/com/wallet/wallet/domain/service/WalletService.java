package com.wallet.wallet.domain.service;

import com.wallet.wallet.domain.dto.WalletDTO;
import com.wallet.wallet.domain.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class WalletService {

    @Autowired
    WalletRepository repository;

    private Optional<WalletDTO> getWalletByUserId(String userId) {
        return repository.findByUserId(userId);
    }

    private WalletDTO saveWallet(WalletDTO walletDTO) {
        return repository.save(walletDTO);
    }

    private String deleteWallet(Long walletId) {
        boolean deleteOk = repository.delete(walletId);

        if (deleteOk) {
            return "Deleted walled: " + walletId;
        }
        return "Error deleting wallet: " + walletId;
    }

    private List<WalletDTO> findAllWallets() {
        return repository.findAll();
    }

}
