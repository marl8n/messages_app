 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messages_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
        ConnectionToSQL dbConnection = new ConnectionToSQL();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try (Connection connection = dbConnection.getConnecton() ) {
            try {
                String query = "SELECT * FROM mensajes";
                ps = connection.prepareStatement(query);
                rs = ps.executeQuery();
                
                while (rs.next()) {
                    System.out.println("\nID: " + rs.getInt("id_message") + ". Author" + rs.getString("author_message"));
                    System.out.println(rs.getString("message"));
                    System.out.println("Fecha: " + rs.getString("message_date") + "\n");
                }
                
            } catch ( SQLException e) {
                System.out.println(e);
            }
        } catch ( SQLException ex ) {
            System.out.println(ex);
        }
    }
    
    public static void deleteMessageDB(Integer idMessage) {
        ConnectionToSQL dbConnection = new ConnectionToSQL();
        
        try ( Connection connection = dbConnection.getConnecton() ) {
            PreparedStatement ps = null;
            
            try {
                String query = "DELETE FROM mensajes WHERE id_message = ?";
                ps = connection.prepareStatement(query);
                ps.setInt(1, idMessage);
                ps.executeUpdate();
                System.out.println("El mensaje ha sido borrado exitosamente! ");
            } catch ( SQLException e ) {
                System.out.println("No se ha podido borrar el mensaje");
                System.out.println(e);
            }
        } catch ( SQLException ex ) {
            System.out.println(ex);
        }
    }
    
    public static void actualizeMessage(int idMessage, String message) {
        ConnectionToSQL dbConnection = new ConnectionToSQL();
        try ( Connection connection = dbConnection.getConnecton() ) {
            PreparedStatement ps = null;
            try {
                String query = "UPDATE mensajes SET message = ? WHERE id_message = ?";
                ps = connection.prepareStatement(query);
                ps.setString(1, message);
                ps.setInt(2, idMessage);
                ps.executeUpdate();
                System.out.println("Mensaje actualizado!");
            } catch ( SQLException ex ) {
                System.out.println("No se ha podido actualizar el mensaje");
                System.out.println(ex);
            }
        } catch ( SQLException ex ) {
            System.out.println(ex);
        }
    }
    
}
