package com.wallet.wallet.web.controller;

import com.wallet.wallet.domain.dto.WalletDTO;
import com.wallet.wallet.domain.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wallets")
public class WalletController {

    @Autowired
    private WalletService service;

    @GetMapping
    public ResponseEntity<List<WalletDTO>> get() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("user/{id}")
    public ResponseEntity<WalletDTO> getByUid(@PathVariable("id") String uId) {
        return ResponseEntity.of(service.getByUserId(uId));
    }

    @PostMapping
    public ResponseEntity<WalletDTO> save(@RequestBody WalletDTO wallet) {
        return ResponseEntity.ok(service.saveWallet(wallet));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(service.delete(id));
    }
}
