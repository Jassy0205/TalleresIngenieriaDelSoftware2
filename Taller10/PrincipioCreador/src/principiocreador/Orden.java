/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principiocreador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author az230
 */
public class Orden {
    private List<Computadora> computadoras = new ArrayList<>(); 
    private FabricaComputadoras fabrica = new FabricaComputadoras(); 

    public Orden() {
    }
    
    public void agregarComputadora(String procesador, String tarjetaGrafica, int ram){
        Computadora computadora = fabrica.crearComputadora(procesador, tarjetaGrafica, ram); 
        computadoras.add(computadora); 
    }

    public List<Computadora> getComputadoras() {
        return computadoras;
    }

    public FabricaComputadoras getFabrica() {
        return fabrica;
    } 
}
