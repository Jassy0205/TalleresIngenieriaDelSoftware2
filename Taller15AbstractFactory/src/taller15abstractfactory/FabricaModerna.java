/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15abstractfactory;

/**
 *
 * @author az230
 */
public class FabricaModerna implements FabricaMuebles{

    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public Mueble crearMesa() {
        return new MesaModerna();
    }
    
}
