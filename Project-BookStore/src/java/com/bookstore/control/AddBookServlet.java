/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.control;

import com.bookstore.bean.AuthorBean;
import com.bookstore.bean.CategoryBean;
import com.bookstore.context.DBcontext;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "AddBookServlet", urlPatterns = {"/AddBookServlet"})
@MultipartConfig(maxFileSize = 1024 * 1024 * 10)
public class AddBookServlet extends HttpServlet {

    public AddBookServlet() throws Exception {
        this.connection = DBcontext.getConnection();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        }
    }

    String isbn, title, publisher, description, author, category;
    int inventory, authorid, categoryid;
    float price;

    String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=bookstore;user=sa;password=sa";
    Connection connection;
    Statement statement = null; //step 4
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

//      Folder save image
        Part part = request.getPart("coverImage");
        String fileName = extractFileName(part);
        String savePath = File.separator + fileName;
        File fileSaveDir = new File(savePath);

        part.write(savePath + File.separator);

        try {

            isbn = request.getParameter("isbn");
            title = request.getParameter("title");
            price = Float.parseFloat(request.getParameter("price"));
            publisher = request.getParameter("publisher");
            inventory = Integer.parseInt(request.getParameter("inventory"));
            description = request.getParameter("description");

            statement = connection.createStatement();

            String query = "insert into books values('" + isbn + "','" + title + "','" + price + "','"
                    + publisher + "','" + inventory + "','" + description + "','" + savePath + "','');";
            statement.execute(query);

            authorid = Integer.parseInt(request.getParameter("authorid"));
            categoryid = Integer.parseInt(request.getParameter("categoryid"));
            author = request.getParameter("author");
            category = request.getParameter("category");

            rs = statement.executeQuery("select * from author where author_id = " + authorid);
            AuthorBean authorBean = null;
            while (rs.next()) {
                authorBean = new AuthorBean(rs.getInt(1), rs.getString(2));
            }

            if (authorBean == null) {
                String addAuthor = "insert into author values(" + authorid + ",'" + author + "');";
                statement.execute(addAuthor);
                String addAuthorBook = "insert into author_book values(" + authorid + ",'" + isbn + "');";
                statement.execute(addAuthorBook);
            } else {
                String addAuthorBook = "insert into author_book values(" + authorid + ",'" + isbn + "');";
                statement.execute(addAuthorBook);
            }

            rs = statement.executeQuery("select * from category where category_id = " + categoryid);
            CategoryBean categoryBean = null;
            while (rs.next()) {
                categoryBean = new CategoryBean(rs.getInt(1), rs.getString(2));
            }

            if (categoryBean == null) {
                String addCategory = "insert into category values(" + categoryid + ",'" + category + "');";
                statement.execute(addCategory);
                String addCategoryBook = "insert into category_book values(" + categoryid + ",'" + isbn + "');";
                statement.execute(addCategoryBook);
            } else {
                String addCategoryBook = "insert into category_book values(" + categoryid + ",'" + isbn + "');";
                statement.execute(addCategoryBook);
            }

            response.sendRedirect("Home.jsp");
            out.close();

        } catch (SQLException ex) {
            Logger.getLogger(AddBookServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }
        return "";
    }

}
