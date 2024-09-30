/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principiocontrolador;

/**
 *
 * @author az230
 */
public class PrincipioControlador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Entrada entrada1 = new Entrada("VIP", 1596238, true); 
        Entrada entrada2 = new Entrada("General", 58436, false); 
        Entrada entrada3 = new Entrada("Palco", 268436, true); 
        
        Usuario usuario = new Usuario(); 
        
        ControladorVenta controlador = usuario.controladorV;

        // Agregar entradas al controlador
        controlador.agregarEntrada(entrada3);
        controlador.agregarEntrada(entrada1);
        controlador.agregarEntrada(entrada2);

        System.out.println("Intentando comprar entrada VIP:");
        usuario.comprar("VIP");

        System.out.println("\nIntentando comprar entrada General:");
        usuario.comprar("General");

        System.out.println("\nIntentando comprar entrada VIP de nuevo:");
        usuario.comprar("VIP"); // Debería indicar que no está disponible

        System.out.println("\nIntentando comprar entrada inexistente:");
        usuario.comprar("Balcon"); // Tipo de entrada que no existe
    }
}
