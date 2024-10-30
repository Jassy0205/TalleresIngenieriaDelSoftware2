/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimeraPregunta.newpackage;

/**
 *
 * @author az230
 */
public class Main {
    public static void main(String[] args) {
        
        //Principio DRY
        CalcularImpuesto calculadorImpuesto = new CalcularImpuesto();
        Orden orden1 = new Orden(calculadorImpuesto);
        System.out.println("El descuento total es de: "+ orden1.calcularDescuentoTotal(3265, 100));
        
        //Principio Controlador
        Libro libro1 = new Libro("Libro1", "Jassy", 1256, 2001);
        Libro libro2 = new Libro("Libro2", "Susana", 2569, 2010);
        Libro libro3 = new Libro("Libro2", "Jassy", 1556, 2001);
        
        Libreria libreria = new Libreria();
        Controlador controladorLibreria = new Controlador(libreria);
        
        controladorLibreria.añadirLibro(libro3);
        controladorLibreria.añadirLibro(libro2);
        controladorLibreria.añadirLibro(libro1);
        
        controladorLibreria.LibroxAño(2010);
        controladorLibreria.buscarLibroxTitulo("Libro1");
        controladorLibreria.obtenerLibrosentrePrecios(1000, 2000);
    }
}
