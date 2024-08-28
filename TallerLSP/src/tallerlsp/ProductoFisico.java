/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerlsp;

/**
 *
 * @author az230
 */
public class ProductoFisico extends Producto implements Enviar{
    private double peso; //Está dado en Kilogramos

    public ProductoFisico(double peso, String nombre, int precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.peso = peso;
    }
    
    @Override
    public double CalcularCosto() {
        return ((this.cantidad*this.precio)*this.peso);
    }

    @Override
    public void EnviarPorCorreo() {
        System.out.println("Se envia el producto fisico por correo");
    }
}
