/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller16prototype;

/**
 *
 * @author az230
 */
public class Taller16Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto producto1 = new Producto("Leche", 15.6, "liquidos");
        Producto producto2 = (Producto) producto1.clone(); 
        Producto producto3 = (Producto) producto1.clone(); 
        
        producto1.getInfo();
        
        producto2.setNombre("Jugo de naranja"); 
        producto2.getInfo();
        
        producto3.setNombre("Jugo de pera"); 
        producto3.getInfo();
    }
    
}
