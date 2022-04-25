package com.wallet.wallet.domain.dto;

import com.wallet.wallet.domain.enums.TypeEnum;
import lombok.NonNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class ReminderDTO {

    private String walletID;
    private LocalDate date;
    private TypeEnum type;
    private Double quantity;
    private String description;
    private LocalDateTime remindMe;

    public ReminderDTO() {}

    public ReminderDTO(
            @NonNull String walletID,
            @NonNull LocalDate date,
            @NonNull TypeEnum type,
            @NonNull Double quantity,
            @NonNull String description,
            @NonNull LocalDateTime remindMe) {

        this.walletID = walletID;
        this.date = date;
        this.type = type;
        this.quantity = quantity;
        this.description = description;
        this.remindMe = remindMe;
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

    public LocalDateTime getRemindMe() {
        return remindMe;
    }

    public void setRemindMe(LocalDateTime remindMe) {
        this.remindMe = remindMe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReminderDTO reminder = (ReminderDTO) o;
        return Objects.equals(walletID, reminder.walletID) && Objects.equals(date, reminder.date) && type == reminder.type && Objects.equals(quantity, reminder.quantity) && Objects.equals(description, reminder.description) && Objects.equals(remindMe, reminder.remindMe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(walletID, date, type, quantity, description, remindMe);
    }

    @Override
    public String toString() {
        return "Reminder{" +
                "walletID='" + walletID + '\'' +
                ", date=" + date +
                ", type=" + type +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                ", remindMe=" + remindMe +
                '}';
    }
}
