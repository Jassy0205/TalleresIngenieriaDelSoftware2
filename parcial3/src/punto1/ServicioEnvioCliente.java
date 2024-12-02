/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto1;

/**
 *
 * @author az230
 */
public class ServicioEnvioCliente {
    private final FabricaEnvio fabricaEnvio;

    public ServicioEnvioCliente(FabricaEnvio fabricaEnvio) {
        this.fabricaEnvio = fabricaEnvio;
    }

    public void enviarPaquete(String paquete) {
        Envio envio = fabricaEnvio.crearEnvio();
        envio.enviar(paquete);
    }
}
