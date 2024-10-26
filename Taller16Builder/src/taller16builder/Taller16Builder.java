/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller16builder;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author az230
 */
public class Taller16Builder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Builder builder = new Builder().setCorreo("jassy@gmail.com").setEdad(34).setNombre("Jassy"); 
        
        Set<String> intereses = new HashSet<>();
        intereses.add("Musica"); 
        intereses.add("Ajedrez"); 
        intereses.add("Voleibol"); 
        
        builder.setIntereses(intereses);
        
        Usuario usuario1 = builder.build();
        usuario1.infoUsuario();
    }
    
}
