<%-- 
    Document   : header
    Created on : Jun 11, 2020, 9:37:47 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book Store</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://kit.fontawesome.com/a076d05399.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar"></button>
                    <a class="navbar-brand" href="Home.jsp">Hehe Book Store</a>
                </div>

                <div id="navbar" class="navbar-collapse collapse">
                    <form class="navbar-form navbar-left" method="post" action="SearchControl">

                        <ol type="circle">

                            <div class="searchBox">
                                <input class="form-control" name="search" id="search" size="40" type="text" placeholder="Search">

                                <select class="form-control" name="type">
                                    <option value="Book"> Book </option>
                                    <option value="Author"> Author </option>
                                    <option value="Category"> Category </option>
                                </select> 
                            </div>

                        </ol>
                    </form>

                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="./Login.jsp" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"> <span class="caret"></span>Sign in</a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="./CustomerAccount.jsp">Account</a></li>
                                <li class="divider"></li>
                                <li><a href="./logout.jsp">Logout</a></li>
                            </ul>
                        </li>


                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Admin<span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="./generateReports">View Reports</a></li>
                                <li><a href="./AddBook.jsp">Add Book</a></li>
                                <li><a href="./UserLookup">View Users</a></li>
                            </ul>
                        </li>
                        <li><a href="./Check.jsp">Cart</a></li>
                    </ul>
                </div>
            </div>
        </nav>
        <div style="padding: 70px 15px; text-align: center;">
            <div class="container">
            </div>
        </div>
    </body>
</html>
