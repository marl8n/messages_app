/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messages_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author MIDP9
 */
public class DAOMessage {
    
    public static void createMessageDB(Message message) {
        ConnectionToSQL dbConnection = new ConnectionToSQL();
        
        try ( Connection connection = dbConnection.getConnecton()){
            
            PreparedStatement ps = null;
            
            try{
                String query = "INSERT INTO mensajes (message, author_message) VALUES (?, ?)";
                ps = connection.prepareStatement(query);
                ps.setString(1, message.getMessage());
                ps.setString(2, message.getAuthorMessage());
                ps.executeUpdate();
                System.out.println("Mensaje creado");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            
        } catch ( SQLException ex ){
            System.out.println(ex);
        }
    }
    
    public static void readMessageDB() {
        //
    }
    
    public static void deleteMessageDB(Integer idMessage) {
        //
    }
    
    public static void actualizeMessage(Message message) {
        //
    }
    
}
