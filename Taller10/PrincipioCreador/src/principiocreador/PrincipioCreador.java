/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principiocreador;

/**
 *
 * @author az230
 */
public class PrincipioCreador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Orden orden1 = new Orden(); 
        
        orden1.agregarComputadora("HIFR 5", "RTX G", 8);
        orden1.agregarComputadora("YTDW 5", "TXL G", 16);

        System.out.println(orden1.getComputadoras().toString());
    }
    
}
