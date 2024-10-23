/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15factorymethod;

/**
 *
 * @author az230
 */
public class CreadoraTarjeta extends Creadora{

    @Override
    public MetododePago crearObjetoMetododePago() {
        return new PagoTarjeta();
    }
    
}
