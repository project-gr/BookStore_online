<%-- 
    Document   : Logout
    Created on : Jun 13, 2020, 11:09:24 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("Home.jsp");
        %>
    </body>
</html>
