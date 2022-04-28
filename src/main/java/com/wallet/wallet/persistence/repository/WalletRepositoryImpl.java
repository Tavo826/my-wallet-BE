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
    public Optional<WalletDTO> findByUserId(String userId) {
        return repository.findByUserId(userId).map(wallet1 -> mapper.toWalletDTO(wallet1));
    }

    @Override
    public WalletDTO save(WalletDTO walletDTO) {
        return mapper.toWalletDTO(repository.save(mapper.toWallet(walletDTO)));

    }

    @Override
    public boolean delete(Long walletId) {
        try {
            repository.deleteById(walletId);
            return true;
        } catch (Exception err) {
            System.out.println("Wallet delete error" + err);
            return false;
        }

    }

    /*Admin*/

    @Override
    public List<WalletDTO> findAll() {
        return mapper.toWalletsDTO((List<Wallet>) repository.findAll());
    }



}
