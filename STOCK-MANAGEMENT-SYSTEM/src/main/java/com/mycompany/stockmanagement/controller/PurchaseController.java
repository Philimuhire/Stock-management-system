package com.mycompany.stockmanagement.controller;

import com.mycompany.stockmanagement.entities.PURCHASE;
import com.mycompany.stockmanagement.service.PurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;


import java.util.List;

@Controller
@RestController
@RequestMapping("/api/purchases")
public class PurchaseController {

    private final PurchaseService purchaseService;

    @Autowired
    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @GetMapping
    public ResponseEntity<List<PURCHASE>> getAllPurchases() {
        List<PURCHASE> purchases = purchaseService.getAllPurchases();
        return new ResponseEntity<>(purchases, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PURCHASE> getPurchaseById(@PathVariable("id") int purchaseId) {
        PURCHASE purchase = purchaseService.getPurchaseById(purchaseId);
        if (purchase != null) {
            return new ResponseEntity<>(purchase, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<PURCHASE> createPurchase(@RequestBody PURCHASE purchase) {
        PURCHASE createdPurchase = purchaseService.createPurchase(purchase);
        return new ResponseEntity<>(createdPurchase, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PURCHASE> updatePurchase(@PathVariable("id") int purchaseId, @RequestBody PURCHASE updatedPurchase) {
        PURCHASE purchase = purchaseService.updatePurchase(purchaseId, updatedPurchase);
        if (purchase != null) {
            return new ResponseEntity<>(purchase, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePurchase(@PathVariable("id") int purchaseId) {
        boolean deleted = purchaseService.deletePurchase(purchaseId);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

