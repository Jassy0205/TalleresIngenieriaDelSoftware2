/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejecicio_clase;

/**
 *
 * @author az230
 */
public class Salary {
    int value; 
    int time;
    int total;

    //Función para insertar los datos de salario (crearlo)
    public Salary(int value, int time) {
        this.value = value;
        this.time = time;
    }

    //Función que calcula el salario
    //Retorna el salario
    public int Calculate_salary(){
        total = (this.value/31)*this.time; 
        return total;
    }
}
