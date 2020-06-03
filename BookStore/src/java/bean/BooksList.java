/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.ArrayList;

/**
 *
 * @author Ren
 */
public class BooksList {
    ArrayList<BookBean> bookList = new ArrayList<BookBean>();

    public BooksList() {
    }
    
    public void add (BookBean book){
        bookList.add(book);
    }

    public ArrayList<BookBean> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<BookBean> bookList) {
        this.bookList = bookList;
    }
}
