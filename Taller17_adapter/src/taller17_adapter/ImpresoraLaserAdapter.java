/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller17_adapter;

/**
 *
 * @author az230
 */
public class ImpresoraLaserAdapter implements Impresora {
    private ImpresoraLaser impresoraLaser;

    public ImpresoraLaserAdapter(ImpresoraLaser impresoraLaser) {
        this.impresoraLaser = impresoraLaser;
    }

    @Override
    public void imprimir() {
        impresoraLaser.imprimirConLaser();
    }
}

