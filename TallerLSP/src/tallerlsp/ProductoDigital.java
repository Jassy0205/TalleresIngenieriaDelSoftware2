/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerlsp;

/**
 *
 * @author az230
 */
public class ProductoDigital extends Producto {
    private double size_archivo; //El tamaño del archivo está en MegaByte

    public ProductoDigital(double size_archivo, String nombre, int precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.size_archivo = size_archivo;
    }

    @Override
    public double CalcularCosto() {
        return ((this.cantidad*this.precio)*this.size_archivo);
    }
}
