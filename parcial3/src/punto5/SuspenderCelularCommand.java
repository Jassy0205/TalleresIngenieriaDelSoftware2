/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto5;

/**
 *
 * @author az230
 */
public class SuspenderCelularCommand implements Command{
    private Celular celular;

    public SuspenderCelularCommand(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.suspender();
    }
}
