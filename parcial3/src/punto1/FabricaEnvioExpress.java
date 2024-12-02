/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto1;

/**
 *
 * @author az230
 */
public class FabricaEnvioExpress implements FabricaEnvio{

    @Override
    public Envio crearEnvio() {
        return new EnvioExpress();
    }
}
