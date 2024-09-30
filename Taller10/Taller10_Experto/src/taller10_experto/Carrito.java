/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_experto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author az230
 */
public class Carrito {
    private List<Libro> libros = new ArrayList<>(); 
    
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
    
    public double calcularPrecioTotal(){
        double total = 0; 
        for (Libro libro : libros){
            total += libro.getPrecio() * libros.size();
        }
        return total; 
    }
}
