<%-- 
    Document   : OrderConfirmation
    Created on : Jun 18, 2020, 3:27:49 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%@ include file="header.jsp" %>
    </head>
    <body>
        <div class="jumbotron">
            <h1>Order Confirmation</h1>
            <p>Congratulations, your order has been placed. The confirmation number for your order is: <strong><%= request.getAttribute("confirmId")%></strong>
        </div>

        <%@ include file="Footer.jsp" %>
    </body>
</html>
