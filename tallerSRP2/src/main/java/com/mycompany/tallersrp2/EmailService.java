/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallersrp2;
import java.util.Date;

/**
 *
 * @author az230
 */
public class EmailService {
    String id;
    Date fecha;

    public EmailService(String id) {
        this.id = id;
    }
    
    //Envío de factura a correo electronico
    public void enviarEmailFactura(Factura factura, String message){
        this.fecha = new Date();
        System.out.println("El día "+ this.fecha+ " se envió la factura a la dirección de correo electronico: "+factura.getCliente().getCorreo());
    }

    public String getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }
}
