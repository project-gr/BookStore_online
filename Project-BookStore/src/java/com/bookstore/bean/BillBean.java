/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.bean;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class BillBean {
    
    private int orderID;
    private String username;
    private Date orderDate;
    private float totalPrice;

    public BillBean() {
    }

    public BillBean(int orderID, String username, Date orderDate, float totalPrice) {
        this.orderID = orderID;
        this.username = username;
        this.orderDate = orderDate;
        this.totalPrice = totalPrice;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    
}
