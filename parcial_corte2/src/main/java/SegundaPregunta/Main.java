/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundaPregunta;

/**
 *
 * @author az230
 */
public class Main {
    public static void main(String[] args) {
        Tarea tarea1 = new Tarea("Hola mundo");
        
       ITareasDAO Itareas = new TareaDAO();
       envioNotificaciones envioNotificacionesSMS = new enviarNotificacionesPorSMS();
       envioNotificaciones envioNotificacionesWhatsapp = new enviarNotificacionesPorWhatsaap(); 
       
       Sistema sistema = new Sistema(envioNotificacionesSMS, Itareas); 
       sistema.enviarNotificaciones();
       sistema.insertarTareaB(tarea1);
       sistema.leerTareaB();
    }
}
