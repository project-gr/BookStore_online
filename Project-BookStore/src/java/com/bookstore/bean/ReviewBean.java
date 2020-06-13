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
public class ReviewBean {
    
    private String username;
    private String isbn;
    private int rating;
    private String reviewText;

    public ReviewBean() {
    }

    public ReviewBean(String username, String isbn, int rating, String reviewText) {
        this.username = username;
        this.isbn = isbn;
        this.rating = rating;
        this.reviewText = reviewText;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
    }
    
}
