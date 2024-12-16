package com.dianaglobal.walletgeneration.controller;

import com.dianaglobal.walletgeneration.model.Address;
import com.dianaglobal.walletgeneration.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/addresses")
public class AddressController {

    @Autowired
    private AddressRepository repository;

    @PostMapping
    public Address createAddress(@RequestBody Address address) {
        return repository.save(address);
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Address> getAddressByUserId(@PathVariable String userId) {
        System.out.println("Fetching userId: " + userId);
        return repository.findByUserId(userId)
                .map(address -> {
                    System.out.println("Address found: " + address);
                    return ResponseEntity.ok(address);
                })
                .orElseGet(() -> {
                    System.out.println("No address found for userId: " + userId);
                    return ResponseEntity.notFound().build();
                });
    }

    @GetMapping("/all")
    public ResponseEntity<List<Address>> getAllAddresses() {
        List<Address> addresses = repository.findAll();
        System.out.println("Dados do MongoDB: " + addresses);
        return ResponseEntity.ok(addresses);
    }
}
