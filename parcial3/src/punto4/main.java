/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto4;

/**
 *
 * @author az230
 */
public class main {
    public static void main(String[] args) {
        Configuracion configuracion1 = Configuracion.getInstancia();
        
        System.out.println("URL: " + configuracion1.getUrl());
        System.out.println("Usuario" + configuracion1.getUsuario());
        System.out.println("Password" + configuracion1.getPassword());
        
        Configuracion configuracion2 = Configuracion.getInstancia(); 
        System.out.println("Son las mismas: " + (configuracion1 == configuracion2));
    }
}
