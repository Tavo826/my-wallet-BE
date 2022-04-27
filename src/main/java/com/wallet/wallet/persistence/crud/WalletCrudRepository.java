package com.wallet.wallet.persistence.crud;

import com.wallet.wallet.persistence.entity.Wallet;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface WalletCrudRepository extends CrudRepository<Wallet, Long> {

    Optional<Wallet> findByWalletId(Long walletId);
    Optional<Wallet> findByUserId(String userId);

}
