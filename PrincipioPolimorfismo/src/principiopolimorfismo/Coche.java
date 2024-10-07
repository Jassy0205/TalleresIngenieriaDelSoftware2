/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principiopolimorfismo;

/**
 *
 * @author az230
 */
public class Coche implements ITransporte{

    public Coche() {
    }

    @Override
    public void acelerar() {
        System.out.println("El carro accelera");
    }

    @Override
    public void frenar() {
        System.out.println("El carro frena");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Informacion carro");
    }
}
