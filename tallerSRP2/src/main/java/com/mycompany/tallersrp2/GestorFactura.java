/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallersrp2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author az230
 */
public class GestorFactura {
    List<Factura> listaFacturas = new ArrayList<Factura> (); //Base de datos

    public GestorFactura() {
    }

    public void guardarFactura (Factura factura) {
        listaFacturas.add(factura);
        System.out.println("Factura "+ factura.getCodigo() +" guardada en la base de datos");
    }
    
    public List<Factura> ObtenerFacturas () {
        return listaFacturas;
    }
}
