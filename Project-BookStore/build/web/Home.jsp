<%-- 
    Document   : Home
    Created on : Jun 12, 2020, 10:54:57 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<%@ page import="com.bookstore.bean.BookBean, java.util.*, java.text.NumberFormat" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <!--Css link-->
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://kit.fontawesome.com/a076d05399.js"></script>

        <!--Bootstrap 4-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

        <jsp:useBean id="bookList" class="com.bookstore.dao.BookDAO" scope="request"></jsp:useBean>
    </head>
    <body>
        <h1>Hehe Book Store</h1>
        
        <table>
                <tr>
                    <th> ISBN </th>
                    <th> title </th>
                    <th> Price </th>
                    <th> Publisher </th>
                    <th> Inventory </th>
                    <th> Description </th>
                    <th> Cover image </th>
                    <th> &nbsp; </th>
                </tr>

        <c:forEach items="${bookList.getList()}" var="book">
                <tr>
                    <th> ${book.getIsbn()} </th>
                    <th> ${book.getTitle()} </th>
                    <th> ${book.getPrice()} </th>
                    <th> ${book.getPublisher()} </th>
                    <th> ${book.getInventory()} </th>
                    <th> ${book.getDescription()} </th>
                    <th> ${book.getCover_image()} </th>
                    <th> &nbsp; </th>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
