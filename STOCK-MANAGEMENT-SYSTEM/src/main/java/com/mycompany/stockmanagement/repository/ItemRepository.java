package com.mycompany.stockmanagement.repository;

import com.mycompany.stockmanagement.entities.ITEM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ITEM, Integer> {

}

