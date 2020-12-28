<%-- 
    Document   : ChangeBook
    Created on : Jun 19, 2020, 12:41:45 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="header.jsp" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ChangeBook" method="post" enctype="multipart/form-data">
            <center>
                <h1>Change Book</h1>
                <table>
                    <tr>
                        <td class ="color_text">ISBN:</td>
                        <td><input class="form-control" type="text" name="isbn" id="isbn" placeholder="ISBN" required></td>
                    </tr>

                    <tr>
                        <td class ="color_text">Title:</td>
                        <td><input class="form-control" type="text" name="title" id="title" placeholder="Title" required></td>
                    </tr>

                    <tr>
                        <td class ="color_text">Price:</td>
                        <td><input class="form-control" type="text" name="price" id="price" placeholder="Price" required></td>
                    </tr>

                    <tr>
                        <td class ="color_text">Publisher:</td>
                        <td><input class="form-control" type="text" name="publisher" id="publisher" placeholder="Publisher" required></td>
                    </tr>

                    <tr>
                        <td class ="color_text">Inventory:</td>
                        <td><input class="form-control" type="text" name="inventory" id="inventory" placeholder="Inventory" required></td>
                    </tr>

                    <tr>
                        <td class ="color_text">Book Description:</td>
                        <td><input class="form-control" type="text" name="description" id="description" placeholder="Book Description"></td>
                    </tr>

                    <tr>
                        <td class = "color_text">Submit a Cover Image</td>
                        <td><input class="form-control" type="file" placeholder="Cover Image" name="coverImage" id="coverImage"/></td>
                    </tr>
                </table>
                <div class="btn-group">
                    <button type="submit" class="btn btn-primary" style="background-color: white; color: black;">Change Book</button>
                    <button type="reset" class="btn btn-primary" style="background-color: white; color: black;">Cancel</button>
                </div>
            </center>
        </form>
        <%@ include file="Footer.jsp" %>
    </body>
</html>
