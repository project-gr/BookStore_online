<%-- 
    Document   : cus
    Created on : Jun 13, 2020, 11:08:41 PM
    Author     : ADMIN
--%>

<%@page import="com.bookstore.bean.BookBean"%>
<%@page import="com.bookstore.dao.BookDAO"%>
<%@page import="com.bookstore.dao.UserDAO"%>
<%@page import="com.bookstore.bean.UserBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:useBean id="userList" class="com.bookstore.dao.UserDAO" scope="request"></jsp:useBean>
        <%@ include file="header.jsp" %>
        <link rel="stylesheet" href="customer_account.css">
    </head>
    <body>
        <%            String username = (String) request.getAttribute("username");
            UserDAO userDAO = new UserDAO();
            UserBean userBean = (UserBean) session.getAttribute("userBean");
            String fName = "", address = "", phone = "", email = "";
            if (userBean == null) {
                response.sendRedirect("Login.jsp");
            } else {
                fName = userBean.getfName();
                address = userBean.getAddress();
                phone = userBean.getPhone();
                email = userBean.getEmail();
        %>

        <a href="Login.jsp"></a>
    <center> 
        <form method="post" action="InfoControl">
            <ol type="circle">

                <input type="hidden" name="username" value="<%=username%>">

                <table>
                    <tr>
                        <td><li> Full name: </td>
                    <td><input type="text" name="fName" value="<%=fName%>" required> </td>
                    </tr>

                    <tr>
                        <td><li> Address: </td>
                    <td><input type="text" name="address" value="<%=address%>" required> </td>
                    </tr>

                    <tr>
                        <td><li> Phone </td>
                    <td><input type="text" name="phone"vvalue="<%=phone%>" required> </td>
                    </tr>

                    <tr>
                        <td><li> Email: </td>
                    <td><input type="text" name="Email"value="<%=email%>" required> </td>
                    </tr>

                    <tr>
                        <td><li> <input type="submit" value="Update"></td>
                    <td> <input type="reset" name="Reset"> </td>
                    </tr>

                </table>

            </ol>
        </form>
    </center>
    <%
        }
    %>
</body>
</html>

