/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12_principioindireccion;

/**
 *
 * @author az230
 */
public class ServicioOutlook implements IServicioNotificaciones{

    @Override
    public Correo crear(Usuario usuario) {
        return new Outlook(usuario.getCorreo(), usuario.getNombre());
    }
    
}
