/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Ren
 */
public class DBcontext {

    /*Insert your other code right after this comment*/
 /*Change/update information of your database connection, DO NOT change name of instance variables in this class*/
    private static final String serverName = "localhost";
    private static final String dbName = "BookStore";
    private static final String portNumber = "1433";
    private static final String userID = "sa";
    private static final String password = "sa";
    private static Connection connection = null;

    public static Connection getConnection() throws Exception {
        if (connection != null) {
            return connection;
        } else {
            String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, userID, password);
            return connection;
        }
    }
}
