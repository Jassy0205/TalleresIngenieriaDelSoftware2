/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller15factorymethod;

/**
 *
 * @author az230
 */
public class Taller15FactoryMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Creadora creadora1 = new CreadoraPaypal();
        MetododePago metododepago1 = creadora1.crearObjetoMetododePago();
        metododepago1.procesarPago(15);
        
        Creadora creadora2 = new CreadoraTarjeta();
        MetododePago metododepago2 = creadora2.crearObjetoMetododePago();
        metododepago2.procesarPago(20);
    }
    
}
