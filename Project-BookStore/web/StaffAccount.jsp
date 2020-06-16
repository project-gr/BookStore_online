<%-- 
    Document   : StaffAccount
    Created on : Jun 13, 2020, 11:09:12 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.bookstore.dao.UserDAO"%>
<%@page import="com.bookstore.bean.UserBean"%>
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
        <% String username = (String) request.getAttribute("username");%>
        <c:forEach items="${userList.getElement(username)}" var="user">
            <div style="margin:3px; padding:10px;">
                <div class="row">
                    <div class="col-md-4">

                        <form action="Avatar?username=${user.getUsername()}" method="post" enctype="multipart/form-data">
                            <div class="div1" style="background-image: ${user.getAvatar()};
                                 background-size: cover;
                                 width: 150px;
                                 height: 150px;
                                 border-radius: 50%;"></div>

                            <input type="file" placeholder="Cover Image" name="coverImage" id="coverImage"/>
                            <button class="button" type="submit">Add Avatar</button>
                        </form>

                        <form action="Logout.jsp">
                            <input type="submit" value="Logout">
                        </form>
                    </div>
                    <div class="col-md-8" style="text-align: left; padding-left:10px;">
                        <h4>${user.getfName()}</h4>
                        <h5>${user.getEmail()}</h5>
                        <h5>${user.getPhone()}</h5>
                        <h5>${user.getAddress()}</h5>
                        <h5>${user.getSignup_date()}</h5>
                        &nbsp;
                    </div>
                </div>
            </div>
        </c:forEach>
    </body>
</html>
