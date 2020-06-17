@@ -4,6 +4,7 @@
    Author     : ADMIN
--%>

<%@page import="java.util.List"%>
<%@page import="com.bookstore.bean.BookBean"%>
<%@page import="com.bookstore.dao.BookDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
@ -14,35 +15,6 @@
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String search = (String) request.getAttribute("search");
            String type = (String) request.getAttribute("type");

            BookDAO bookDAO = new BookDAO();
            for (BookBean book : bookDAO.getKey(search, type)) {
        %>
        
        <div class="col-md-4" style="padding: 5px;">
            <div style="margin:3px; padding:10px; background-color: #eee;">
                <div class="row">
                    <div class="col-md-4">
                        <img src="images/<% book.getCoverImage(); %>" style="max-height: 130px; max-width: 110px;">
                    </div>
                    <div class="col-md-8" style="text-align: left; padding-left:10px;">

                        <a href="BookLookUp?isbn=<% book.getIsbn(); %>">
                            <h4><% book.getTitle();%></h4>
                        </a>
                        <h5> <% book.getIsbn();%> </h5>
                        <h5> <% book.getPrice();%> </h5>
                        &nbsp;
                    </div>
                </div>
            </div>
        </div>
        
        <%
            }
        %>
        <h1>w</h1>
    </body>
</html>