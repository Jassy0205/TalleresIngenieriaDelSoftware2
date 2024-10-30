/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimeraPregunta.newpackage;

/**
 *
 * @author az230
 */
public class Orden{
    CalcularImpuesto calcuadorImpuesto; 

    public Orden() {
    }
    
    public Orden(CalcularImpuesto calcuadorImpuesto){
        this.calcuadorImpuesto = calcuadorImpuesto; 
    }
    
    public double calcularDescuentoTotal(double precio, double descuento){
        double descuentoPrecio = precio - descuento; 
        double impuesto = calcuadorImpuesto.calcularTotalImpuesto(precio);
        return descuentoPrecio+impuesto; 
    }
}
