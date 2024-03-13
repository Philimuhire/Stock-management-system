package com.mycompany.stockmanagement.controller;

import com.mycompany.stockmanagement.entities.SALES;
import com.mycompany.stockmanagement.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;


import java.util.Date;
import java.util.List;

@Controller
@RestController
@RequestMapping("/sales")
public class SalesController {

    private final SalesService salesService;

    @Autowired
    public SalesController(SalesService salesService) {
        this.salesService = salesService;
    }

    @GetMapping
    public ResponseEntity<List<SALES>> getAllSales() {
        List<SALES> sales = salesService.getAllSales();
        return new ResponseEntity<>(sales, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SALES> getSaleById(@PathVariable("id") int saleId) {
        SALES sale = salesService.getSaleById(saleId);
        if (sale != null) {
            return new ResponseEntity<>(sale, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<SALES> createSale(@RequestBody SALES sale) {
        SALES createdSale = salesService.createSale(sale);
        return new ResponseEntity<>(createdSale, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SALES> updateSale(@PathVariable("id") int saleId, @RequestBody SALES updatedSale) {
        SALES updated = salesService.updateSale(saleId, updatedSale);
        if (updated != null) {
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSale(@PathVariable("id") int saleId) {
        boolean deleted = salesService.deleteSale(saleId);
        if (deleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/customer/{customer}")
    public ResponseEntity<List<SALES>> getSalesByCustomer(@PathVariable("customer") int customerID) {
        List<SALES> sales = salesService.getSalesByCustomer(customerID);
        return new ResponseEntity<>(sales, HttpStatus.OK);
    }

    @GetMapping("/date")
    public ResponseEntity<List<SALES>> getSalesByDateRange(@RequestParam("startDate") Date startDate,
                                                           @RequestParam("endDate") Date endDate) {
        List<SALES> sales = salesService.getSalesByDateRange(startDate, endDate);
        return new ResponseEntity<>(sales, HttpStatus.OK);
    }
}

