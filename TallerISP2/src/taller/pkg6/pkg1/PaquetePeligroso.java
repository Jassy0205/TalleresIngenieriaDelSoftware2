/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.pkg6.pkg1;

/**
 *
 * @author az230
 */
public class PaquetePeligroso extends Paquete implements IPaquetePeligroso {
    private String etiquetasPeligro;
    private boolean embalajeEspecial;

    public PaquetePeligroso(String etiquetasPeligro, boolean embalajeEspecial, double peso, double dimensiones) {
        super(peso, dimensiones);
        this.etiquetasPeligro = etiquetasPeligro;
        this.embalajeEspecial = embalajeEspecial;
    }

    @Override
    public void verificarContenidoPeligroso() {
        System.out.println("Se verifica el contenido del paquete peligroso");
    }

    @Override
    public void asegurarPaquetePeligroso() {
        System.out.println("Se asegura el paquete peligroso");
    }
}
