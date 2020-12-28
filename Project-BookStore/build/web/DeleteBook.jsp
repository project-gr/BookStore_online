<%-- 
    Document   : DeleteBook
    Created on : Jun 18, 2020, 10:38:56 PM
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
        <%@ include file="header.jsp" %>
        <form action="DeleteBook" method="post">
            <center>
                <h1>Delete Book</h1>
                <table>
                    <tr>
                        <td class ="color_text">ISBN:</td>
                        <td><input class="form-control" type="text" name="isbn" id="isbn" placeholder="ISBN" required></td>
                    </tr>

                    <tr>
                        <td class ="color_text">Title:</td>
                        <td><input class="form-control" type="text" name="title" id="title" placeholder="Title" required></td>
                    </tr>
                </table>
                <div class="btn-group">
                    <button type="submit" class="btn btn-primary" style="background-color: white; color: black;">Delete Book</button>
                    <button type="reset" class="btn btn-primary" style="background-color: white; color: black;">Cancel</button>
                </div>
            </center>
        </form>
        <%@ include file="Footer.jsp" %>
    </body>
</html>
