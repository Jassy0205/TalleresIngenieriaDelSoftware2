/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto3;

/**
 *
 * @author az230
 */
public class main {
    public static void main(String[] args) {
        NuevoSistemaPago sistemaPago = new NuevoSistemaPago();

        SistemaPago adapter = new NuevoSistemaPagoAdapter(sistemaPago);

        adapter.crearSesion("Juan Pérez", "juan.perez@example.com");
        adapter.validarCorreo("juan.perez@example.com");
        adapter.validarAutorizacion();
        adapter.realizarPago();
    }
}
