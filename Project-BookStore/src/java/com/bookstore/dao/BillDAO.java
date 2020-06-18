/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bookstore.dao;

import com.bookstore.bean.BillBean;
import com.bookstore.context.DBcontext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class BillDAO implements DAO<BillBean> {

    static Connection conn = null; // access to sql server 
    static PreparedStatement ps = null; // ném query từ netbean qua sql server
    static ResultSet rs = null;

    @Override
    public List<BillBean> getList() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<BillBean> getElement(String Book_Name) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(BillBean item) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(BillBean item) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int insertBill(BillBean bill) {
        Statement stmt = null;
        int resultNo = 0;
        Connection conn = null;
        ResultSet rs = null;

        try {
            conn = DBcontext.getConnection();

            if (conn != null) {
                stmt = conn.createStatement();

                String strQuery = "insert into bill (username, order_date, total_price, is_processed) "
                        + "values('"
                        + bill.getUsername() + "', NOW(), '"
                        + bill.getTotalPrice() + "', '"
                        + bill.getIsProcessed() + "')";

                stmt.executeUpdate(strQuery, Statement.RETURN_GENERATED_KEYS);
                rs = stmt.getGeneratedKeys();
                if (rs.next()) {
                    resultNo = rs.getInt(1);
                }
                System.out.println("TransID: " + resultNo);
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
