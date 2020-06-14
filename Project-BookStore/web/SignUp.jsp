<%-- 
    Document   : SignUp
    Created on : Jun 11, 2020, 3:38:30 PM
    Author     : Ren
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <form method="post" action="RegisterCourse">
            <ol type="circle">

                <table>
                    <tr>
                        <td><li> Username: </td>
                        <td><input type="text" placeholder="Username" name="CusUsername"> </td>
                    </tr>
                    
                    <tr>
                        <td><li> Password: </td>
                        <td><input type="password" placeholder="password" name="CusPassword"> </td>
                    </tr>

                    <tr>
                        <td><li> Full name: </td>
                        <td><input type="text" name="CusName"> </td>
                    </tr>

                    <tr>
                        <td><li> Email: </td>
                        <td><input type="text" name="Email"> </td>
                    </tr>
                    
                    <tr>
                        <td><li> Phone number: </td>
                        <td><input type="text" name="phone"> </td>
                    </tr>

                    <tr>
                        <td><li> Gender: </td>
                        <td>
                            <input type="radio" id="male" checked name="gender" value="male">
                            <label for="male">Male</label>
                            <input type="radio" id="female" checked name="gender" value="female">
                            <label for="female">Female</label>
                            <input type="radio" id="other" checked name="gender" value="other">
                            <label for="other">Other</label>
                        </td>
                    </tr>

                    <tr>
                        <td><li> <input type="submit" name="Login"> </td>
                        <td> <input type="reset" name="Reset"> </td>
                    </tr>

                </table>

            </ol>
        </form>
    </body>
</html>
