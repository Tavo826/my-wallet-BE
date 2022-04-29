package com.wallet.wallet.web.controller;

import com.wallet.wallet.domain.dto.TransactionDTO;
import com.wallet.wallet.domain.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    @Autowired
    TransactionService service;

    @GetMapping
    public ResponseEntity<List<TransactionDTO>> getByWalletId(Long walletId) {
        return ResponseEntity.ok(service.getByWalletId(walletId));
    }

    @PostMapping
    public ResponseEntity<TransactionDTO> save(@RequestBody TransactionDTO reminder) {
        return ResponseEntity.ok(service.save(reminder));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TransactionDTO> getById(Long id) {
        return ResponseEntity.of(service.getById(id));
    }

    //    @GetMapping("/date")
//    public Optional<List<TransactionDTO>> getByDate(@RequestParam String date) {
//        return service.getByDate(date);
//    }
//
//    public Optional<List<TransactionDTO>> getByQuantity(double quantity) {
//        return repository.findByQuantity(quantity);
//    }
//
//    public Optional<List<TransactionDTO>> getByType(String type) {
//        return repository.findByType(type);
//    }
//
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.deleteById(id));
    }
}
