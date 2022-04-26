package com.wallet.wallet.persistence.repository;

import com.wallet.wallet.domain.dto.WalletDTO;
import com.wallet.wallet.domain.repository.WalletRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class WalletRepositoryImpl implements WalletRepository {
    @Override
    public List<WalletDTO> findAll() {
        return null;
    }

    @Override
    public Optional<WalletDTO> findByUserId(String userId) {
        return Optional.empty();
    }

    @Override
    public WalletDTO save() {
        return null;
    }
}
