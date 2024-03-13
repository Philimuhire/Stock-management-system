package com.mycompany.stockmanagement.service;

import com.mycompany.stockmanagement.entities.PURCHASE;
import com.mycompany.stockmanagement.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;


@Service
public class PurchaseService {
    
    private final PurchaseRepository purchaseRepository;

    @Autowired
    public PurchaseService(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    
    public PURCHASE getPurchaseById(int purchaseId) {
        return purchaseRepository.findById(purchaseId).orElse(null);
    }
    
    public void savePurchase(PURCHASE purchase) {
        purchaseRepository.save(purchase);
    }
    
public boolean deletePurchase(int purchaseId) {
    if (purchaseRepository.existsById(purchaseId)) {
        purchaseRepository.deleteById(purchaseId);
        return true;
    } else {
        return false;
    }
}
    
    public List<PURCHASE> getAllPurchases() {
        return purchaseRepository.findAll();
    }
    
    public int getTotalPurchases() {
        List<PURCHASE> allPurchases = purchaseRepository.findAll();
        return allPurchases.size();
    }
     
    public PURCHASE createPurchase(PURCHASE purchase) {
        return purchaseRepository.save(purchase);
    }
    
    public PURCHASE updatePurchase(int purchaseId, PURCHASE updatedPurchase) {
        Optional<PURCHASE> existingPurchaseOptional = purchaseRepository.findById(purchaseId);
        if (existingPurchaseOptional.isPresent()) {
            PURCHASE existingPurchase = existingPurchaseOptional.get();
            // Update the fields of existingPurchase with the fields of updatedPurchase
            existingPurchase.setItemName(updatedPurchase.getItemName());
            existingPurchase.setQuantity(updatedPurchase.getQuantity());
            existingPurchase.setPrice(updatedPurchase.getPrice());
            existingPurchase.setSupplier(updatedPurchase.getSupplier());
            existingPurchase.setPurchaseDate(updatedPurchase.getPurchaseDate());
            // Save the updated purchase
            return purchaseRepository.save(existingPurchase);
        } else {
            // If the purchase with the given ID does not exist, return null or throw an exception
            return null;
        }
    }
    
    
}

