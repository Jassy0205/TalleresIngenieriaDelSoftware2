/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejecicio_clase;

/**
 *
 * @author az230
 */
public class SendEmail {
    String email; 
    String message; 

    //Función para enviar el email
    public SendEmail(String email, String message) {
        this.email = email;
        this.message = message;
    }
    
    //Función que proporciona el email
    public String getEmail() {
        return email;
    }

    //Función que proporciona el mensaje
    public String getMessage() {
        return message;
    }
    
    
}
