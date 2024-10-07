/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principio_fabricacionpura;

/**
 *
 * @author az230
 */
public class Principio_FabricacionPura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FabricaPedidos fabrica = new FabricaPedidos();

        Cliente cliente = new Cliente("Jassy", "Calle 54B #17-69F");

        Producto producto1 = new Producto("Laptop ", 150.2, 1);
        Producto producto2 = new Producto("Mouse  ", 250.7, 2);
        Producto producto3 = new Producto("Teclado", 100.3, 3);

        Pedido nuevoPedido = fabrica.crearPedido(cliente);
        
        nuevoPedido.addProductos(producto1);
        nuevoPedido.addProductos(producto2);
        nuevoPedido.addProductos(producto3);

        System.out.println("Detalles del pedido:");
        System.out.println("ID del pedido: " + nuevoPedido.getId());
        System.out.println("Fecha del pedido: " + nuevoPedido.getFecha());
        System.out.println("Cliente: " + nuevoPedido.getCliente().getNombre());
        System.out.println("Dirección: " + nuevoPedido.getCliente().getDireccion());

        System.out.println("Productos en el pedido:");
        System.out.println("--------------------------");
        System.out.println("Product | Precio | Cantidad");
        System.out.println("--------------------------");
        for (Producto producto : nuevoPedido.getProductos()) {
            System.out.println( producto.getNombre() + " | $" + producto.getPrecio() + " | " + producto.getCantidad());
        }
        System.out.println("--------------------------");
    }
    
}
