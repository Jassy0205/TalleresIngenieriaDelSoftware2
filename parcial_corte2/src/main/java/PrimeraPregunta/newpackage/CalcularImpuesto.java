/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimeraPregunta.newpackage;

/**
 *
 * @author az230
 */
public class CalcularImpuesto {

    public CalcularImpuesto() {
    }
    
    
    public double calcularTotalImpuesto(double precio){
        double impuesto = precio * 0.1;
        return precio + impuesto; 
    }
}
