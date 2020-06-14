package com.bookstore.dao;

import com.bookstore.bean.BookBean;
import com.bookstore.context.DBcontext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ren
 */
public class BookDAO implements DAO<BookBean> {

    static Connection conn = null; // access to sql server 
    static PreparedStatement ps = null; // ném query từ netbean qua sql server
    static ResultSet rs = null;

    @Override
    public List<BookBean> getList() {
        List<BookBean> bookList = null;
        BookBean bookBean = null;

        try {
            bookList = new ArrayList<BookBean>();
            String query = "select * from books";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                bookBean = new BookBean();
                bookBean.setIsbn(rs.getString(1));
                bookBean.setTitle(rs.getString(2));
                bookBean.setPrice(rs.getFloat(3));
                bookBean.setPublisher(rs.getString(4));
                bookBean.setInventory(rs.getInt(5));
                bookBean.setDescription(rs.getString(6));
                bookBean.setCoverImage(rs.getString(7));

                bookList.add(bookBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookList;
    }


    @Override
    public List<BookBean> getElement(String title) {
        List<BookBean> bookList = null;
        BookBean bookBean = null;

        try {
            bookList = new ArrayList<BookBean>();
            bookBean = new BookBean();
            String query = "select * from Books where title =?";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);

            ps.setString(1, title);

            rs = ps.executeQuery();

            while (rs.next()) {
                bookBean = new BookBean();
                bookBean.setIsbn(rs.getString(1));
                bookBean.setTitle(rs.getString(2));
                bookBean.setPrice(rs.getFloat(3));
                bookBean.setPublisher(rs.getString(4));
                bookBean.setInventory(rs.getInt(5));
                bookBean.setDescription(rs.getString(6));
                bookBean.setCoverImage(rs.getString(7));

                bookList.add(bookBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookList;
    }

    @Override
    public boolean add(BookBean bookBean) {
        boolean b = false;

        try {
            String query = "insert into books (isbn, title, price, publisher, inventory, description, cover_image) values"
                    + "(" + bookBean.getIsbn() + ", " + bookBean.getTitle() + ", " + bookBean.getPrice() + ", "
                    + bookBean.getPublisher() + ", " + bookBean.getInventory() + ", " + bookBean.getDescription() + ", " + bookBean.getCoverImage();
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
    public boolean delete(String isbn) {
        boolean b = false;

        try {
            String query = "delete from Books where isbn = ?";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);

            ps.setString(1, isbn);

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
            String query = "update Books set title = " + bookBean.getTitle() + ", price = "
                    + bookBean.getPrice() + ", publisher = "
                    + bookBean.getPublisher() + ", inventory = " + bookBean.getInventory()
                    + ", description = " + bookBean.getDescription()
                    + ", cover_image = " + bookBean.getCoverImage()
                    + " where isbn = " + bookBean.getIsbn();
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
