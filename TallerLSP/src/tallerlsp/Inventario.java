/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerlsp;

/**
 *
 * @author az230
 */
public class Inventario {
    public double calcular (Producto product){
        return product.CalcularCosto();
    }
    
    public void enviarPorCorreo (ProductoFisico productoF){
        productoF.EnviarPorCorreo();
    }
    
    public void enviarPorCorreo (ProductoMixto productoM){
        productoM.EnviarPorCorreo();
    }
}
