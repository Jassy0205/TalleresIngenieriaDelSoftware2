/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdip3;

/**
 *
 * @author az230
 */
public class EmailGmailImpl extends Gmail implements IServicioEmail{

    public EmailGmailImpl(String image, String subject, String to, String body) {
        super(image, subject, to, body);
    }

    @Override
    public void enviarEmail() {
        System.out.println("Se envia correo por Gmail");
    }
    
}
