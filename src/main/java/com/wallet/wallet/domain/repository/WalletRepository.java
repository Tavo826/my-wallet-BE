package com.wallet.wallet.domain.repository;

import com.wallet.wallet.domain.dto.WalletDTO;

import java.util.List;
import java.util.Optional;


public interface WalletRepository{

    Optional<WalletDTO> findByUserId(String userId);

    WalletDTO save(WalletDTO walletDTO);

    /*Admin*/
    List<WalletDTO> findAll();

}
