package com.wallet.wallet.persistence.mapper;

import com.wallet.wallet.domain.dto.WalletDTO;
import com.wallet.wallet.persistence.entity.Wallet;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {ReminderMapper.class, TransactionMapper.class})
public interface WalletMapper {

    WalletDTO toWalletDTO(Wallet wallet);

    @InheritInverseConfiguration
    Wallet toWallet(WalletDTO walletDTO);
}
