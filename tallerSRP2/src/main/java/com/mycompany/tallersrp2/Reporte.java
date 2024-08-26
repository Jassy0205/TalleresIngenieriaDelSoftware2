/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallersrp2;
import java.util.List;
import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author az230
 */
public class Reporte {
   String id;
   LocalDate fecha;
   int total = 0; 
   List<Factura> listaFacturas;
   
    public Reporte() {
        Random random = new Random();
        this.id = ""+random.nextInt(100);
    }
    
    //Generación de reporte mensual
    public void generarReporteFacturas() {
        this.fecha = LocalDate.now();
        
        for (Factura facturaActual : listaFacturas) {
            if (facturaActual.fecha.getMonthValue() == this.fecha.getMonthValue())
                this.total = this.total + facturaActual.getValortotal();
        }
        
        System.out.println("Reporte " + this.id + 
                ": Durante este mes ( " +this.fecha.getMonthValue()+ " ), las facturas generaron un total de $"+this.total+ " pesos"); 
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setListaFacturas(List<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }

    public int getTotal() {
        return total;
    }

    public String getId() {
        return id;
    }
}
