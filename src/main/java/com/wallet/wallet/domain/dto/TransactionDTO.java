package com.wallet.wallet.domain.dto;

import com.wallet.wallet.domain.enums.TypeEnum;
import lombok.NonNull;

import java.time.LocalDate;
import java.util.Objects;

public class TransactionDTO {

    private String walletID;
    private LocalDate date;
    private TypeEnum type;
    private Double quantity;
    private String description;

    public TransactionDTO() {}

    public TransactionDTO(
            @NonNull String walletID,
            @NonNull LocalDate date,
            @NonNull TypeEnum type,
            @NonNull Double quantity,
            @NonNull String description) {

        this.walletID = walletID;
        this.date = date;
        this.type = type;
        this.quantity = quantity;
        this.description = description;
    }

    public String getWalletID() {
        return walletID;
    }

    public void setWalletID(String walletID) {
        this.walletID = walletID;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TransactionDTO that = (TransactionDTO) o;
        return Objects.equals(walletID, that.walletID) && Objects.equals(date, that.date) && type == that.type && Objects.equals(quantity, that.quantity) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(walletID, date, type, quantity, description);
    }

    @Override
    public String toString() {
        return "TransactionDTO{" +
                "walletID='" + walletID + '\'' +
                ", date=" + date +
                ", type=" + type +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                '}';
    }
}
