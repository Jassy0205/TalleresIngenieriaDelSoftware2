/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdip2;

import java.util.Date;

/**
 *
 * @author az230
 */
public class Orden {
    String lugarOrigen; 
    String lugarDestino; 
    Date fecha;

    public Orden(String lugarOrigen, String lugarDestino, Date fecha) {
        this.lugarOrigen = lugarOrigen;
        this.lugarDestino = lugarDestino;
        this.fecha = fecha;
    }

    public String getLugarOrigen() {
        return lugarOrigen;
    }

    public String getLugarDestino() {
        return lugarDestino;
    }

    public Date getFecha() {
        return fecha;
    }
    
    
}
