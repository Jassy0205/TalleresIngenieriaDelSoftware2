/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundaPregunta;

/**
 *
 * @author az230
 */
public class TareaDAO implements ITareasDAO{

    @Override
    public void insertarTarea() {
        System.out.println("Se inserta tarea a la Base de datos");
    }

    @Override
    public void leerTarea() {
        System.out.println("OBTENIENDO UNA TAREA");
    }
    
}
