<%-- 
    Document   : Check
    Created on : Jun 16, 2020, 4:42:38 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.bookstore.dao.BookDAO, java.text.*" %>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    </head>
</head>
<body>

    <jsp:useBean id="cart" scope="session" class="com.bookstore.bean.Cart"></jsp:useBean>

        <h1>Bookstore Checkout/Cart Page</h1>
    <%            if (request.getParameter("quanErr") != null) {
    %>
    <div class="alert alert-danger" style="max-width: 330px; margin: 0 auto" role="alert">There wasn't enough inventory to process your order. Please review your updated cart and proceed.</div>
    <%
        }
    %>

    <c:if test="${not empty cart.items}">
        <form action="AddtoCart" method="post">
            <table class="table table-striped">
                <thead>
                <th></th>
                <th>Title</th>
                <th>Quantity</th>
                <th>Price</th>
                <th>Total Price</th>
                <th></th>
                </thead>
                <tbody>

                    <c:forEach var="item" items="${cart.items}">
                        <tr style="text-align: left">
                            <td><center>
                        <img src="images/${item.getCoverImage()}" style="max-width: 70px; max-height: 70px">
                    </center></td>
                    <td>${item.getTitle()}</td>
                    <td>
                        <input type="hidden" name="isbn" value="${item.isbn}">
                        <input type="text" size="2" name="quantity" value="${item.quantity}">
                        <input type="submit" value="Update">
                    </td>
                    <td>${item.getPrice()}</td>
                    <td>${item.getTotalPrice()}</td>

                    <td><input type="submit" name="remove" value="Remove"></td>
                    </tr>
                </c:forEach>

                </tbody>
            </table>
        </form>
        <form action="SubmitOrder" method="post">
            <input type="submit" class="btn btn-default" value="Buy">
        </form>	
    </c:if>
    <c:if test="${empty cart.items}">
        <h2>Cart is empty</h2>
    </c:if>
    <form action="Home.jsp" method="post">
        <input type="submit" class="btn btn-default" value="Continue Shopping">
    </form>
</body>
</html>
