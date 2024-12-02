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

        adapter.crearSesion("Jassy Perea", "jassy.perea@gmail.com");
        adapter.validarCorreo("jassy.perea@gmail.com");
        adapter.validarAutorizacion();
        adapter.realizarPago();
    }
}
