<%-- 
    Document   : navbar
    Created on : Jun 12, 2020, 10:57:41 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style.css">
        
        <script>
            $(function () {
                $(".toggle").on("click", function () {
                    if ($(".item").hasClass("active")) {
                        $(".item").removeClass("active");
                    } else {
                        $(".item").addClass("active");
                    }
                });
            });
        </script>
    </head>
    <body>
        <!--NavBar-->
        <nav>
            <ul class="menu">
                <li class="logo"><a href="Home.jsp"><img src="#logo" alt="logo"></a></li>

                <div class="item">
                    <li class="button"><a href="#">About</a></li>
                    <li class="button"><a href="#">Category</a></li>
                    <li class="button"><a href="#">Services</a></li>
                </div>

                <div class="item show">
                    <li class="button special dropdown">
                        <a href="javascript:void(0)" class="dropbtn">Sign In <i class="fa fa-caret-down"></i> </a>

                        <div class="dropdown-content">
                            <a href="StaffLogin.jsp"> Staff Login </a>
                            <a href="CustomerLogin.jsp"> Customer Login </a>
                        </div>
                    </li>

                </div>

                <li class="toggle"><span class="bars"></span></li>

            </ul>
        </nav>
    </body>
</html>
