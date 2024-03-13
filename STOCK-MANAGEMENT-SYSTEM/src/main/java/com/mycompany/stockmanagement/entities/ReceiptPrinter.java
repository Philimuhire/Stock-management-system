/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stockmanagement.entities;

/**
 *
 * @author PHILBERT
 */
public class ReceiptPrinter {
    // Method to print a receipt for a sales transaction
    public void printReceipt(SALES sale) {
        // Implement logic to format and print the receipt for the given sale
        System.out.println("Receipt for Sale #" + sale.getSaleID());
        System.out.println("---------------------------------------------");
        System.out.println("Item: " + sale.getItemName());
        System.out.println("Quantity: " + sale.getQuantity());
        System.out.println("Price: $" + sale.getPrice());
        System.out.println("Customer: " + sale.getCustomer());
        System.out.println("Sale Date: " + sale.getSaleDate());
        System.out.println("---------------------------------------------");
        System.out.println("Thank you for your purchase!");
    }
}

