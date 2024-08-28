/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerlsp;

/**
 *
 * @author az230
 */
public abstract class Producto {
    String nombre; 
    int precio; 
    int cantidad;

    public Producto(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public abstract double CalcularCosto();
}
