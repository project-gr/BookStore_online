<%-- 
    Document   : Home
    Created on : May 26, 2020, 6:16:01 PM
    Author     : Ren
--%>

<%@page import="context.DBcontext"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page import="bean.BooksList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="dao.BookDAO"%>
<%@page import="bean.BookBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:useBean id="bookList" class="dao.BookDAO" scope="request"></jsp:useBean>

        <title> Home page </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="style.css">

        <style></style>
    </head>
    <body>

        <script>
            function myFunction() {
                var x = document.getElementById("myTopnav");
                if (x.className === "topnav") {
                    x.className += " responsive";
                } else {
                    x.className = "topnav";
                }
            }
        </script>


        <div class="jumbotron text-center">
            <h1> Welcome to our BookStore </h1>
            <p> A place to increase your knowledge </p> 
        </div>

        <ul class="topnav" id="myTopnav">
            <a href="Home.jsp" class="active">Home</a>

            <!--<a style="float: right" href="#Signout"> Sign out </a>-->

            <div class="dropdown-right">
                <button class="dropbtn"> Sign in 
                    <i class="fa fa-caret-down"></i>
                </button>
                <div class="dropdown-content">
                    <a href="StaffLogin.jsp"> Staff Login</a>
                    <a href="CustomerLogin.jsp"> Customer Login</a>
                </div>
            </div> 

            <a href="javascript:void(0);" style="font-size:15px;" class="icon" onclick="myFunction()">&#9776;</a>
        </ul>

        <table>
            <tr>
                <th> Book ID </th>
                <th> Book name </th>
                <th> Author </th>
                <th> Category </th>
                <th> Price </th>
                <th> Discount </th>
                <th> Quantity </th>
                <th> &nbsp; </th>
            </tr>
            
        <c:forEach items="${bookList.get()}" var="book">
            <tr>
                <th> ${book.getBook_ID()} </th>
                <th> ${book.getBook_Name()} </th>
                <th> ${book.getAuthor()} </th>
                <th> ${book.getCategory()} </th>
                <th> ${book.getPrice()} </th>
                <th> ${book.getDiscount()} </th>
                <th> ${book.getQuantity()} </th>
                <th> &nbsp; </th>
            </tr>
        </c:forEach>
            
            
        </table>
        
        

    </body>
</html>