/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principiopolimorfismo;

/**
 *
 * @author az230
 */
public class PrincipioPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Garage garage = new Garage();
        
        Coche carro = new Coche();
        Avion avion = new Avion();
        Bicicleta bicicleta = new Bicicleta();
        
        
        garage.estacionar(carro);
        System.out.println("---------------------");
        
        garage.estacionar(avion);
        System.out.println("---------------------");
        
        garage.estacionar(bicicleta);
        System.out.println("---------------------");
    }
    
}
