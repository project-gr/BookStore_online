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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="dao.BookDAO"%>
<%@page import="bean.BookBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:useBean id="bookList" class="dao.BookDAO" scope="request"></jsp:useBean>

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <title> Home page </title>

        <!--Bootstrap 4-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>

        <!--Css link-->
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://kit.fontawesome.com/a076d05399.js"></script>

        <script>
            $(function () {
                $(".toggle").on("click", function () {
                    if ($(".item").hasClass("active")) {
                        $(".item").removeClass("active");
                    } else {
                        $(".item").addClass("active");
                    }
                });
            });
        </script>
    </head>

    <body>

        <!--Header-->
        <div class="jumbotron text-center">
            <h1> Welcome to our BookStore </h1>
            <p> A place to increase your knowledge </p> 
        </div>

        <!--NavBar-->
        <nav>
            <ul class="menu">
                <li class="logo"><a href="Home.jsp"><img src="#logo" alt="logo"></a></li>

                <div class="item">
                    <li class="button"><a href="#">About</a></li>
                    <li class="button"><a href="#">Category</a></li>
                    <li class="button"><a href="#">Services</a></li>
                </div>

                <div class="item show">
                    <li class="button special dropdown">
                        <a href="javascript:void(0)" class="dropbtn">Sign In <i class="fa fa-caret-down"></i> </a>

                        <div class="dropdown-content">
                            <a href="StaffLogin.jsp"> Staff Login </a>
                            <a href="CustomerLogin.jsp"> Customer Login </a>
                        </div>
                    </li>

                </div>

                <li class="toggle"><span class="bars"></span></li>

            </ul>
        </nav>
        <a href="CustomerLogin.jsp"></a>

        <!--Search Box-->
        <form method="post" action="BookController?action=Search">
            <ol type="circle">

                <div class="searchBox">
                    <input class="searchBox_input" type="text" name="searchBox" placeholder="Search">

                    <select class="searchBox_input" name="type">
                        <option value="Book"> Book </option>
                        <option value="Author" Author </option>
                    </select> 

                    <button type="submit" name="search" class="searchbtn">
                        <i class="fas fa-search"></i>
                    </button>
                </div>

            </ol>
        </form>

    </body>
</html>