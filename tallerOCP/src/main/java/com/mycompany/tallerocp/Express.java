/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerocp;

/**
 *
 * @author az230
 */
public class Express implements Envio {

    public Express() {
    }

    @Override
    public double calculatorCosto(double peso, double distancia) {
        return peso*1.0*distancia*0.2;
    }

}
