package com.wallet.wallet.domain.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class WalletDTO {

    private String uid;
    private Double total;

}
