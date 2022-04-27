package com.wallet.wallet.persistence.mapper;

import com.wallet.wallet.domain.dto.TransactionDTO;
import com.wallet.wallet.domain.dto.WalletDTO;
import com.wallet.wallet.persistence.entity.Transaction;
import com.wallet.wallet.persistence.entity.Wallet;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring", uses = {ReminderMapper.class, TransactionMapper.class})
public interface WalletMapper {

    WalletDTO toWalletDTO(Wallet wallet);

    List<WalletDTO> toWalletsDTO(List<Wallet> wallets);

    @InheritInverseConfiguration
    Wallet toWallet(WalletDTO walletDTO);

}
