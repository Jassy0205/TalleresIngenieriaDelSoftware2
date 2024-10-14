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
        Calculadora calculadora = new Calculadora();
        System.out.println("Suma: " + calculadora.suma(2, 3));
        System.out.println("Resta: " + calculadora.resta(2, 3));
        System.out.println("Division: " + calculadora.division(2, 3));
        System.out.println("Multiplicacion: " + calculadora.multiplicacion(2, 3));
    }
}
