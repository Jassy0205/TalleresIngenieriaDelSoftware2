/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallersrp2;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author az230
 */
public class TallerSRP2 {

    public static void main(String[] args) {
        
        //Creción de gestor de clientes y facturas
        GestorCliente gestorCliente1 = new GestorCliente();
        GestorFactura gestorFactura1 = new GestorFactura();
        
        EmailService emailservice1 = new EmailService("ABC");
        DIANService DIANservice1 = new DIANService("DEF");
        
        //Creación de clientes
        Cliente cliente1 = new Cliente("123", "jassy1@gmail.com" ,"Jassy");
        Cliente cliente2 = new Cliente("456", "melissa98@gmail.com","Melissa");
        
        //Se guarda información de clientes en base de datos
        System.out.println("Se guardan los clientes en la base de datos:");
        gestorCliente1.guardarCliente(cliente1);
        gestorCliente1.guardarCliente(cliente2);
        
        //Creación de facturas
        Factura factura1 = new Factura(cliente1, "189", "papa", 12, 18956);
        Factura factura2 = new Factura(cliente2, "987", "zanahoria", 1, 5460);
        Factura factura3 = new Factura(cliente2, "654", "zanahoria", 2, 9680);
        
        //Se guarda información de facturas en base de datos
        System.out.println(" \nSe guardan las facturas en la base de datos:");
        gestorFactura1.guardarFactura(factura1);
        gestorFactura1.guardarFactura(factura1);
        gestorFactura1.guardarFactura(factura1);
        
        Reporte reporte1 = new Reporte();
        
        //Creación de lista de facturas
        List<Factura> listaFacturas = gestorFactura1.ObtenerFacturas();
        
        reporte1.setListaFacturas(listaFacturas);
        
        //Se realiza un envío de factura al correo electronico del cliente que realizó la compra
        System.out.println(" \nEmails enviados: ");
        emailservice1.enviarEmailFactura(factura3, "Cordial saludo, se envía factura correspondiente. Mcuhas gracias por su compra");
        emailservice1.enviarEmailFactura(factura2, "Cordial saludo, se envía factura correspondiente. Mcuhas gracias por su compra");
        emailservice1.enviarEmailFactura(factura1, "Cordial saludo, se envía factura correspondiente. Mcuhas gracias por su compra");
        
        //Se envía factura a la DIAN
        System.out.println("\nFacturas enviadas a la DIAN: ");
        DIANservice1.enviarFacturaDian(factura1);
        DIANservice1.enviarFacturaDian(factura2);
        DIANservice1.enviarFacturaDian(factura3); 
        
        //Se genera reporte mensual
        System.out.println("\nReporte mensual de facturas: ");
        reporte1.generarReporteFacturas();
    }
}
