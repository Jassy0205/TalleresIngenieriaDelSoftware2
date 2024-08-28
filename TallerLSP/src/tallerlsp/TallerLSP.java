/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerlsp;

/**
 *
 * @author az230
 */
public class TallerLSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto product1 = new ProductoFisico(1.5, "zanahoria", 1694, 3); 
        Producto product2 = new ProductoDigital(1.5, "RXF", 50094, 1);
        
        ProductoMixto product3 = new ProductoMixto(2.8, 1.0, "Libro de Ray", 68294, 5);
        ProductoFisico product4 = new ProductoFisico(3.1, "papa", 1694, 4); 
        
        Inventario inventario = new Inventario(); 
        
        System.out.println("El costo de esta compra es de: "+inventario.calcular(product1));
        System.out.println("El costo de esta compra es de: "+inventario.calcular(product2)+"/n");
        
        System.out.println(" \nEnvio de correo:");
        inventario.enviarPorCorreo(product3);
        inventario.enviarPorCorreo(product4);
    }
    
}
