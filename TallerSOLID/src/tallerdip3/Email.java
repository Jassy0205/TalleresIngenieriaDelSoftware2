/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdip3;

/**
 *
 * @author az230
 */
public abstract class Email {
    String subject; 
    String to; 
    String body;

    public Email(String subject, String to, String body) {
        this.subject = subject;
        this.to = to;
        this.body = body;
    }

    public String getSubject() {
        return subject;
    }

    public String getTo() {
        return to;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
    
    
}
