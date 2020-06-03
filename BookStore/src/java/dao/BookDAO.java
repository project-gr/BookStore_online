/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.BookBean;
import bean.BooksList;
import context.DBcontext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ren
 */
public class BookDAO implements DAO{
    
    static Connection conn = null; // access to sql server 
    static PreparedStatement ps = null; // ném query từ netbean qua sql server
    static ResultSet rs = null;
    
    @Override
    public List<BookBean> get() {
        List<BookBean> bookList = null;
        BookBean bookBean = null;
        
        try {
            bookList= new ArrayList<BookBean>();
            String query = "select * from Books";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            
            while (rs.next()){
                bookBean = new BookBean();
                bookBean.setBook_ID(rs.getString(1));
                bookBean.setBook_Name(rs.getString(2));
                bookBean.setAuthor(rs.getString(3));
                bookBean.setCategory(rs.getString(4));
                bookBean.setPrice(rs.getFloat(5));
                bookBean.setDiscount(rs.getFloat(6));
                bookBean.setQuantity(rs.getInt(7));
                
                bookList.add(bookBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookList;
    }

    @Override
    public BookBean getBook(String Book_ID) {
        BookBean bookBean = null;
        
        try {
            bookBean = new BookBean();
            String query = "select * from Books where Book_ID =?";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            
            ps.setString(1, Book_ID);
            
            rs = ps.executeQuery();
            
            while (rs.next()){
                bookBean = new BookBean();
                bookBean.setBook_ID(rs.getString(1));
                bookBean.setBook_Name(rs.getString(2));
                bookBean.setAuthor(rs.getString(3));
                bookBean.setCategory(rs.getString(4));
                bookBean.setPrice(rs.getFloat(5));
                bookBean.setDiscount(rs.getFloat(6));
                bookBean.setQuantity(rs.getInt(7));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookBean;
    }


    @Override
    public boolean save(BookBean bookBean) {
        boolean b = false;
        
        try {
            String query = "insert into Books (Book_ID, Book_Name, Author, Category, Price, Discount, Quantity) values"
                    + "(" + bookBean.getBook_ID() + ", " + bookBean.getBook_Name() + ", " + bookBean.getCategory() + ", "
                    + bookBean.getPrice() + ", " + bookBean.getDiscount() + ", " + bookBean.getQuantity();
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            
            b = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    @Override
    public boolean delete(String Book_ID) {
        boolean b = false;
        
        try {
            String query = "delete from Books where Book_ID = ?";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            
            ps.setString(1, Book_ID);
            
            rs = ps.executeQuery();
            
            b = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    @Override
    public boolean update(BookBean bookBean) {
        boolean b = false;
        
        try {
            String query = "update Books set Book_Name = " + bookBean.getBook_Name() + ", Author = " +
                    bookBean.getAuthor() + ", Category = " + bookBean.getCategory() + ", Price = " +
                    bookBean.getPrice() + ", Discount = " + bookBean.getDiscount() + ", Quantity = " +
                    bookBean.getQuantity() + " where  Book_ID = " + bookBean.getBook_ID();
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            
            b = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }
    
    
//    public List<BookBean> getBooksList() throws Exception {
//        String query = "select * from Books";
//        conn = DBcontext.getConnection();
//        ps = conn.prepareStatement(query);
//        rs = ps.executeQuery();
//
//        List<BookBean> booksList = new ArrayList<>();
//        while (rs.next()) {
//                BookBean bookBean = new BookBean(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5), rs.getFloat(6), rs.getInt(7));
//
////            BookBean bookBean = new BookBean();
//            booksList.add(bookBean);
//        }
//        return booksList;
//    }

}
