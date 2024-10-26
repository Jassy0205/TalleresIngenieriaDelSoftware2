/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16prototype;

/**
 *
 * @author az230
 */
public class Producto implements Prototype{
    private String nombre; 
    private double precio; 
    private String categoria; 

    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }
    
    @Override
    public Prototype clone() {
        return new Producto(getNombre(), getPrecio(), getCategoria()); 
    }
    
    public void getInfo(){
        System.out.println("Producto: "+ getNombre() + " - " + getPrecio() + " - " + getCategoria());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
