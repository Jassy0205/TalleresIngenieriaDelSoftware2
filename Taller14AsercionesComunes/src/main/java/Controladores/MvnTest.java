/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Controladores;

/**
 *
 * @author az230
 */
public class MvnTest {

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Jassy", 21);
        
        estudiante1.agregarCalificacion(3.6);
        estudiante1.agregarCalificacion(1.2);
        estudiante1.agregarCalificacion(4.8);
        
        System.out.println("El estudiante "+estudiante1.getNombre()+ " tiene "+estudiante1.getNumeroCalificaciones()+" calificaciones");
    }
}
