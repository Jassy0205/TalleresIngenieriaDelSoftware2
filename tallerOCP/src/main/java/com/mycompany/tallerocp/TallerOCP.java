/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerocp;

/**
 *
 * @author az230
 */
public class TallerOCP {

    public static void main(String[] args) {
        //Se dan valores de peso y distancia para el envío
        double peso = 0.8;
        double distancia = 10.6;
        
        Estandar envioEstandar = new Estandar();
        Express envioExpress = new Express();
        
        //Se obtiene el calculo de un envío estandar y uno express
        double costoEstandar = envioEstandar.calculatorCosto(peso, distancia);
        double costoExpress = envioExpress.calculatorCosto(peso, distancia);
        
        //Se muestra por consola el costo para cada tipo de envío
        System.out.println("El costo de un envío express es de "+ costoExpress);
        System.out.println("El costo de un envío estandar es de "+ costoEstandar);
        System.out.println("Hello World!");
    }
}
