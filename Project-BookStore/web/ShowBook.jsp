<%-- 
    Document   : showBook
    Created on : Jun 17, 2020, 1:48:17 AM
    Author     : ADMIN
--%>

<%@page import="com.bookstore.bean.BookBean"%>
<%@page import="com.bookstore.dao.BookDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String search = (String) request.getAttribute("search");
            String type = (String) request.getAttribute("type");

            BookDAO bookDAO = new BookDAO();
            for (BookBean book : bookDAO.getKey(search, type)) {
        %>
        
        <div class="col-md-4" style="padding: 5px;">
            <div style="margin:3px; padding:10px; background-color: #eee;">
                <div class="row">
                    <div class="col-md-4">
                        <img src="images/<% book.getCoverImage(); %>" style="max-height: 130px; max-width: 110px;">
                    </div>
                    <div class="col-md-8" style="text-align: left; padding-left:10px;">

                        <a href="BookLookUp?isbn=<% book.getIsbn(); %>">
                            <h4><% book.getTitle();%></h4>
                        </a>
                        <h5> <% book.getIsbn();%> </h5>
                        <h5> <% book.getPrice();%> </h5>
                        &nbsp;
                    </div>
                </div>
            </div>
        </div>
        
        <%
            }
        %>
    </body>
</html>
