/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto3;

/**
 *
 * @author az230
 */
public class NuevoSistemaPagoOperacion {
    public void crearSesion(NuevoSistemaPago nuevoSistemaPago){
        System.out.println("CREANDO LA SESION A: " + nuevoSistemaPago.getNombre());
    }
    
    public void validarCorreo(NuevoSistemaPago nuevoSistemaPago) {
        System.out.println("VALIDANDO EL CORREO: " + nuevoSistemaPago.getCorreo());
    }

    public void ValidarAutorizacion() {
        System.out.println("VALIDANDO AUTORIZACION");
    }

    public void realizarPago() {
        System.out.println("REALIZANDO EL PAGO");
    }
}
