/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messages_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author MIDP9
 */
public class Start {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int option = 0;
        
        do {
            System.out.println("-----------------------------------------");
            System.out.println("Aplicación de mensajes");
            System.out.println("1. Crear un mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Editar mensaje");
            System.out.println("4. Eliminar mensaje");
            System.out.println("0. Salir");
            option = Integer.valueOf(sc.nextLine());
            
            switch (option) {
                case 1: 
                    ServiceMessage.createMessage();
                    break;
                case 2:
                    ServiceMessage.listMessage();
                    break;
                case 3:
                    ServiceMessage.editMessage();
                    break;
                case 4:
                    ServiceMessage.deleteMessage(); 
                    break;
                default:
                    break;
            }
            
        } while ( option != 0 );
        
        ConnectionToSQL connectionToSql = new ConnectionToSQL();
        
        try (Connection cnx = connectionToSql.getConnecton() ) {
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
