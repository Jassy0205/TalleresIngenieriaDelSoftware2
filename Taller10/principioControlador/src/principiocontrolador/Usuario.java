/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principiocontrolador;

/**
 *
 * @author az230
 */
public class Usuario {
    ControladorVenta controladorV = new ControladorVenta(); 

    public Usuario() {
    }
    
    public void comprar(String tipoEntrada){
        controladorV.comprarEntrada(tipoEntrada); 
    }
}
