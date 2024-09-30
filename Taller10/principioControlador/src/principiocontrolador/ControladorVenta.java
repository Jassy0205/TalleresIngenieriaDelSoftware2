/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principiocontrolador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author az230
 */
public class ControladorVenta {
    private List<Entrada> entradas = new ArrayList<>();
    
    public void agregarEntrada (Entrada entrada) {
        entradas.add(entrada);
    }
    
    public void comprarEntrada(String tipoEntrada){
        Entrada entrada = encontrarEntrada(tipoEntrada);
        if (entrada != null){
            if (entrada.isDisponible()){
                entrada.setDisponible(false);
                System.out.println("Entrada comprada");
            }else 
                System.out.println("Entrada no disponible");   
        }else {
            System.out.println("No se encuentra la entrada del tipo solicitado");
        }
    }
    
    public Entrada encontrarEntrada(String tipoEntrada){
        for (Entrada entrada : entradas) {
            if (entrada.getTipo().equalsIgnoreCase(tipoEntrada)) { 
                return entrada; 
            }
        }
        return null;
    }
}
