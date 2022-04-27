package com.wallet.wallet.persistence.mapper;

import com.wallet.wallet.domain.dto.TransactionDTO;
import com.wallet.wallet.persistence.entity.Transaction;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TransactionMapper {

    TransactionDTO toTransactionDTO(Transaction transaction);

    List<TransactionDTO> toTransactionsDTO(List<Transaction> transactions);

    @InheritInverseConfiguration
    Transaction toTransaction(TransactionDTO transactionDTO);

}
