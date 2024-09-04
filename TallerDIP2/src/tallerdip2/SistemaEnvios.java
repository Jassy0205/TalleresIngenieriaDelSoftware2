/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdip2;

/**
 *
 * @author az230
 */
public class SistemaEnvios {
    IProcesarOrdenUPS procesarOrdenUPS; 
    IProcesarOrdenDHL procesarOrdenDHL; 
    IProcesarOrdenFedex procesarOrdenFedex; 

    public SistemaEnvios(IProcesarOrdenUPS procesarOrdenUPS, IProcesarOrdenDHL procesarOrdenDHL, IProcesarOrdenFedex procesarOrdenFedex) {
        this.procesarOrdenUPS = procesarOrdenUPS;
        this.procesarOrdenDHL = procesarOrdenDHL;
        this.procesarOrdenFedex = procesarOrdenFedex;
    }
    
    public void enviarOrdenFedex (Orden orden){
        procesarOrdenFedex.enviarOrdenFedex(orden);
    }
    
    public void enviarOrdenUPS (Orden orden){
        procesarOrdenUPS.enviarOrdenUPS(orden);
    }
    
    public void enviarOrdenDHL (Orden orden){
        procesarOrdenDHL.enviarOrdenDHL(orden);
    }
}
