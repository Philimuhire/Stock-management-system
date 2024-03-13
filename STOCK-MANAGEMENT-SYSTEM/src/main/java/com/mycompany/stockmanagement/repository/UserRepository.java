package com.mycompany.stockmanagement.repository;

import com.mycompany.stockmanagement.entities.USER;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<USER, Integer> {
    
   
}

