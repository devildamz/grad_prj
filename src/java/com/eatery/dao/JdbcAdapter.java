/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eatery.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author devildamz
 */
public abstract class JdbcAdapter {
    
   private static String username = "username";
    private static String password = "password";
    private static String url = "jdbc:mysql://127.0.0.1:3306/eatarydb";

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException ex) {
            // Logger.getLogger(this.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            // Logger.getLogger(this.class.getName()).log(Level.SEVERE, null, ex);
        }
        return DriverManager.getConnection(url, username, password);
    }

    
    
    
}
