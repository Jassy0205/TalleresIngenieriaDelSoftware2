/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import Controladores.Estudiante;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

//@SpringBootTest
class CalculadoraTest {

    static Estudiante estudiante;

    @BeforeAll
    static void inicializar() {
        estudiante = new Estudiante("Melissa", 22); 
    }

    @Test
    void agregarCalificacionTest() {
        estudiante.agregarCalificacion(8.5);
        Assertions.assertEquals(1, estudiante.getNumeroCalificaciones());
    }

    @Test
    void obtenerPromedioTest() {
        estudiante.agregarCalificacion(8.0);
        estudiante.agregarCalificacion(9.0);
        Assertions.assertEquals(8.5, estudiante.obtenerPromedio());
    }

    @Test
    void getNumeroCalificacionesTest() {
        estudiante.agregarCalificacion(7.0);
        estudiante.agregarCalificacion(9.0);
        Assertions.assertEquals(2, estudiante.getNumeroCalificaciones());
    }

    @Test
    void agregarCalificacionExcepcionTest() {
        Exception exception =  Assertions.assertThrows(IllegalArgumentException.class, () -> {
            estudiante.agregarCalificacion(11.0); 
        });
    }
    
    @AfterAll
    static void finalizar() {
        System.out.println("Liberando recursos despues de todas las pruebas...");
    }
}
