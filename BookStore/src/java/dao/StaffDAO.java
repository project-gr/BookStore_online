/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.StaffBean;
import context.DBcontext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Ren
 */
public class StaffDAO {
    Connection conn = null; // access to sql server 
    PreparedStatement ps = null; // ném query từ netbean qua sql server
    ResultSet rs = null;
    
    public StaffBean checklogin (String Staff_username, String Staff_password){
        try {
            String query = "select * from Staff where Staff_username = ? and Staff_password = ?";
            conn = DBcontext.getConnection();
            ps = conn.prepareStatement(query);
            
            ps.setString(1, Staff_username); // truyền username vô dấu '?' thứ nhất
            ps.setString(2, Staff_password); // truyền password vô dấu '?' thứ 2
            
            rs = ps.executeQuery();
            
            while (rs.next()){
                StaffBean staffBean = new StaffBean(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
                return staffBean;
            }
        } catch (Exception e) {
        }
        return null;
    }
}