/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller15abstractfactory;

/**
 *
 * @author az230
 */
public class Taller15AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaMuebles fabricaModerna = new FabricaModerna();
        FabricaMuebles fabricaClasica = new FabricaClasica();
        
        Silla sillaModerna = fabricaModerna.crearSilla();
        sillaModerna.crear(); 
        
        System.out.println("---------------------------------");
        
        Mueble mesaModerna = fabricaModerna.crearMesa();
        mesaModerna.crear();  
        
        System.out.println("---------------------------------");
        
        Silla sillaClasica = fabricaClasica.crearSilla();
        sillaClasica.crear(); 
        
        System.out.println("---------------------------------");
        Mueble mesaClasica = fabricaClasica.crearMesa();
        mesaClasica.crear();  
    }
    
}
