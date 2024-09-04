/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talleridp;

/**
 *
 * @author az230
 */
public class Usuario {
    private IServicioDeNotificaciones servicioDeNotificaciones;

    public Usuario(IServicioDeNotificaciones servicioDeNotificaciones) {
        this.servicioDeNotificaciones = servicioDeNotificaciones;
    }
    
    
    public void enviarNotificacion(String mensaje){
        servicioDeNotificaciones.enviarNotificacion(mensaje);
    }
}
