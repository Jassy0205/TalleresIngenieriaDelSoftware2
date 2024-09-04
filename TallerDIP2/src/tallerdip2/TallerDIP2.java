/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerdip2;

/**
 *
 * @author az230
 */
public class TallerDIP2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IProcesarOrdenUPS procesarOrdenUPS = new ProcesarOrdenUPSImpl(); 
        IProcesarOrdenFedex procesarOrdenFedex = new ProcesarOrdenFedexImpl();
        IProcesarOrdenDHL procesarOrdenDHL = new ProcesarOrdenDHLImpl();
        
        SistemaEnvios sistemaEnvio = new SistemaEnvios(procesarOrdenUPS, procesarOrdenDHL, procesarOrdenFedex); 
        Orden orden = new Orden ("MANIZALES", "BOGOTA", null); 
        
        sistemaEnvio.enviarOrdenUPS(orden);
        sistemaEnvio.enviarOrdenFedex(orden);
        sistemaEnvio.enviarOrdenDHL(orden);
    }
    
}
