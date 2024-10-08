/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller12_principioindireccion;

/**
 *
 * @author az230
 */
public class Taller12_principioIndireccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ServicioGmail servicioGmail = new ServicioGmail();
       Usuario usuario1 = new Usuario("Jassy", "1", "jassy@gmail.edu.co");
       Gmail gmail = (Gmail) servicioGmail.crear(usuario1);
               
       ServicioOutlook servicioOutlook = new ServicioOutlook();
       Usuario usuario2 = new Usuario("Massy", "2", "massy@gmail.edu.co");
       Outlook outlook = (Outlook) servicioOutlook.crear(usuario2);
       
        System.out.println("Gmail creado:");
        System.out.println(gmail.getNombreUsuario()+ " - "+ gmail.getDireccion());
        
        System.out.println("\nOutlook creado:");
        System.out.println(outlook.getNombreUsuario()+ " - "+ gmail.getDireccion());
        
    }
    
}
