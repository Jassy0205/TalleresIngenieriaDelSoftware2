/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg6.pkg1;

/**
 *
 * @author az230
 */
public class PaquetePequeño extends Paquete implements IPaquetePequeño {
    private double valorDeclarado;

    public PaquetePequeño(double valorDeclarado, double peso, double dimensiones) {
        super(peso, dimensiones);
        this.valorDeclarado = valorDeclarado;
    }
    
    @Override
    public void calcularCostoEnvioPequeño() {
        System.out.println("Se calcula el costo del envio de un paquete pequeño");
    }
}
