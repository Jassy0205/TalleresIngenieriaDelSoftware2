/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallersrp2;
import java.time.LocalDate;

/**
 *
 * @author az230
 */
public class Factura {
    Cliente cliente;
    LocalDate fecha; 
    String codigo; 
    String producto; 
    int cantidad; 
    int valortotal; 

    //Se crea la factura
    public Factura(Cliente cliente, String codigo, String producto, int cantidad, int valortotal) {
        this.cliente = cliente;
        this.codigo = codigo;
        this.producto = producto;
        this.cantidad = cantidad;
        this.valortotal = valortotal;
        this.fecha = LocalDate.now();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getValortotal() {
        return valortotal;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
