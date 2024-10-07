/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_altacohesion_bajoacoplamiento;

import java.util.List;

/**
 *
 * @author az230
 */
public class TotalServiceImpl implements CalculadoraTotalService{
    
    private double calcularPrecioBase(List<Producto> productos) {
        return productos.stream().mapToDouble(Producto::getPrecio).sum();
    }
    
    private double calcularPrecioConDescuento(double precioBase, double descuento) {
        if (descuento > 0) {
            return precioBase - (precioBase * descuento);
        }
        return precioBase; 
    }

    @Override
    public double CalcularTotal(Factura factura) {
        double precioBase = calcularPrecioBase(factura.getProductos());
        return calcularPrecioConDescuento(precioBase, factura.getDescuento());
    }
}
