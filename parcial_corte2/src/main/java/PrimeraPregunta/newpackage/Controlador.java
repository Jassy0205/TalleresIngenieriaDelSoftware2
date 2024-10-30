/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimeraPregunta.newpackage;

import java.util.ArrayList;

/**
 *
 * @author az230
 */
public class Controlador {
    Libreria libreria;

    public Controlador(Libreria libreria) {
        this.libreria = libreria;
    }
  
    public void añadirLibro(Libro libro){
        libreria.anadirLibro(libro);
    }
    
    public void buscarLibroxTitulo(String titulo){
        System.out.println("Libro por titulo "+ titulo);
        
        for (Libro libro : libreria.getLibros()) {
            if (libro.titulo.equalsIgnoreCase(titulo)){
                System.out.println(libro.titulo);
            }
        }
    }
    
    public void obtenerLibrosentrePrecios(double precio1, double precio2){
        System.out.println("Libros entre los precios "+ precio1 + " y "+ precio2);
        for (Libro libro : libreria.getLibros()) {
            if (libro.precio > precio1 && libro.precio < precio2){
                System.out.println(libro.titulo + " - " + libro.precio);
            }
        }   
    }
    
    public void LibroxAño(int año){
        System.out.println("Libros del año "+ año);
        for (Libro libro : libreria.getLibros()) {
            if (libro.año == año){
                System.out.println(libro.titulo + " - " + libro.año);
            }
        }
    }
}
