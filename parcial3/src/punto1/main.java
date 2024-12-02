/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto1;

/**
 *
 * @author az230
 */
public class main {
    public static void main(String[] args) {
        FabricaEnvio fabricaExpress = new FabricaEnvioExpress();
        FabricaEnvio fabricaRegular = new FabricaEnvioRegular();

        ServicioEnvioCliente clienteExpress = new ServicioEnvioCliente(fabricaExpress);
        clienteExpress.enviarPaquete("Paquete 1");

        ServicioEnvioCliente clienteRegular = new ServicioEnvioCliente(fabricaRegular);
        clienteRegular.enviarPaquete("Paquete 2");
    }
}
