<%-- 
    Document   : StaffLogin
    Created on : May 24, 2020, 2:12:43 PM
    Author     : Ren
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Staff Login </title>
        <style>
            h1 {
                text-align: center;
            }
        </style>
    </head>
    <body>
        
        <center><h1> Book Store Online </h1></center>
        <hr>

        <form method="post" action="LoginControl?action=Staff">
            <ol type="circle">
                
                <center>
                    <table borber: #76448A >
                        
                        <tr>
                            <th colspan="2"><h2> Staff Login </h2></th>
                        </tr>
                        
                        <tr>
                            <td> Enter your username: </td>
                            <td><input type="text" placeholder="username" name="StaffUsername"> </td>
                        </tr>
                        
                        <tr>
                            <td> Password: </td>
                            <td><input type="password" placeholder="password" name="StaffPassword"> </td>
                        </tr>

                        <tr>
                            <td> <input type="submit" name="Login" value="Login"></button></td>
                            <td> <input type="reset" name= "Reset"> </td>
                        </tr>

                    </table>
                </center>

            </ol>
        </form>
    </body>
</html>
