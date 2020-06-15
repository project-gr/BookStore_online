package com.bookstore.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.dao.BookDAO;
import com.bookstore.bean.BookBean;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Search
 */
@WebServlet(name = "BookLookUp", urlPatterns = {"/BookLookUp"})
public class BookLookUp extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            String isbn = request.getParameter("isbn");
            
            BookDAO bookDAO = new BookDAO();
            BookBean bookBean = bookDAO.selectBook(isbn);
            
            request.setAttribute("bookBean", bookBean);
            request.getRequestDispatcher("BookInformation.jsp").forward(request, response);
        } catch (Exception e) {

        }

    }

    /**
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     * response)
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    /**
     * @param request
     * @param response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     * response)
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

}
