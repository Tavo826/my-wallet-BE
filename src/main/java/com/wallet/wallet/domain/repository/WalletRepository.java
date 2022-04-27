package com.wallet.wallet.domain.repository;

import com.wallet.wallet.domain.dto.WalletDTO;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WalletRepository {
    List<WalletDTO> findAll();

    Optional<WalletDTO> findByUserId(String userId);

    WalletDTO save(WalletDTO walletDTO);

}
