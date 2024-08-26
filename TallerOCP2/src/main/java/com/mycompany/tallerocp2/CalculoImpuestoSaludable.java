/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerocp2;

/**
 *
 * @author az230
 */
public class CalculoImpuestoSaludable extends Calculo{
    double valorImpuesto;

    public CalculoImpuestoSaludable(double valorImpuesto, String producto, int cantidad, double precio) {
        super(producto, cantidad, precio);
        this.valorImpuesto = valorImpuesto;
    }
    
    @Override
    public double calculatorImpuesto() {
       return (cantidad*precio)*this.valorImpuesto;
    }
    
}
