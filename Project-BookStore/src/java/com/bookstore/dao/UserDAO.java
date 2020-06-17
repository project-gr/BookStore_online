/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.dao;

import com.bookstore.bean.UserBean;
import com.bookstore.context.DBcontext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class UserDAO implements DAO<UserBean>{
    Connection conn = null; 
    PreparedStatement ps = null; 
    ResultSet rs = null;
    
    public UserBean checklogin (String username, String pass){
        try {
            String query = "select * from users where username = ? and pass = ?";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            
            ps.setString(1, username); 
            ps.setString(2, pass); 
            
            rs = ps.executeQuery();
            
            while (rs.next()){
                UserBean userBean = new UserBean(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getByte(7), rs.getDate(8));
                return userBean;
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public boolean updateInfo(String username, String fName, String address, String phone, String email) {
        boolean b = false;
        try{
            String query = "update users set fName = " +
                    fName + ", address = " +
                    address+ ", phone = " + phone +", email = " +
                    email + "where  username = " + username;
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            
            b = true;
        } catch(Exception e){
            e.printStackTrace();
        }
        return b;
    }
    
    public UserBean getUser(String username){
        try {
            String query = "select * from users where username = ?";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            
            ps.setString(1, username);
            
            rs = ps.executeQuery();
            
            while (rs.next()){
                UserBean userBean = new UserBean(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getByte(7), rs.getDate(8));
                return userBean;
            }
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public List<UserBean> getList() throws SQLException {
        List<UserBean> userList = null;
        UserBean userBean = null;
        
        try {
            userList= new ArrayList<UserBean>();
            String query = "select * from users";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            
            while (rs.next()){
                userBean = new UserBean();
                userBean.setUsername(rs.getString(1));
                userBean.setPass(rs.getString(2));
                userBean.setfName(rs.getString(3));
                userBean.setAddress(rs.getString(4));
                userBean.setPhone(rs.getString(5));
                userBean.setEmail(rs.getString(6));
                userBean.setIs_staff(rs.getByte(7));
                userBean.setSignup_date(rs.getDate(8));
                
                userList.add(userBean);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public List<UserBean> getElement(String username) throws SQLException {
        List<UserBean> userList = null;
        UserBean userBean = null;
        
        try {
            userList= new ArrayList<UserBean>();
            String query = "select * from users where username like '" + username + "'";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            
            while (rs.next()){
                userBean = new UserBean();
                userBean.setUsername(rs.getString(1));
                userBean.setPass(rs.getString(2));
                userBean.setfName(rs.getString(3));
                userBean.setAddress(rs.getString(4));
                userBean.setPhone(rs.getString(5));
                userBean.setEmail(rs.getString(6));
                userBean.setIs_staff(rs.getByte(7));
                userBean.setSignup_date(rs.getDate(8));
                
                userList.add(userBean);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }

    @Override
    public boolean add(UserBean item) throws SQLException {
        boolean b = false;
        
        try {
            String query = "insert into users (username, pass, fName, address, phone, email, is_staff, signup_date values"
                    + "(" + item.getUsername()+ ", " + item.getPass()+ ", " + item.getfName()+ ", "
                    + item.getAddress()+ ", " + item.getPhone()+ ", " + item.getEmail()+ ", " + item.getIs_staff() + "," + item.getSignup_date() ;
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            
            b = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    @Override
    public boolean delete(String id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(UserBean item) throws SQLException {
        boolean b = false;
        try{
            String query = "update users set pass = " + item.getPass()+ ", fName = " +
                    item.getfName() + ", address = " +
                    item.getAddress()+ ", phone = " + item.getPhone() +", email = " +
                    item.getEmail() + "where  username = " + item.getUsername();
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            
            b = true;
        } catch(Exception e){
            e.printStackTrace();
        }
        return b;
    }

    
    
}
