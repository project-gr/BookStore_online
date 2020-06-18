<%-- 
    Document   : header
    Created on : Jun 11, 2020, 9:37:47 PM
    Author     : ADMIN
--%>

<%@page import="com.bookstore.dao.UserDAO"%>
<%@page import="com.bookstore.bean.BookBean"%>
<%@page import="com.bookstore.bean.UserBean"%>
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
        <link rel="stylesheet" href="newcss1.css">
        <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
        <script src="https://kit.fontawesome.com/a076d05399.js"></script>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

        <style>
            .navbar-inner {
                min-height: 0px;
            }

            .navbar-brand,
            .navbar-nav li a {
                line-height: 70px;
                height: 70px;
                padding-top: 0;
            }
        </style>
    </head>
    <body>
        <header>
            <nav class="navbar navbar-inverse navbar-static-top">
                <div class="container-fluid">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="Home.jsp"><img src="logo3.png" alt="" class="logo" style="width: 70px; height: 70px;"></a>
                    </div>

                    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                        <form class="navbar-form navbar-left" role="search"  method="post" action="SearchControl">
                            <div class="form-group">
                                <input name="search" id="search" type="text" class="form-control" placeholder="Search">

                                <select class="form-control" name="type">
                                    <option value="Book"> Book </option>
                                    <option value="Author"> Author </option>
                                    <option value="Category"> Category </option>
                                </select>
                            </div>
                        </form>
                        <ul class="nav navbar-nav navbar-right">
                            <li class="dropdown">
                                <a href="" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Account<span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="Login.jsp">Sign In</a></li>
                                    <li><a href="CustomerAccount.jsp">Information</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="Logout.jsp">Sign Out</a></li>
                                </ul>
                            </li>
                            <li><a href="#">About us</a></li>
                            <li><a href="Check.jsp">Cart</a></li>
                        </ul>
                    </div>
                </div>
            </nav>

            <div class="btn-menu">
                <span class="fas fa-bars"></span>
            </div>
            <nav class="sidebar">
                <div class="text">
                    Side Menu</div>
                <ul>
                    <li class="active"><a href="#">Dashboard</a></li>
                    <li>
                        <a href="#" class="feat-btn">Features
                            <span class="fas fa-caret-down first"></span>
                        </a>
                        <ul class="feat-show">
                            <li><a href="#">Pages</a></li>
                            <li><a href="#">Elements</a></li>
                        </ul>
                    </li>
                    <li>
                        <a href="#" class="serv-btn">Services
                            <span class="fas fa-caret-down second"></span>
                        </a>
                        <ul class="serv-show">
                            <li><a href="#">App Design</a></li>
                            <li><a href="#">Web Design</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Portfolio</a></li>
                    <li><a href="#">Overview</a></li>
                    <li><a href="#">Shortcuts</a></li>
                    <li><a href="#">Feedback</a></li>
                </ul>
            </nav>
            <script>
                $('.btn-menu').click(function () {
                    $(this).toggleClass("click");
                    $('.sidebar').toggleClass("show");
                });
                $('.feat-btn').click(function () {
                    $('.sidebar ul .feat-show').toggleClass("show");
                    $('.sidebar ul .first').toggleClass("rotate");
                });
                $('.serv-btn').click(function () {
                    $('.sidebar ul .serv-show').toggleClass("show1");
                    $('.sidebar ul .second').toggleClass("rotate");
                });
                $('.sidebar ul li').click(function () {
                    $(this).addClass("active").siblings().removeClass("active");
                });
            </script>
        </header>

    </body>
</html>
