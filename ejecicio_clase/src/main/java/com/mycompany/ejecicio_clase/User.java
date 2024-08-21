/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejecicio_clase;
/**
 *
 * @author az230
 */
public class User {
    String id;
    String name;
    int age; 
    
    //Función para crear usuario
    public User(String id, String name, int age, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //Función que retorna el identificador del usuario
    public String getId() {
        return id;
    }

    //Función que retorna el nombre del usuario
    public String getName() {
        return name;
    }
}
