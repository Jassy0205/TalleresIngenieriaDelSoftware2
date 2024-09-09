/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdip3;

/**
 *
 * @author az230
 */
public class Yahoo extends Email{
    String file; 

    public Yahoo(String file, String subject, String to, String body) {
        super(subject, to, body);
        this.file = file;
    }

    public String getFile() {
        return file;
    }
}
