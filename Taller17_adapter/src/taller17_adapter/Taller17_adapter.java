/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller17_adapter;

/**
 *
 * @author az230
 */
public class Taller17_adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ImpresoraLaser impresoraLaser = new ImpresoraLaser();
        ImpresoraInkJet impresoraInkJet = new ImpresoraInkJet();

        ImpresoraLaserAdapter laserAdapter = new ImpresoraLaserAdapter(impresoraLaser);
        ImpresoraInkJetAdapter inkJetAdapter = new ImpresoraInkJetAdapter(impresoraInkJet);

        System.out.println("Usando adaptadores:");
        laserAdapter.imprimir();  
        inkJetAdapter.imprimir(); 
    }
    
}
