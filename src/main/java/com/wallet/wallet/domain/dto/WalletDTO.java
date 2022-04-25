package com.wallet.wallet.domain.dto;

import lombok.NonNull;

import java.util.Objects;

public class WalletDTO {

    private String uid;
    private Double total;

    public WalletDTO() {}

    public WalletDTO(
            @NonNull String uid,
            @NonNull Double total) {

        this.uid = uid;
        this.total = total;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WalletDTO walletDTO = (WalletDTO) o;
        return Objects.equals(uid, walletDTO.uid) && Objects.equals(total, walletDTO.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, total);
    }

    @Override
    public String toString() {
        return "WalletDTO{" +
                "uid='" + uid + '\'' +
                ", total=" + total +
                '}';
    }
}
