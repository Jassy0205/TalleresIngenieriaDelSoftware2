/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto2;

/**
 *
 * @author az230
 */
public class Hamburguesa {
    String tipoTomate;
    String tipoCarne; 
    String tipoQueso; 
    String tipoPan;

    public Hamburguesa(Builder builder) {
        this.tipoTomate = builder.tipoTomate;
        this.tipoCarne = builder.tipoCarne;
        this.tipoQueso = builder.tipoQueso;
        this.tipoPan = builder.tipoPan;
    }
    
    @Override
    public String toString() {
        return "Hamburguesa {" +
                "tipoTomate='" + tipoTomate + '\'' +
                ", tipoCarne='" + tipoCarne + '\'' +
                ", tipoQueso='" + tipoQueso + '\'' +
                ", tipoPan='" + tipoPan + '\'' +
                '}';
    }
}
