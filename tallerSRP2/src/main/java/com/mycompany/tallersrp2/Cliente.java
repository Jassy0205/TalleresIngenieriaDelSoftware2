/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallersrp2;

/**
 *
 * @author az230
 */
public class Cliente {
    String id;
    String correo;
    String name; 

    //Se crea el cliente 
    public Cliente(String id, String correo, String name) {
        this.id = id;
        this.correo = correo;
        this.name = name;
    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCorreo() {
        return correo;
    }
}
