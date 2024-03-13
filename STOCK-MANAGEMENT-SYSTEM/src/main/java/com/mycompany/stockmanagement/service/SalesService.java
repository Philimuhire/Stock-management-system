package com.mycompany.stockmanagement.service;

import com.mycompany.stockmanagement.entities.SALES;
import com.mycompany.stockmanagement.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SalesService {

    private final SalesRepository salesRepository;

    @Autowired
    public SalesService(SalesRepository salesRepository) {
        this.salesRepository = salesRepository;
    }

    public List<SALES> getAllSales() {
        return salesRepository.findAll();
    }
    
    public int getTotalSales() {
        List<SALES> allSales = getAllSales();
        return allSales.size();
    }

    

    public SALES getSaleById(int saleId) {
        return salesRepository.findById(saleId).orElse(null);
    }

    public SALES createSale(SALES sale) {
        return salesRepository.save(sale);
    }

    public SALES updateSale(int saleId, SALES updatedSale) {
        if (salesRepository.existsById(saleId)) {
            updatedSale.setSaleID(saleId);
            return salesRepository.save(updatedSale);
        } else {
            return null;
        }
    }

    public boolean deleteSale(int saleId) {
        if (salesRepository.existsById(saleId)) {
            salesRepository.deleteById(saleId);
            return true;
        } else {
            return false;
        }
    }

    public List<SALES> getSalesByCustomer(int customerID) {
        return salesRepository.findByCustomerID(customerID);
    }

    public List<SALES> getSalesByDateRange(Date startDate, Date endDate) {
        return salesRepository.findBySaleDateBetween(startDate, endDate);
    }
}


