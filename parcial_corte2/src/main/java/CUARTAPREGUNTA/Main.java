/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CUARTAPREGUNTA;

/**
 *
 * @author az230
 */
public class Main {
    public static void main(String[] args) {
       IImpuestos impuestoColombia = new calcularImpuestoColombia();
       IImpuestos impuestoFancia = new calcularImpuestoFrancia();
       IImpuestos impuestoEEUU = new calcularImpuestoEEUU();
       
       impuestoColombia.calculoImpuesto();
       impuestoFancia.calculoImpuesto();
       impuestoEEUU.calculoImpuesto();
    }
}
