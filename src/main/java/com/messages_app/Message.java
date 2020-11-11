/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.messages_app;

/**
 *
 * @author MIDP9
 */
public class Message {
    private Integer idMessage;
    private String message;
    private String authorMessage;
    private String messageDate;

    public Message() {
    }

    public Message(String message, String authorMessage, String messageDate) {
        this.message = message;
        this.authorMessage = authorMessage;
        this.messageDate = messageDate;
    }

    public Message(String message, String authorMessage) {
        this.message = message;
        this.authorMessage = authorMessage;
    }
    
    

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthorMessage() {
        return authorMessage;
    }

    public void setAuthorMessage(String authorMessage) {
        this.authorMessage = authorMessage;
    }

    public String getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(String messageDate) {
        this.messageDate = messageDate;
    }

    
}
