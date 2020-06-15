package com.bookstore.dao;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Ren
 */
public interface DAO<T> {
    List<T> getList() throws SQLException;
    
    List<T> getElement (String Book_Name) throws SQLException;
    
    boolean add (T item) throws SQLException;
    
    boolean delete (String id) throws SQLException;
    
    boolean update (T item) throws SQLException;
}