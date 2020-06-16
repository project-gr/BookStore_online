<%-- 
    Document   : BookInformation
    Created on : Jun 14, 2020, 11:51:38 PM
    Author     : ADMIN
--%>

<%@page import="com.bookstore.bean.BookBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<%@ page import="com.bookstore.dao.BookDAO, java.text.*" %>
<%@ page import="com.bookstore.bean.BookBean, java.util.*, java.text.NumberFormat" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="bookInfoStyle.css">
    </head>
    <body>
        
        <jsp:useBean id="book" scope="request" class="com.bookstore.bean.BookBean"></jsp:useBean>
        <jsp:setProperty name="book" property="*"></jsp:setProperty>
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">${book.title}</h3>
            </div>
            <div class="panel-body">
                <%
                    BookBean bookBean = (BookBean) request.getAttribute("bookBean");
                %>
                <div class="row">
                    <center>
                        <div class="column">
                            <form action="AddtoCart" method="post">
                            <h1><b><%out.println(bookBean.getTitle());%></b></h1>
                            <img src="images/<%out.println(bookBean.getCoverImage());%>" style="max-width: 300px; max-height: 300px">


                            <input type="hidden" name="isbn" value="${book.isbn}" />
                            <input type="hidden" name="title" value="${book.title}" />
                            <input type="hidden" name="quantity" value="1" />
                            <br>
                            <input type="submit" name="add" value="Add to Cart" />
                            </form>
                        </div>
                    </center>
                    <br>
                    <div class="column">
                        <br>
                        <br>
                        <br>

                        <h4> ISBN: 
                            <%
                                out.println(bookBean.getIsbn());
                            %>
                        </h4>

                        <h4> Price: 
                            <%
                                out.println(bookBean.getPrice());
                            %>
                        </h4>

                        <h4> Publisher 
                            <%
                                out.println(bookBean.getPublisher());
                            %>
                        </h4>

                        <h4> Inventory: 
                            <%
                                out.println(bookBean.getInventory());
                            %>
                        </h4>

                        <h4> Description: </h4>
                        <%
                            out.println(bookBean.getDescription());
                        %>

                    </div>

                    <jsp:useBean id="bookList" class="com.bookstore.dao.BookDAO" scope="request"></jsp:useBean>
                        <center>
                            <h1><b>Recommend for you</b></h1>
                            <div class="column">
                            <c:forEach items="${bookList.getRandom()}" var="book">
                                <img src="images/${book.getCoverImage()}" style="max-height: 200px; max-width: 250px;">
                            </c:forEach>
                        </div>
                    </center>

                </div>
            </div>

    </body>
</html>
