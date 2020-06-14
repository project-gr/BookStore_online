/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import bean.BookBean;
import dao.BookDAO;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ren
 */
@WebServlet(name = "DaoController", urlPatterns = {"/DaoController"})
public class BookController extends HttpServlet {

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

            if (action.equals("Search")) {
                String type = request.getParameter("type");
                String searchBox = request.getParameter("searchBox");

                request.getRequestDispatcher("Home.jsp").include(request, response);

                if (type.equals("Book")) {
                    BookDAO bookDAO = new BookDAO();

                    out.println("<table>"
                            + "<tr>"
                            + "<th> Book ID </th>"
                            + "<th> Book name </th>"
                            + "<th> Author </th>"
                            + "<th> Category </th>"
                            + "<th> Price </th>"
                            + "<th> Discount </th>"
                            + "<th> Quantity </th>"
                            + "<th> &nbsp; </th>"
                            + "</tr>"
                            + "</table>");

                    for (BookBean book : bookDAO.getElement(searchBox)) {

                        out.println("<table>"
                                + "<tr>"
                                + "<th>" + book.getBook_ID() + "</th>"
                                + "<th>" + book.getBook_Name() + "</th>"
                                + "<th>" + book.getAuthor() + "</th>"
                                + "<th>" + book.getCategory() + "</th>"
                                + "<th>" + book.getPrice() + "</th>"
                                + "<th>" + book.getDiscount() + "</th>"
                                + "<th>" + book.getQuantity() + "</th>"
                                + "<th> &nbsp; </th>"
                                + "</tr>"
                                + "</table>");

                    }
                }
            }
        } catch (Exception e) {
        }
    }

    private void Search(String type, String searchBox) {
        if (type.equals("Book")) {
            BookDAO bookDAO = new BookDAO();

            out.println("<table>"
                    + "<tr>"
                    + "<th> Book ID </th>"
                    + "<th> Book name </th>"
                    + "<th> Author </th>"
                    + "<th> Category </th>"
                    + "<th> Price </th>"
                    + "<th> Discount </th>"
                    + "<th> Quantity </th>"
                    + "<th> &nbsp; </th>"
                    + "</tr>"
                    + "</table>");

            for (BookBean book : bookDAO.getElement(searchBox)) {

                out.println("<table>"
                        + "<tr>"
                        + "<th>" + book.getBook_ID() + "</th>"
                        + "<th>" + book.getBook_Name() + "</th>"
                        + "<th>" + book.getAuthor() + "</th>"
                        + "<th>" + book.getCategory() + "</th>"
                        + "<th>" + book.getPrice() + "</th>"
                        + "<th>" + book.getDiscount() + "</th>"
                        + "<th>" + book.getQuantity() + "</th>"
                        + "<th> &nbsp; </th>"
                        + "</tr>"
                        + "</table>");

            }
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
