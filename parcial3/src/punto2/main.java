/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto2;

/**
 *
 * @author az230
 */
public class main {
    public static void main(String[] args) {
        Hamburguesa hamburguesa1 = new Builder()
                                    .setTipoTomate("chonto")
                                    .setTipoCarne("res")
                                    .setTipoQueso("holandez")
                                    .setTipoPan("brioche")
                                    .build();
        
        System.out.println(hamburguesa1);
    }
}
