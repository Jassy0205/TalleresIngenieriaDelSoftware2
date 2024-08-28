/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerlsp;

/**
 *
 * @author az230
 */
public class ProductoMixto extends Producto implements Enviar{
    private double peso;
    private double size_archivo;

    public ProductoMixto(double peso, double size_archivo, String nombre, int precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.peso = peso;
        this.size_archivo = size_archivo;
    }
    
    @Override
    public double CalcularCosto() {
        return this.precio*this.cantidad*this.size_archivo*this.precio;
    }

    @Override
    public void EnviarPorCorreo() {
        System.out.println("Se envia producto Mixto por correo");
    }   
}
