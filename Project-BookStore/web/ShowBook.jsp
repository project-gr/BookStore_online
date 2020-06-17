<%-- 
    Document   : showBook
    Created on : Jun 17, 2020, 1:48:17 AM
    Author     : ADMIN
--%>

<%@page import="java.util.List"%>
<%@page import="com.bookstore.bean.BookBean"%>
<%@page import="com.bookstore.dao.BookDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <!--Css link-->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://kit.fontawesome.com/a076d05399.js"></script>

        <!--Bootstrap 4-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

        <link rel="stylesheet" href="style.css">
    </head>
    <body>

    <center>
        <div class="row">
            <div class="side">aaaaaaaaaaaaaaa</div>
            <div class="main">
                <div>
                    <%
                        List<BookBean> bookList = (List<BookBean>) request.getAttribute("bookList");

                        for (BookBean book : bookList) {
                    %>

                    <div class="col-md-4" style="padding: 5px;">
                        <div style="margin:3px; padding:10px; background-color: #eee;">
                            <div class="row">
                                <div class="col-md-4">
                                    <img src="images/<%= book.getCoverImage()%>" style="max-height: 130px; max-width: 110px;">
                                </div>
                                <div class="col-md-8" style="text-align: left; padding-left:10px;">

                                    <a href="BookLookUp?isbn=<%= book.getIsbn()%>">
                                        <h4><%= book.getTitle()%></h4>
                                    </a>
                                    <h5> <%= book.getIsbn()%> </h5>
                                    <h5> $<%= book.getPrice()%> </h5>
                                    &nbsp;
                                </div>
                            </div>
                        </div>
                    </div>
                    <%
                        }
                    %>
                </div>
            </div>
        </div>
    </center>


    <center>
        <div class="row">
            <div class="side"></div>

            <div class="main">
                <div>
                    <h1>All BOOKS</h1>
                    <c:forEach items="${bookList.getList()}" var="book">
                        <div class="col-md-4" style="padding: 5px;">
                            <div style="margin:3px; padding:10px; background-color: #eee;">
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
        </div>
    </center>                                
</body>
</html>
