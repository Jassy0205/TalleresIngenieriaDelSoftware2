/* * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerocp2;

/**
 *
 * @author az230
 */
public class TallerOCP2 {

    public static void main(String[] args) {
        String producto = "Salsa_tomate"; 
        int cantidad = 10;
        double precio = 2659.15;
        
        Calculo impuestoIva1 = new CalculoImpuestoIva(0.19, producto, cantidad, precio);
        Calculo impuestoReteIva1 = new CalculoImpuestoReteIva(0.10, producto, cantidad, precio);
        Calculo impuestoSaludable1 = new CalculoImpuestoSaludable(0.05, producto, cantidad, precio);
        
        Factura factura1 = new Factura();
        
        
        System.out.println("El impuesto Iva de "+ producto + " es de: "+factura1.Calculator(impuestoIva1));
        System.out.println("El impuesto de Retención del Iva de "+ producto + " es de: "+factura1.Calculator(impuestoReteIva1));
        System.out.println("El impuesto Saludable de "+ producto + " es de: "+factura1.Calculator(impuestoSaludable1));
    }
}
