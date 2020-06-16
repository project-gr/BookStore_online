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
@WebServlet(name = "SignUpServlet", urlPatterns = {"/SignUpServlet"})
@MultipartConfig(maxFileSize = 1024 * 1024 * 10)
public class SignUpServlet extends HttpServlet {

    public SignUpServlet() throws Exception {
        this.connection = DBcontext.getConnection();
    }

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
    String username, pass, fName, address, phone, email;

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

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

//      Folder save image
        Part part = request.getPart("avatar");
        String fileName = extractFileName(part);
        String savePath = File.separator + fileName;
        File fileSaveDir = new File(savePath);

        part.write(savePath + File.separator);

        try {

            username = request.getParameter("username");
            pass = request.getParameter("pass");
            fName = request.getParameter("fName");
            address = request.getParameter("address");
            phone = request.getParameter("phone");
            email = request.getParameter("email");

            statement = connection.createStatement();

            String query = "insert into users values('" + username + "','" + pass + "','" + fName + "','"
                    + address + "','" + phone + "','" + email + "','',''," + savePath + "');";
            statement.execute(query);
            

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
