/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TerceraPregunta;

/**
 *
 * @author az230
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("123", "Jassy", "jassym.peream@gmail.com");

        Tienda tienda1 = new Tienda();
        tienda1.compraFacturaElectronica(cliente1, "1256", 1256, "15");
    }
}
