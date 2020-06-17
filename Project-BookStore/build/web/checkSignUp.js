/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function checkInfo() {

    var fname = document.forms["form"]["fullname"].value;
    var username = document.forms["form"]["username"].value;
    var email = document.forms["form"]["email"].value;
    var password = document.forms["form"]["password"].value;
    var repassword = document.forms["form"]["repassword"].value;
    if (fname === "") {
        alert("Please input your fullname");
        return false;
    }
    if (username === "") {
        alert("Please input your username!!");
        return false;
    }

    if (!/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(email)) {
        alert("Wrong eamail format, please input again!");
        return false;
    }
    if (password === "") {
        alert("Please input your password!");
        return false;
    }
    if (repassword === "") {
        alert("Please input your confirm password!");
        return false;
    }
    if (!(password === repassword)) {
        alert("Your re-password does not match with your password");
        return false;
    }

    return true;
}


function setCookie(cKey, cName) {
    document.cookie = cKey + "=" + cName;
}
function getCheck() {
    if (checkInfo()) {
        var fullnameKey = "fName= ";
        var usernameKey = "username= ";
        var emailKey = "email= ";
        var passwordKey = "pass= ";
        var fullname = document.getElementById("fName").value;
        var username = document.getElementById("username").value;
        var email = document.getElementById("email").value;
        var password = document.getElementById("pass").value;
        setCookie(fullnameKey, fullname);
        setCookie(usernameKey, username);
        setCookie(emailKey, email);
        setCookie(passwordKey, password);
        var printString = fullnameKey + document.getElementById("fName").value + "\n" + emailKey + document.getElementById("email").value + "\n" + usernameKey + document.getElementById("username").value + "\n" + passwordKey + document.getElementById("pass").value;
        if (document.cookie.length !== 0) {
            alert(printString);

        } else {
            alert("Nothing in the cookie");
        }
    }

}