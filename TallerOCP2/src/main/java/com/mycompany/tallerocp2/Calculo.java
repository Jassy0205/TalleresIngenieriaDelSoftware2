/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerocp2;

/**
 *
 * @author az230
 */
public abstract class Calculo {
    String producto;
    int cantidad;
    double precio;

    public Calculo(String producto, int cantidad, double precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public abstract double calculatorImpuesto();
}
