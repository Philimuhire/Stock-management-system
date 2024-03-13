/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stockmanagement.entities;

/**
 *
 * @author PHILBERT
 */
import java.util.List;

public class REPORT {
    // Method to generate sales report
    public void generateSalesReport(List<SALES> salesList) {
        System.out.println("Sales Report:");
        System.out.println("---------------------------------------------");
        System.out.println("SaleID\tItemName\tQuantity\tPrice\tCustomer\tSaleDate");
        for (SALES sale : salesList) {
            System.out.println(sale.getSaleID() + "\t" + sale.getItemName() + "\t" + sale.getQuantity() +
                    "\t" + sale.getPrice() + "\t" + sale.getCustomer() + "\t" + sale.getSaleDate());
        }
        System.out.println("---------------------------------------------");
    }

    // Method to generate purchase report
    public void generatePurchaseReport(List<PURCHASE> purchaseList) {
        System.out.println("Purchase Report:");
        System.out.println("---------------------------------------------");
        System.out.println("PurchaseID\tItemName\tQuantity\tPrice\tSupplier\tPurchaseDate");
        for (PURCHASE purchase : purchaseList) {
            System.out.println(purchase.getPurchaseID() + "\t" + purchase.getItemName() + "\t" + purchase.getQuantity() +
                    "\t" + purchase.getPrice() + "\t" + purchase.getSupplier() + "\t" + purchase.getPurchaseDate());
        }
        System.out.println("---------------------------------------------");
    }

    // Method to generate stock report
    public void generateStockReport(List<ITEM> itemList) {
        System.out.println("Stock Report:");
        System.out.println("---------------------------------------------");
        System.out.println("ItemID\tItemName\tDescription\tPrice\tQuantity");
        for (ITEM item : itemList) {
            System.out.println(item.getItemID() + "\t" + item.getItemName() + "\t" + item.getDescription() +
                    "\t" + item.getPrice() + "\t" + item.getQuantity());
        }
        System.out.println("---------------------------------------------");
    }
}

