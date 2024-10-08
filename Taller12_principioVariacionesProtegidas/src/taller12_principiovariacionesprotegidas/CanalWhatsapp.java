/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12_principiovariacionesprotegidas;

/**
 *
 * @author az230
 */
public class CanalWhatsapp implements CanalNotificacion{

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        System.out.println("Enviando notificacion por WhatsApp: " + notificacion.getTitulo());
    }
}
