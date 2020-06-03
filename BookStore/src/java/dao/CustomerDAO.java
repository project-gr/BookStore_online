/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.CustomerBean;
import context.DBcontext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Ren
 */
public class CustomerDAO {
    Connection conn = null; // access to sql server 
    PreparedStatement ps = null; // ném query từ netbean qua sql server
    ResultSet rs = null;
    
    public CustomerBean checklogin (String Cus_username, String Cus_password){
        try {
            String query = "select * from Customers where Cus_username = ? and Cus_password = ?";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            
            ps.setString(1, Cus_username); // truyền username vô dấu '?' thứ nhất
            ps.setString(2, Cus_password); // truyền password vô dấu '?' thứ 2
            
            rs = ps.executeQuery();
            
            while (rs.next()){
                CustomerBean customerBean = new CustomerBean(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));
                return customerBean;
            }
        } catch (Exception e) {
        }
        return null;
    }
}
