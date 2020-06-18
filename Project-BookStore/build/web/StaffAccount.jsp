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
        <%            String username = (String) request.getAttribute("username");
            UserDAO userDAO = new UserDAO();
            UserBean userBean = (UserBean) session.getAttribute("userBean");
            String fName = "", address = "", passwd="", phone = "", email = "";
            if (userBean == null) {
                response.sendRedirect("Login.jsp");
            } else {
                fName = userBean.getfName();
                address = userBean.getAddress();
                phone = userBean.getPhone();
                email = userBean.getEmail();
                username = userBean.getUsername();
                passwd = userBean.getPass();
        %>

    <center> 
        <form method="post" action="InfoControl">
            <input type="hidden" name="username" value="<%=username%>">
            <div class="main">
                <div class="profile-card">
                    <div class="image-container">
                        <img src="https://xansan.com/wp-content/uploads/2018/10/user-avatar-default-2609.png"  style="height: 300px; width: 300px;">
                        <div class="title">
                            <h2><%=fName%></h2>
                        </div>
                    </div>
                    <div class="main-container">
                        <table>
                            <tr>
                                <td><i class="fa fa-home info"></i></td>
                                <td>Address</td>
                                <td><input type="text" name="address" value="<%=address%>" required></td>
                            </tr>
                            <tr>
                                <td><i class="fa fa-envelope info"></i></td>
                                <td>Email</td>
                                <td><input type="text" name="email"value="<%=email%>" required></td>
                            </tr>
                            <tr>
                                <td><i class="fa fa-phone info"></i></td>
                                <td>Phone</td>
                                <td><input type="text" name="phone"vvalue="<%=phone%>" required></td>
                            </tr>
                            <input type="hidden" name="isbn" value="<%=fName%>" />
                            <input type="hidden" name="isbn" value="<%=username%>" />
                            <input type="hidden" name="isbn" value="<%=passwd%>" />
                        </table>
                    </div>
                    <br>
                    <div class="btn-group">
                        <button type="submit" class="btn btn-primary" style="background-color: white; color: black;">Save</button>
                        <button type="reset" class="btn btn-primary" style="background-color: white; color: black;">Reset</button>
                    </div>
                </div>
            </div>
        </form>
    </center>
    <%
        }
    %>
    <br>
    <center>
        <div class="btn-group btn-group-lg">
            <button type="button" class="btn btn-primary" style="background-color: white; color: black;"><a href="AddBook.jsp">Add Book</a></button>
            <button type="button" class="btn btn-primary" style="background-color: white; color: black;"><a href="DeleteBook.jsp">Delete Book</a></button>
            <button type="button" class="btn btn-primary" style="background-color: white; color: black;"><a href="ChangeBook.jsp">Change Book</a></button>
        </div>
    </center>
<%@ include file="Footer.jsp" %>
</body>
</html>
