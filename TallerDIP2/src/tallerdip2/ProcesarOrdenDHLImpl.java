/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdip2;

/**
 *
 * @author az230
 */
public class ProcesarOrdenDHLImpl implements IProcesarOrdenDHL{

    @Override
    public void enviarOrdenDHL(Orden orden) {
        System.out.println(orden.getLugarOrigen());
        System.out.println("HACIA:");
        System.out.println("CCON LA OPERAORA FEDEX");
    }
}
