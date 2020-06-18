<%-- 
    Document   : test2
    Created on : Jun 17, 2020, 11:39:20 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password</title>
        <link rel="stylesheet" type="text/css" href="newcss2.css">
    </head>
    <body>
        <div class="main">
            <div class="cont">
                <div class="form forgot-pass">
                    <form action="" method="" id="control">
                        <h2 class="title">Forgot Password</h2>
                        <label>
                            <span>Email</span>
                            <input type="email" name="email">
                        </label>
                        <label>
                            <span>Username</span>
                            <input type="text" name="username">
                        </label>
                        <button class="submit" type="button">Send</button>
                        <h5>
                            <p><b><u>Note</u></b></p>
                            <p>Enter your email here that you used on your account. We send link on your email to reset password.</p>
                        </h5>
                        <br><br><br>
                        <p class="back">Go back to<a href="test.jsp">&nbsp;Sign In</a></p>
                    </form>
                </div>
            </div>
        </div>
        <%@ include file="Footer.jsp" %>
    </body>
</html>