/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerdip3;

/**
 *
 * @author az230
 */
public class Gmail extends Email{
    String image; 

    public Gmail(String image, String subject, String to, String body) {
        super(subject, to, body);
        this.image = image;
    }

    public String getImage() {
        return image;
    }  
}
