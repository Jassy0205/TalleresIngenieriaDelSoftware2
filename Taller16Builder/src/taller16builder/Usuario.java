/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16builder;

import java.util.Set;

/**
 *
 * @author az230
 */
public class Usuario {
    private String nombre; 
    private int edad; 
    private String correo; 
    private Set<String> intereses; 

    public Usuario(Builder builder) {
        this.nombre = builder.nombre; 
        this.correo = builder.correo; 
        this.edad = builder.edad; 
        this.intereses = builder.intereses; 
    }
    
    public void infoUsuario(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Edad: " + edad);
        System.out.println("\nIntereses");
        for (String interes : intereses) {
            System.out.println("Interes: "+interes);
        }
    }
}
