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
        <%
            String username = (String) request.getAttribute("username");
            UserDAO userDAO = new UserDAO();
            UserBean userBean = userDAO.getUser(username);
            String fName = "", address = "", phone = "", email = "";
            if (userBean == null) {
                response.sendRedirect("Login.jsp");
            } else {
                fName = userBean.getfName();
                address = userBean.getAddress();
                phone = userBean.getPhone();
                email = userBean.getEmail();
            }
        %>
        <a href="Login.jsp"></a>
    <center> 
        <form method="post" action="InfoControl">
            <ol type="circle">
                <input type="hidden" name="username" value="<%=username %>">

                <table>
                    <tr>
                        <td>Full name </td>
                    <td><input class="form-control" type="text" name="fName" value="<%=fName%>" required> </td>
                    </tr>

                    <tr>
                        <td>Address </td>
                    <td><input class="form-control" type="text" name="address" value="<%=address%>" required> </td>
                    </tr>

                    <tr>
                        <td>Phone </td>
                    <td><input class="form-control" type="text" name="phone"vvalue="<%=phone%>" required> </td>
                    </tr>

                    <tr>
                        <td>Email </td>
                    <td><input class="form-control" type="text" name="Email"value="<%=email%>" required> </td>
                    </tr>

                    <tr>
                        <td><input class="form-control" type="submit" value="Update"> </td>
                    <td> <input class="form-control" type="reset" name="Reset"> </td>
                    </tr>

                </table>

            </ol>
        </form>
    </center>
</body>
</html>
