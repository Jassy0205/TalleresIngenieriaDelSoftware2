/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller10_experto;

/**
 *
 * @author az230
 */
public class Taller10_Experto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carrito carrito1 = new Carrito(); 
        
        Libro libro1 = new Libro("El dia de hoy", "Jassy P.", "123", 15265); 
        Libro libro2 = new Libro("El alquimista", "Paulo C.", "1263", 20265); 
        Libro libro3 = new Libro("La luna", "Paulo C.", "1923", 19475); 
        
        carrito1.agregarLibro(libro3);
        carrito1.agregarLibro(libro1);
        carrito1.agregarLibro(libro2);
        
        carrito1.calcularPrecioTotal(); 
        
    }
    
}
