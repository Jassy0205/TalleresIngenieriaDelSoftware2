/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principiopolimorfismo;

/**
 *
 * @author az230
 */
public class Garage {
    
    public Garage() {
    }
    
    public void estacionar(ITransporte iServicioTransporte){
        System.out.println("Se esta estacionando el Transporte");
        iServicioTransporte.acelerar();
        iServicioTransporte.frenar();
        iServicioTransporte.mostrarInformacion();
    }
}
