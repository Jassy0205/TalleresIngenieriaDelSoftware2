/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg6.pkg1;

/**
 *
 * @author az230
 */
public class PaqueteGrande extends Paquete implements IPaqueteGrande{
    private double volumen;
    private String medioTransporte;

    public PaqueteGrande(double volumen, String medioTransporte, double peso, double dimensiones) {
        super(peso, dimensiones);
        this.volumen = volumen;
        this.medioTransporte = medioTransporte;
    }

    @Override
    public void calcularCostoEnvioGrande() {
        System.out.println("Se calcula el costo de envio del paquete grande");
    }
}
