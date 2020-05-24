/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import bean.CustomerBean;
import bean.StaffBean;
import dao.CustomerDAO;
import dao.StaffDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ren
 */
@WebServlet(name = "LoginControl", urlPatterns = {"/LoginControl"})
public class LoginControl extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        
        try {
            String action = request.getParameter("action");
            
            if (action.equals("Staff")){
                String StaffUsername = request.getParameter("StaffUsername");
                String StaffPassword = request.getParameter("StaffPassword");
                
                StaffDAO staffDAO = new StaffDAO();
                StaffBean staffBean = staffDAO.checklogin(StaffUsername, StaffPassword);
                
                if (staffBean == null) {
                    request.getRequestDispatcher("StaffLogin.jsp").include (request, response);
                    out.println("<div><h1><b><i> Sorry username or password error!</h1></div>");
                    
                } else {
                    request.getRequestDispatcher("WelcomeStaff.jsp").include (request, response);
                }
            } else if (action.equals("Cus")){
                String CusUsername = request.getParameter("CusUsername");
                String CusPassword = request.getParameter("CusPassword");
                
                CustomerDAO customerDAO = new CustomerDAO();
                CustomerBean customerBean = customerDAO.checklogin(CusUsername, CusPassword);
                
                if (customerBean == null) {
                    request.getRequestDispatcher("CusLogin.jsp").include (request, response);
                    out.println("<div><h1><b><i> Sorry username or password error!</h1></div>");
                    
                } else {
                    request.getRequestDispatcher("WelcomeCus.jsp").include (request, response);
                }
            }
        } catch (Exception e) {
        }
        
        out.close();
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
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
