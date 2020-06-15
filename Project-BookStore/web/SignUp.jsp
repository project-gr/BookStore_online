<%-- 
    Document   : SignUp
    Created on : Jun 15, 2020, 9:25:13 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
        
        <!--Css link-->
        <link rel="stylesheet" href="signup.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    </head>
    <body>
        <form action="SignUpServlet" method="post" class="form-signup">
            <center>
                <h1>Sign Up</h1>
                <input type="text" class="form-control" placeholder="Username" name="username" id="username" required><div id="status"></div>
                <script type="text/javascript" src="checkSignUp.js"></script>
                
                <input type="password" class="form-control" placeholder="Password" name="password" required>
                <input type="text" class="form-control" placeholder="Name" name="fName" required>
                <input type="text" class="form-control" placeholder="Address" name="address" required>
                <input type="text" class="form-control" placeholder="Phone Number" name="phone" required>
                <input type="text" class="form-control" placeholder="Email" name="email" required>
                <br>
                <input type="submit" class="btn btn-lg btn-primary btn-block" value="Sign Up">
            </center>
        </form>
    </body>
</html>
