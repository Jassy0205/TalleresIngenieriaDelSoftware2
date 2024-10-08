/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12_principioindireccion;

/**
 *
 * @author az230
 */
public abstract class Correo {
    protected String direccion;
    protected String nombreUsuario;
    
    public Correo(String direccion, String nombreUsuario) {
        this.direccion = direccion;
        this.nombreUsuario = nombreUsuario;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }
}
