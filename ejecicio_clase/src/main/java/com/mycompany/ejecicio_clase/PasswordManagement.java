/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejecicio_clase;

/**
 *
 * @author az230
 */
public class PasswordManagement {
    String password; 

    public PasswordManagement(String Password) {
        this.password = Password;
    }
    
    public String validatePassword(){
        if (password.length() == 8)
            return "Correct password"; 
        else
            return "Incorect password";
    }
    
}
