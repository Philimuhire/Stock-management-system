/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stockmanagement.entities;

/**
 *
 * @author PHILBERT
 */
import java.util.Date;

public class PURCHASE {
    private int purchaseID;
    private String itemName;
    private int quantity;
    private double price;
    private String supplier;
    private Date purchaseDate;

    // Constructor
    public PURCHASE(int purchaseID, String itemName, int quantity, double price, String supplier, Date purchaseDate) {
        this.purchaseID = purchaseID;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.supplier = supplier;
        this.purchaseDate = purchaseDate;
    }

    // Getters and setters
    public int getPurchaseID() {
        return purchaseID;
    }

    public void setPurchaseID(int purchaseID) {
        this.purchaseID = purchaseID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
