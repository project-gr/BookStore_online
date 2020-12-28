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

        <link rel="stylesheet" href="style.css">
        <style>
            body{
                background-color: black;
            }
            h1{
                color: white;
            }

            h5{
                color: black;
            }
        </style>
    </head>
    <body>
        <jsp:useBean id="bookList" class="com.bookstore.dao.BookDAO" scope="request"></jsp:useBean>
        <center>
          
            <div class="row">
                <div class="side">
                </div>

                <div class="main">

                    <div id="myCarousel" class="carousel slide" data-ride="carousel">
                        <ol class="carousel-indicators">
                            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                            <li data-target="#myCarousel" data-slide-to="1"></li>
                            <li data-target="#myCarousel" data-slide-to="2"></li>
                        </ol>
                        <div class="carousel-inner">
                            <div class="item active" id="slide1">
                                <div class="carousel-caption">

                                </div>
                            </div>
                            <div class="item" id="slide2">
                                <div class="carousel-caption">

                                </div>
                            </div>
                            <div class="item" id="slide3">
                                <div class="carousel-caption">

                                </div>
                            </div>
                        </div>
                        <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                            <span class="glyphicon glyphicon-chevron-left"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="right carousel-control" href="#myCarousel" data-slide="next">
                            <span class="glyphicon glyphicon-chevron-right"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>

                <div>
                    <h1>ALL BOOKS</h1>
                    <c:forEach items="${bookList.getList()}" var="book">
                        <div class="col-md-4" style="padding: 5px;">
                            <div style="margin:3px; padding:10px; background-color: #E5E8E8;">
                                <div class="row">
                                    <div class="col-md-4">
                                        <img src="images/${book.getCoverImage()}" style="max-height: 130px; max-width: 110px;">
                                    </div>
                                    <div class="col-md-8" style="text-align: left; padding-left:10px;">

                                        <a href="BookLookUp?isbn=${book.getIsbn()}">
                                            <h4>${book.getTitle()}</h4>
                                        </a>
                                        <h5> ${book.getIsbn()} </h5>
                                        <h5> $ ${book.getPrice()} </h5>
                                        &nbsp;
                                    </div>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
            <div class="column"></div>
        </div>
    </center>
    <%@ include file="Footer.jsp" %>
</body>
</html>
