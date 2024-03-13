package com.mycompany.stockmanagement.repository;

import com.mycompany.stockmanagement.entities.PURCHASE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepository extends JpaRepository<PURCHASE, Integer> {
    
}

