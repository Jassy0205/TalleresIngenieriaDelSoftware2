/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdip3;

/**
 *
 * @author az230
 */
public class Sistema {
    IServicioEmail servicioemail; 
    
    public Sistema(IServicioEmail email){
        this.servicioemail = email; 
    }
    
    public void enviarEmail(){
        servicioemail.enviarEmail();
    }
}
