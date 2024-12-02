/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto5;

/**
 *
 * @author az230
 */
public class EncenderComputadorCommand implements Command {
    private Computador computador;

    public EncenderComputadorCommand(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void execute() {
        computador.encender();
    }
}