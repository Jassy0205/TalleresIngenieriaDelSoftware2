/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallersrp2;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author az230
 */
public class GestorCliente {
    List<Cliente> listaCliente = new ArrayList<Cliente> (); //Base de datos

    public GestorCliente() {
    }
    
    public void guardarCliente (Cliente cliente1) {
        listaCliente.add(cliente1);
        System.out.println("Cliente "+ cliente1.getId() +" guardado en la base de datos");
    }
}
