/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdip3;

/**
 *
 * @author az230
 */
public class EmailYahooImpl extends Yahoo implements IServicioEmail{

    public EmailYahooImpl(String file, String subject, String to, String body) {
        super(file, subject, to, body);
    }

    @Override
    public void enviarEmail() {
         //Logica para envio
        System.out.println("Se envia un correo por Yahoo");
    }
    
}
