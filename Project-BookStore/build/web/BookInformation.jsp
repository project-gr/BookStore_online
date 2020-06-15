<%-- 
    Document   : BookInformation
    Created on : Jun 14, 2020, 11:51:38 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<%@ page import="com.bookstore.dao.BookDAO, java.text.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    </head>
    <body>
        <jsp:useBean id="book" scope="request" class="com.bookstore.bean.BookBean"></jsp:useBean>
        <jsp:setProperty name="book" property="*"></jsp:setProperty>
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">${book.title}</h3>
            </div>
            <div class="panel-body">
                <img src="./images/${book.coverImage}" alt="${book.title} cover" width="200">
                <form action="./cartUpdate" method="post">

                    <% NumberFormat fmt = NumberFormat.getNumberInstance();%>

                    <h4>Price: <%=fmt.format(book.getPrice())%></h4>
                    <h4>ISBN: ${book.isbn}</h4>
                    <h4>Publisher: ${book.publisher}</h4>
                    <h4>Description:</h4>
                    <p>${book.description}</p>

                    <input type="hidden" name="isbn" value="${book.isbn}" />
                    <input type="hidden" name="title" value="${book.title}" />
                    <input type="hidden" name="quantity" value="1" />
                    <input type="submit" name="add" value="Add to Cart" />
                </form>

            </div>
        </div>

    </body>
</html>
