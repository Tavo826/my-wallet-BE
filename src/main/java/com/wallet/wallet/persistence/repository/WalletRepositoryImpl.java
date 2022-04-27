package com.wallet.wallet.persistence.repository;

import com.wallet.wallet.domain.dto.WalletDTO;
import com.wallet.wallet.domain.repository.WalletRepository;
import com.wallet.wallet.persistence.crud.WalletCrudRepository;
import com.wallet.wallet.persistence.entity.Wallet;
import com.wallet.wallet.persistence.mapper.WalletMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class WalletRepositoryImpl implements WalletRepository {

    @Autowired
    WalletCrudRepository repository;

    @Autowired
    WalletMapper mapper;

    @Override
    public List<WalletDTO> findAll() {
        return mapper.toWalletsDTO((List<Wallet>) repository.findAll());
    }

    @Override
    public Optional<WalletDTO> findByUserId(String userId) {
        return repository.findByUserId(userId).map(wallet -> mapper.toWalletDTO(wallet));
    }

    @Override
    public WalletDTO save(WalletDTO wallet) {
        return mapper.toWalletDTO(repository.save(mapper.toWallet(wallet)));
    }
}
