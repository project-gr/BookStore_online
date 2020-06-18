/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
@WebServlet(name = "DeleteBook", urlPatterns = {"/DeleteBook"})
public class DeleteBook extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String isbn, title, publisher, description, author, category;
    int inventory, authorid, categoryid;
    float price;

    String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=bookstore;user=sa;password=sa";
    Connection connection;
    Statement statement = null; //step 4
    PreparedStatement ps = null;
    ResultSet rs = null;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {

            isbn = request.getParameter("isbn");

            statement = connection.createStatement();

            String query = "delete from books where isbn = '" + isbn + "','" + title + "'," + price + ",'"
                    + publisher + "'," + inventory + ",'" + description + "','" + savePath + "','');";
            statement.execute(query);

            

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

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
