/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messages_app;

import java.util.Scanner;

/**
 *
 * @author MIDP9
 */
public class ServiceMessage {
    
    public static void createMessage() {
        String text = "", author = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        text = sc.nextLine();
        
        System.out.println("Nombre del autor");
        author = sc.nextLine();
        
        Message message = new Message (
                text,
                author
        );
        
        DAOMessage.createMessageDB(message);
    }
    
    public static void listMessage() {
        //
    }
    
    public static void deleteMessage() {
        //
    }
    
    public static void editMessage() {
        //
    }
    
}
