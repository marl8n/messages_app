/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messages_app;

import java.sql.Connection;

/**
 *
 * @author MIDP9
 */
public class Start {
    public static void main(String[] args) {
        ConnectionToSQL connectionToSql = new ConnectionToSQL();
        
        try (Connection cnx = connectionToSql.getConnecton() ) {
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
