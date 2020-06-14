<%-- 
    Document   : Home
    Created on : Jun 12, 2020, 10:54:57 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<%@ page import="com.bookstore.dao.BookDAO , com.bookstore.bean.BookBean, java.util.*, java.text.NumberFormat" %>
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


    </head>
    <body>
        <jsp:useBean id="bookList" class="com.bookstore.dao.BookDAO" scope="request"></jsp:useBean>
        <center>
            <h1>Hehe Book Store</h1>

        <c:forEach items="${bookList.getList()}" var="book">
            <div class="col-md-4" style="padding: 5px;">
                <div style="margin:3px; padding:10px; background-color: #eee;">
                    <div class="row">
                        <div class="col-md-4">
                            <a href="./BookLookup?isbn= ${book.getIsbn()}" style="max-height: 130px; max-width: 110px;">
                                <img src="C:\\Users\\ADMIN\\Desktop\\BookStore_online\\Project-BookStore\\web\\images\\ ${book.getCoverImage()}" alt=" ${book.getTitle()} cover" style="max-width: inherit; max-height: inherit">
                            </a>
                        </div>
                        <div class="col-md-8" style="text-align: left; padding-left:10px;">
                            <h4> ${book.getTitle()} </h4>
                            <h5> ${book.getIsbn()} </h5>
                            <h5> ${book.getPrice()} </h5>
                            &nbsp;
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
    </center>
</body>
</html>

















