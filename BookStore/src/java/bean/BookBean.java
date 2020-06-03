/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author Ren
 */
public class BookBean {
    
    private String Book_ID;
    private String Book_Name;
    private String Author;
    private String Category;
    private float price;
    private float discount;
    private int quantity;

    public BookBean() {
    }

    public BookBean(String Book_ID, String Book_Name, String Author, String Category, float price, float discount, int quantity) {
        this.Book_ID = Book_ID;
        this.Book_Name = Book_Name;
        this.Author = Author;
        this.Category = Category;
        this.price = price;
        this.discount = discount;
        this.quantity = quantity;
    }

    public String getBook_ID() {
        System.out.print(Book_ID);
        return Book_ID;
    }

    public void setBook_ID(String Book_ID) {
        this.Book_ID = Book_ID;
    }

    public String getBook_Name() {
        System.out.print(Book_Name);
        return Book_Name;
    }

    public void setBook_Name(String Book_Name) {
        this.Book_Name = Book_Name;
    }

    public String getAuthor() {
        System.out.print(Author);
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getCategory() {
        System.out.print(Category);
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }

    public float getPrice() {
        System.out.print(price);
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getDiscount() {
        System.out.print(discount);
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public int getQuantity() {
        System.out.print(quantity);
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}    