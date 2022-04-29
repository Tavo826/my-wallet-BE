package com.wallet.wallet.web.controller;

import com.wallet.wallet.domain.dto.ReminderDTO;
import com.wallet.wallet.domain.service.ReminderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/reminders")
public class ReminderController {

    @Autowired
    ReminderService service;

    @GetMapping
    public ResponseEntity<List<ReminderDTO>> getByWalletId(Long walletId) {
        return ResponseEntity.ok(service.getByWalletId(walletId));
    }

    @PostMapping
    public ResponseEntity<ReminderDTO> save(@RequestBody ReminderDTO reminder) {
        return ResponseEntity.ok(service.save(reminder));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ReminderDTO> getById(Long id) {
        return ResponseEntity.of(service.getById(id));
    }

    //    @GetMapping("/date")
//    public Optional<List<ReminderDTO>> getByDate(@RequestParam String date) {
//        return service.getByDate(date);
//    }
//
//    public Optional<List<ReminderDTO>> getByQuantity(double quantity) {
//        return repository.findByQuantity(quantity);
//    }
//
//    public Optional<List<ReminderDTO>> getByType(String type) {
//        return repository.findByType(type);
//    }
//
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.delete(id));
    }
}
