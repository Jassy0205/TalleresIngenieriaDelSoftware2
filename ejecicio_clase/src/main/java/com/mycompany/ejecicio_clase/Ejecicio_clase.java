/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejecicio_clase;

/**
 *
 * @author az230
 */
public class Ejecicio_clase {

    public static void main(String[] args) {
        User user1 = new User("123", "Jassy", 19, "123"); //Se crea un usuario
        System.out.println("User: "+user1.getId()+" -> "+user1.getName());
        
        //Se realiza el envío de un email
        SendEmail email1 = new SendEmail("jassym.peream@autonoma.edu.co", "Hola! Mucho gusto. Saludos"); 
        System.out.println("Email enviado a: "+email1.getEmail()+" -> "+email1.getMessage());
        
        Salary salary1 = new Salary(1684955, 25); //Creación de un salario
        System.out.println("Salario: "+salary1.Calculate_salary()); //Calculo de un salario
        
        //Validaciones de contraseña
        PasswordManagement password1 = new PasswordManagement("154869");
        System.out.println(password1.validatePassword());
        
        PasswordManagement password2 = new PasswordManagement("12345678");
        System.out.println(password2.validatePassword());
        
    }
}
