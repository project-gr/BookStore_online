/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.dao;

import com.bookstore.bean.OrderBean;
import com.bookstore.context.DBcontext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class OrderDAO implements DAO<OrderBean> {

    static Connection conn = null; // access to sql server 
    static PreparedStatement ps = null; // ném query từ netbean qua sql server
    static ResultSet rs = null;

    @Override
    public List<OrderBean> getList() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<OrderBean> getElement(String Book_Name) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(OrderBean item) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(OrderBean item) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int insertOrder(ArrayList<OrderBean> orders) {
        Statement stmt = null;
        int resultNo = 0;

        try {
            conn = DBcontext.getConnection();

            if (conn != null) {
                stmt = conn.createStatement();

                StringBuilder sb = new StringBuilder("insert into line_item (transaction_id, isbn, quantity) values");
                for (OrderBean item : orders) {
                    sb.append("('" + item.getOrderID()+ "', '");
                    sb.append(item.getIsbn() + "', '");
                    sb.append(item.getQuantity() + "'),");
                }
                sb.replace(sb.length() - 1, sb.length(), ";");
                resultNo = stmt.executeUpdate(sb.toString());
            }
        } catch (SQLException e) {
            for (Throwable t : e) {
                t.printStackTrace();
            }
        } catch (Exception et) {
            et.printStackTrace();
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    DBcontext.returnConnection(conn);
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        }
        return resultNo;
    }

}
