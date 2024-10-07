/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_altacohesion_bajoacoplamiento;

/**
 *
 * @author az230
 */
public class Cliente {
    private String idCliente;
    private String nombre;
    private String direccion;

    public Cliente(String idCliente, String nombre, String direccion) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getIdCliente() {
        return idCliente;
    }
}
