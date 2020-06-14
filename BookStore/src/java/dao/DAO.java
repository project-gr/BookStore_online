/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.BookBean;
import java.util.List;

/**
 *
 * @author Ren
 */
public interface DAO {
    List<BookBean> getList();
    
    List<BookBean> getElement(String Book_Name);
    
    BookBean getBook (String Book_ID);
    
    boolean save (BookBean bookBean);
    
    boolean delete (String Book_ID);
    
    boolean update (BookBean bookBean);
}
