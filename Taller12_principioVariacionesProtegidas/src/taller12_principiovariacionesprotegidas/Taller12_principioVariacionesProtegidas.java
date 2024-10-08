/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller12_principiovariacionesprotegidas;

/**
 *
 * @author az230
 */
public class Taller12_principioVariacionesProtegidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CanalNotificacion canalCorreo = new CanalCorreoElectronico();
        CanalNotificacion canalSMS = new CanalSMS();
        CanalNotificacion canalWhatsApp = new CanalWhatsapp();
        
        Notificador notificador1 = new Notificador(canalCorreo);
        Notificador notificador2 = new Notificador(canalSMS);
        Notificador notificador3 = new Notificador(canalWhatsApp);
        
        Notificacion notificacion = new Notificacion("Nueva notificacion", "¡Hola!");
        
        notificador1.enviarNotificacion(notificacion);
        notificador2.enviarNotificacion(notificacion);
        notificador3.enviarNotificacion(notificacion);
    }
    
}
