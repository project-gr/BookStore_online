<%-- 
    Document   : Login
    Created on : Jun 13, 2020, 10:36:02 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="newcss.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.1/css/all.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato&display=swap">
        <script src="checkSignUp.js"></script>
    </head>
    <body>
        <div class="main">
            <div class="cont">
                <form action="LoginControl" method="post">
                    <div class="form sign-in">
                        <h2>Sign In</h2>
                        <label>
                            <span>Username</span>
                            <input type="username" name="username">
                        </label>
                        <label>
                            <span>Password</span>
                            <input type="password" name="password">
                        </label>
                        <button class="submit" type="submit">Sign In</button>
                        <p class="forgot-pass">Forgot Password ?</p>

                        <div class="social-media">
                            <ul>
                                <li><a href="#" class="social"><i class="fab fa-facebook-square"></i></a></li>
                                <li><a href="#" class="social"><i class="fab fa-twitter-square"></i></a></li>
                                <li><a href="#" class="social"><i class="fab fa-youtube-square"></i></a></li>
                            </ul>
                        </div>
                    </div>
                </form>
                
                
                <div class="sub-cont">
                    <div class="img">
                        <div class="img-text m-up">
                            <h2>New here?</h2>
                            <br>
                            <p>Sign up and discover great amount of new opportunities!</p>
                        </div>
                        <div class="img-text m-in">
                            <h2>One of us?</h2>
                            <br>
                            <p>If you already has an account, just sign in. We've missed you!</p>
                        </div>
                        <div class="img-btn">
                            <span class="m-up">Sign Up</span>
                            <span class="m-in">Sign In</span>
                        </div>
                    </div>
                    
                    
                    <form action="SignUpServlet" method="post" class="form-signup" enctype="multipart/form-data">
                        <div class="form sign-up">
                            <h2>Sign Up</h2>
                            <label>
                                <span>Full Name</span>
                                <input type="text" class="fullname" name="fName" id="fName">
                            </label>
                            <label>
                                <span>Username</span>
                                <input type="text" class="username" name="username" id="username">
                            </label>
                            <label>
                                <span>Password</span>
                                <input type="password" class="password" name="pass" id="pass">
                            </label>
                            <label>
                                <span>Confirm Password</span>
                                <input type="password" class="confirm_password" id="confirm_password">
                            </label>
                            <label>
                                <span>Address</span>
                                <input type="text" class="address" name="address" id="address">
                            </label>
                            <label>
                                <span>Phone</span>
                                <input type="text" class="phone" name="phone" id="phone">
                            </label>
                            <label>
                                <span>Email</span>
                                <input type="email" class="email" name="email" id="email">
                            </label>
                            <button type="submit" class="submit" onclick="getCheck()">Sign Up Now</button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="testjs.js"></script>
    </body>
</html>
