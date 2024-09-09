/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerdip3;
/**
 *
 * @author az230
 */
public class TallerDIP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       IServicioEmail servicioemail = new EmailOutlookImpl("Hola", "adios", "Ja");  
       Sistema sistema = new Sistema(servicioemail);
       sistema.enviarEmail();
    }
    
}
