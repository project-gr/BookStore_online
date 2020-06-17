/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    public UserBean() {
    }

    public UserBean(String username, String pass, String fName, String address, String phone, String email, int is_staff, Date signup_date) {
        this.username = username;
        this.pass = pass;
        this.fName = fName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.is_staff = is_staff;
        this.signup_date = signup_date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIs_staff() {
        return is_staff;
    }

    public void setIs_staff(int is_staff) {
        this.is_staff = is_staff;
    }

    public Date getSignup_date() {
        return signup_date;
    }

    public void setSignup_date(Date signup_date) {
        this.signup_date = signup_date;
    }

}
