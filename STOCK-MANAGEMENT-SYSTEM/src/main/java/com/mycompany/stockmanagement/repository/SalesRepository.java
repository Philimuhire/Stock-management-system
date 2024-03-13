package com.mycompany.stockmanagement.repository;

import com.mycompany.stockmanagement.entities.SALES;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface SalesRepository extends JpaRepository<SALES, Integer> {

    List<SALES> findByCustomerID(int customerID);

    List<SALES> findBySaleDateBetween(Date startDate, Date endDate);
}


