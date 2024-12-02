/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto3;

/**
 *
 * @author az230
 */
public class NuevoSistemaPagoAdapter implements SistemaPago {
    private NuevoSistemaPagoOperacion operacion;
    private NuevoSistemaPago sistemaPago;

    public NuevoSistemaPagoAdapter(NuevoSistemaPago sistemaPago) {
        this.operacion = new NuevoSistemaPagoOperacion();
        this.sistemaPago = sistemaPago;
    }
    
    @Override
    public void crearSesion(String nombre, String correo) {
        sistemaPago.setNombre(nombre);
        sistemaPago.setCorreo(correo);
        operacion.crearSesion(sistemaPago);
    }

    @Override
    public void validarCorreo(String correo) {
        sistemaPago.setCorreo(correo);
        operacion.validarCorreo(sistemaPago);
    }

    @Override
    public void validarAutorizacion() {
        operacion.ValidarAutorizacion();
    }

    @Override
    public void realizarPago() {
        operacion.realizarPago();
    }
}