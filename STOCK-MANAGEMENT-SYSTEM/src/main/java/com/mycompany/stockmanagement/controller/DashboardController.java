package com.mycompany.stockmanagement.controller;

import com.mycompany.stockmanagement.service.SalesService;
import com.mycompany.stockmanagement.service.PurchaseService;
import com.mycompany.stockmanagement.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DashboardController {

    private final SalesService salesService;
    private final PurchaseService purchaseService;
    private final CustomerService customerService;

    @Autowired
    public DashboardController(SalesService salesService, PurchaseService purchaseService, CustomerService customerService) {
        this.salesService = salesService;
        this.purchaseService = purchaseService;
        this.customerService = customerService;
    }

    @GetMapping("/dashboard")
    public ModelAndView showDashboard() {
        ModelAndView modelAndView = new ModelAndView("dashboard");

        int totalSales = salesService.getTotalSales();
        int totalPurchases = purchaseService.getTotalPurchases();
        int totalCustomers = customerService.getTotalCustomers();

        modelAndView.addObject("totalSales", totalSales);
        modelAndView.addObject("totalPurchases", totalPurchases);
        modelAndView.addObject("totalCustomers", totalCustomers);

        return modelAndView;
    }
}


