/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package talleridp;

/**
 *
 * @author az230
 */
public class ServicioDeNotificacioneslmpl implements IServicioDeNotificaciones{

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println(mensaje);
    }
}
