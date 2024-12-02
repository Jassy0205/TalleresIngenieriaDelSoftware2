/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto5;

/**
 *
 * @author az230
 */
public class main {
    public static void main(String[] args) {
        Computador computador = new Computador();
        Celular celular = new Celular();

        Command encenderComputador = new EncenderComputadorCommand(computador);
        Command apagarComputador = new ApagarComputadorCommand(computador);
        Command suspenderComputador = new SuspenderComputadorCommand(computador);
        Command reiniciarComputador = new ReiniciarComputadorCommand(computador);
        
        Command encenderCelular = new EncenderCelularCommand(celular);
        Command apagarCelular = new ApagarCelularCommand(celular);
        Command suspenderCelular = new SuspenderCelularCommand(celular);
        Command reiniciarCelular = new ReiniciarCelularCommand(celular);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(encenderComputador);
        remote.ejecutarComando();
        
        remote.setCommand(reiniciarComputador);
        remote.ejecutarComando();
        
        remote.setCommand(suspenderComputador);
        remote.ejecutarComando();

        remote.setCommand(apagarComputador);
        remote.ejecutarComando();
        

        remote.setCommand(encenderCelular);
        remote.ejecutarComando();
        
        remote.setCommand(reiniciarCelular);
        remote.ejecutarComando();
        
        remote.setCommand(suspenderCelular);
        remote.ejecutarComando();

        remote.setCommand(apagarCelular);
        remote.ejecutarComando();
    }
}
