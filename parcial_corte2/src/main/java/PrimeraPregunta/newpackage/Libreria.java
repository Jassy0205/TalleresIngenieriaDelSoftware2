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
public class Libreria {
    ArrayList<Libro> libros;

    public Libreria(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public Libreria() {
    }
    
    public void anadirLibro(Libro libro){
        libros.add(libro);
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
}
