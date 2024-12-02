/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto4;

/**
 *
 * @author az230
 */
public class Configuracion {
    private static Configuracion instancia; 
    
    String url; 
    String usuario; 
    String password;

    public Configuracion() {
        this.url = "https://hola.com"; 
        this.usuario = "Jassy123"; 
        this.password = "123";
    }
    
    public static Configuracion getInstancia(){
        if (instancia == null){
            instancia = new Configuracion();
        }
        return instancia;
    }

    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }
}
