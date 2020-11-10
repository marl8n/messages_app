/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messages_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MIDP9
 */
public class ConnectionToSQL {
    
    public Connection getConnecton() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "");
            if ( connection != null ) {
                System.out.println("You're connected!");
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        return connection;
    }
    
    
}
