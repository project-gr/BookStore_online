/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.control;

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
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2,
        maxFileSize = 1024 * 1024 * 10,
        maxRequestSize = 1024 * 1024 * 50)
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


    String isbn, title, publisher, description;
    int inventory;
    float price;

    String connectionURL = "jdbc:sqlserver://localhost:1433;databaseName=bookstore;user=sa;password=sa";
    //step 3
    //step 2
    Connection connection; 
    Statement statement = null; //step 4
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
        String savePath = "C:\\Users\\ADMIN\\Desktop\\BookStore_online\\Project-BookStore\\web\\images\\" + File.separator + fileName;
        File fileSaveDir = new File(savePath);

        part.write(savePath + File.separator);

        try{
            
            
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
