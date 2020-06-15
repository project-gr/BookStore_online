/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.bean;

/**
 *
 * @author ADMIN
 */
public class OrderBean {
    
    private int orderID;
    private String isbn;
    private int quantity;
    
    private BookBean book;
    private BookBean price;

    public BookBean getBook() {
        return book;
    }

    public void setBook(BookBean book) {
        this.book = book;
    }

    public BookBean getPrice() {
        return price;
    }

    public void setPrice(BookBean price) {
        this.price = price;
    }

    
    
    
    public OrderBean() {
        super();
    }

    public OrderBean(int orderID, String isbn, int quantity) {
        this.orderID = orderID;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
}
