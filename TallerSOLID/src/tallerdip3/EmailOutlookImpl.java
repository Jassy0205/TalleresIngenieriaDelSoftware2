/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdip3;

/**
 *
 * @author az230
 */
public class EmailOutlookImpl extends Outlook implements IServicioEmail{

    public EmailOutlookImpl(String subject, String to, String body) {
        super(subject, to, body);
    }

    @Override
    public void enviarEmail() {
       //Logica de envio 
        System.out.println("Se envia email por Outlook");
    }
    
}
