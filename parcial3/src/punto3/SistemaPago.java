/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto3;

/**
 *
 * @author az230
 */
public interface SistemaPago {
    void crearSesion(String nombre, String correo);
    void validarCorreo(String correo);
    void validarAutorizacion();
    void realizarPago();
}
