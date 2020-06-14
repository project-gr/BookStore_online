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
    </head>
    <body>
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar"></button>
                    <a class="navbar-brand" href="Home.jsp">Hehe Book Store</a>
                </div>

                <div>
                    <!--Search Box-->
                    <form method="post" action="DaoControl">
                        <ol type="circle">

                            <div class="searchBox">
                                <input class="searchBox_input" type="text" name="searchBox" placeholder="Search">

                                <select class="searchBox_input" name="type">
                                    <option value="Book"> Book </option>
                                    <option value="Author"> Author </option>
                                    <option value="Category"> Category </option>
                                </select> 

                                <button type="submit" name="search" class="searchbtn">
                                    <i class="fas fa-search"></i>
                                </button>
                            </div>

                        </ol>
                    </form>

                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Browse<span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="./Search?search-query=">All</a></li>
                                    <c:forEach var="row" items="${result.rows}">
                                    <li><a href="./Search?search-query=${row.category_name}">${row.category_name}</a></li>
                                    </c:forEach>
                            </ul>
                        </li>

                        <li><a href="Login.jsp">Sign in/Register</a></li> 

                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Admin<span class="caret"></span></a>
                            <ul class="dropdown-menu" role="menu">
                                <li><a href="./generateReports">View Reports</a></li>
                                <li><a href="./AddBook.jsp">Add Book</a></li>
                                <li><a href="./UserLookup">View Users</a></li>
                            </ul>
                        </li>

                        <li><a href="./Checkout.jsp">Cart</a></li>
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
