/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15factorymethod;

/**
 *
 * @author az230
 */
public class PagoTarjeta implements MetododePago{

    @Override
    public void procesarPago(int cantidad) {
        System.out.println("Se implementa el pago con tarjeta");
    }
    
}
