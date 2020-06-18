<%-- 
    Document   : Footer
    Created on : Jun 16, 2020, 10:36:57 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Footer Page</title>
        <link rel="stylesheet" type="text/css" href="cssFooter.css">
        <link rel="stylesheet" type="text/css" href="newcss5.css">

        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/ajax/releases/v5.6.3/css/all.css">
    </head>
    <body>

        <footer>
            <button id="back-to-top-btn" onclick="backToTop()"><i class="fas fa-angle-double-up"></i></button>
            <div class="footer-container">
                <div class="left-col">
                    <img src="lg.png" alt="" class="logo">
                    <div class="social-media">
                        <a href="#"><i class="fab fa-facebook-f"></i></a>
                        <a href="#"><i class="fab fa-twitter"></i></a>
                        <a href="#"><i class="fab fa-instagram"></i></a>
                        <a href="#"><i class="fab fa-youtube"></i></a>
                        <a href="#"><i class="fab fa-linkedin-in"></i></a>
                    </div>
                    <p class="rights-text">© 2020 Created By Lulu & Crows All Rights Reserved.</p>
                </div>

                <div class="right-col">
                    <h1 style="color: black">Our Newsletter</h1>
                    <div class="border"></div>
                    <p>Enter your email to get our sales and events.</p>
                    <form action="" class="newsletter-form">
                        <input type="text" class="txtb" placeholder="Your email...">
                        <input type="submit" class="btn" value="Send">
                    </form>
                </div>

            </div>
            <script type="text/javascript" src="backToTop.js"></script>
        </footer>
    </body>
</html>
