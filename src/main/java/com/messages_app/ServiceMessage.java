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
        DAOMessage.readMessageDB();
    }
    
    public static void deleteMessage() {
        int idMessage = -1;
        System.out.print("Indique el id del mensaje a borrar");
        Scanner sc = new Scanner(System.in);
        idMessage = Integer.valueOf(sc.nextLine());
        DAOMessage.deleteMessageDB(idMessage);
    }
    
    public static void editMessage() {
        String text = "";
        int idMessage = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nuevo texto del mensaje: ");
        text = sc.nextLine();
        System.out.println("Indica el id del mensaje que quieras editar: ");
        idMessage = Integer.valueOf(sc.nextLine());
        
        DAOMessage.actualizeMessage(idMessage, text);
    }
    
}
