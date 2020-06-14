<%-- 
    Document   : cus
    Created on : Jun 13, 2020, 11:08:41 PM
    Author     : ADMIN
--%>

<%@page import="com.bookstore.dao.UserDAO"%>
<%@page import="com.bookstore.bean.UserBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="com.bookstore.bean.UserBean" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:useBean id="userList" class="com.bookstore.dao.UserDAO" scope="request"></jsp:useBean>
        <%@ include file="header.jsp" %>
    </head>
    <body>
         
        <table>
            <tr>
                <th> User Name </th>
                <th> Pass </th>
                <th> Full Name </th>
                <th> Address </th>
                <th> Phone </th>
                <th> Email </th>
                <th> Sign up date </th>
                <th> &nbsp; </th>
            </tr>
            <% String username = (String) request.getAttribute("username"); %>
            <c:forEach items="${userList.getElement(username)}" var="user">
                <tr>
                    <th> ${user.getUsername()} </th>
                    <th> ${user.getPass()} </th>
                    <th> ${user.getfName()} </th>
                    <th> ${user.getAddress()} </th>
                    <th> ${user.getPhone()} </th>
                    <th> ${user.getEmail()} </th>
                    <th> ${user.getSignup_date()} </th>
                    <th> &nbsp; </th>
                </tr>
            </c:forEach>
        </table>
        <div class="right">
            <form action="Logout.jsp">
                <input type="submit" value="Logout">
            </form>
        </div>
    </body>
</html>