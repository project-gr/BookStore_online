/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD
package bean;

import java.util.Date;

/**
 *
 * @author Ren
 */
public class UserBean {
    private String username;
    private String f_name;
    private String l_name;
    private String email;
    private String phone;
    private String password;
    private Date signup_date;
    private Date last_login;
    private int is_staff;
=======
package com.bookstore.bean;

import java.util.Date;


/**
 *
 * @author ADMIN
 */
public class UserBean {
    
    private String username;
    private String pass;
    private String fName;
    private String address;
    private String phone;
    private String email;
    private int is_staff;
    private Date signup_date;
>>>>>>> 5bce24f5d781c0764f9c1bfd54d29d3a77515e32

    public UserBean() {
    }

<<<<<<< HEAD
    public UserBean(String username, String f_name, String l_name, String email, String phone, String password, Date signup_date, Date last_login, int is_staff) {
        this.username = username;
        this.f_name = f_name;
        this.l_name = l_name;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.signup_date = signup_date;
        this.last_login = last_login;
        this.is_staff = is_staff;
=======
    public UserBean(String username, String pass, String fName, String address, String phone, String email, int is_staff, Date signup_date) {
        this.username = username;
        this.pass = pass;
        this.fName = fName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.is_staff = is_staff;
        this.signup_date = signup_date;
>>>>>>> 5bce24f5d781c0764f9c1bfd54d29d3a77515e32
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

<<<<<<< HEAD
    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
=======
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
>>>>>>> 5bce24f5d781c0764f9c1bfd54d29d3a77515e32
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

<<<<<<< HEAD
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getSignup_date() {
        return signup_date;
    }

    public void setSignup_date(Date signup_date) {
        this.signup_date = signup_date;
    }

    public Date getLast_login() {
        return last_login;
    }

    public void setLast_login(Date last_login) {
        this.last_login = last_login;
=======
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
>>>>>>> 5bce24f5d781c0764f9c1bfd54d29d3a77515e32
    }

    public int getIs_staff() {
        return is_staff;
    }

    public void setIs_staff(int is_staff) {
        this.is_staff = is_staff;
    }
<<<<<<< HEAD
    
=======

    public Date getSignup_date() {
        return signup_date;
    }

    public void setSignup_date(Date signup_date) {
        this.signup_date = signup_date;
    }
>>>>>>> 5bce24f5d781c0764f9c1bfd54d29d3a77515e32
    
}
