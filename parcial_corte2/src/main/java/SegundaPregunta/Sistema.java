/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundaPregunta;

/**
 *
 * @author az230
 */
public class Sistema {
    envioNotificaciones IenvioNotificaciones; 
    ITareasDAO Itareas;
    
    public Sistema(envioNotificaciones IenvioNotificaciones, ITareasDAO Itareas){
        this.IenvioNotificaciones = IenvioNotificaciones;
        this.Itareas = Itareas;
    }
    
    public void enviarNotificaciones(){
        IenvioNotificaciones.enviarNotificaciones();
    }
    
    public void insertarTareaB(Tarea tarea){
        Itareas.insertarTarea();
    }
    
    public void leerTareaB(){
        Itareas.leerTarea();
    }
}
