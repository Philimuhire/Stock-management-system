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

public class SALES {
    private int saleID;
    private String itemName;
    private int quantity;
    private double price;
    private String customer;
    private Date saleDate;

    // Constructor
    public SALES(int saleID, String itemName, int quantity, double price, String customer, Date saleDate) {
        this.saleID = saleID;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.customer = customer;
        this.saleDate = saleDate;
    }

    // Getters and setters
    public int getSaleID() {
        return saleID;
    }

    public void setSaleID(int saleID) {
        this.saleID = saleID;
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

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }
}

