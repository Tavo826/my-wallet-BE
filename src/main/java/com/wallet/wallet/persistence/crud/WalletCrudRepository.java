package com.wallet.persistence.crud;

import com.wallet.persistence.entity.Wallet;
import org.springframework.data.repository.CrudRepository;

public interface WalletCrudRepository extends CrudRepository<Wallet, Long> {
}
