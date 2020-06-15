<%-- 
    Document   : BookInformation
    Created on : Jun 14, 2020, 11:51:38 PM
    Author     : ADMIN
--%>

<%@page import="com.bookstore.bean.BookBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<%@ page import="com.bookstore.dao.BookDAO, java.text.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
        <link rel="stylesheet" href="bookInfoStyle.css">
    </head>
    <body>
        <jsp:useBean id="book" scope="request" class="com.bookstore.bean.BookBean"></jsp:useBean>
        <jsp:setProperty name="book" property="*"></jsp:setProperty>
            <div class="panel panel-default">
                <div class="panel-heading">
                    <h3 class="panel-title">${book.title}</h3>
            </div>
            <div class="panel-body">
                <div class="row">
                    <div class="column">
                        <center>
                            <%
                                BookBean bookBean = (BookBean) request.getAttribute("bookBean");
                            %>
                            <img src="images/<%out.println(bookBean.getCoverImage());%>" style="max-width: 300px; max-height: 300px">
                        </center>
                    </div>

                    <div class="column">
                        <h4> ISBN: 
                            <%
                                out.println(bookBean.getIsbn());
                            %>
                        </h4>

                        <h4> Title: 
                            <%
                                out.println(bookBean.getTitle());
                            %>
                        </h4>

                        <h4> Price: 
                            <%
                                out.println(bookBean.getPrice());
                            %>
                        </h4>

                        <h4> Publisher 
                            <%
                                out.println(bookBean.getPublisher());
                            %>
                        </h4>

                        <h4> Inventory: 
                            <%
                                out.println(bookBean.getInventory());
                            %>
                        </h4>

                        <h4> Description: </h4>
                        <%
                            out.println(bookBean.getDescription());
                        %>


                        <input type="hidden" name="isbn" value="${book.isbn}" />
                        <input type="hidden" name="title" value="${book.title}" />
                        <input type="hidden" name="quantity" value="1" />
                        <br>
                        <input type="submit" name="add" value="Add to Cart" />
                    </div>
                    <div class="column">
                        <form method="post">

                            <table border="2">
                                <tr>
                                    <td>ISBN</td>
                                    <td>Title</td>
                                    <td>Price</td>
                                    <td>Publisher</td>
                                    <td>Inventory</td>
                                    <td>Description</td>
                                    <td>Cover Image</td>
                                </tr>
                                <%
                                    try {
                                        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                                        String url = "jdbc:sqlserver://bookstore";
                                        String username = "sa";
                                        String password = "sa";
                                        String query = "SELECT TOP 5 *FROM books ORDER BY CHECKSUM(NEWID()) GO";
                                        Connection conn = DriverManager.getConnection(url, username, password);
                                        Statement stmt = conn.createStatement();
                                        ResultSet rs = stmt.executeQuery(query);
                                        while (rs.next()) {
                                %>
                                <tr><td><%rs.getString("isbn"); %></td></tr>
                                <tr><td><%rs.getString("title"); %></td></tr>
                                <tr><td><%rs.getFloat("price"); %></td></tr>
                                <tr><td><%rs.getString("publisher"); %></td></tr>
                                <tr><td><%rs.getInt("inventory"); %></td></tr>
                                <tr><td><%rs.getString("description"); %></td></tr>
                                <tr><td><%rs.getString("coverImage"); %></td></tr>

                                <%
                                    }
                                %>
                            </table>
                            <%
                                    rs.close();
                                    stmt.close();
                                    conn.close();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            %>
                        </form>`
                    </div>

                </div>
            </div>

    </body>
</html>
