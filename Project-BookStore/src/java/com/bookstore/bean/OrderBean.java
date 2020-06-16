/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.bean;

import com.bookstore.dao.BookDAO;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public String getTitle() {
        String title = "";
        try {
            title = new BookDAO().selectBook(isbn).getTitle();
        } catch (Exception e) {

        }
        return title;
    }

    public float getPrice() {
        float price = 0;
        try {
            price = new BookDAO().selectBook(isbn).getPrice();
        } catch (Exception e) {

        }
        return price;
    }

    public float getTotalPrice() {
        float price = 0;
        try {
            price = this.quantity * new BookDAO().selectBook(isbn).getPrice();
        } catch (Exception ex) {
            Logger.getLogger(OrderBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return price;
    }


    public boolean enoughInventory() {
        boolean retVal = true;
        try {
            if (quantity > new BookDAO().selectBook(isbn).getInventory()) {
                retVal = false;
            }
        } catch (Exception ex) {
            Logger.getLogger(OrderBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retVal;
    }

    public void commitInventoryDecrement() {
        BookDAO bookDAO = new BookDAO();
        BookBean book;
        try {
            book = bookDAO.selectBook(isbn);
            book.setInventory(book.getInventory() - quantity);
            bookDAO.update(book);
        } catch (Exception ex) {
            Logger.getLogger(OrderBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getCoverImage() {
        String coverImage = "";
        try {
            coverImage = new BookDAO().selectBook(isbn).getCoverImage();
        } catch (Exception e) {

        }
        return coverImage;
    }
}
