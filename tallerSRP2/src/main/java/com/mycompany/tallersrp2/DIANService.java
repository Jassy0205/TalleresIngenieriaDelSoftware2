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
public class DIANService { 
    String id; 

    public DIANService(String id) {
        this.id = id;
    }
    
    //Se envía factura a la DIAN
    public void enviarFacturaDian(Factura factura){
        Date fecha = new Date();
        System.out.println("El día "+ fecha +" se envía factura " + factura.getCodigo() + " a la DIAN correctamente");
    }

    public String getId() {
        return id;
    }
}
