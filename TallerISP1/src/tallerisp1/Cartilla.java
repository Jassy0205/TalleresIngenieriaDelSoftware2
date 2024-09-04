/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerisp1;

/**
 *
 * @author az230
 */
public class Cartilla implements LibreriaCartilla{
    private int numeroHojas;

    public Cartilla(int numeroHojas) {
        this.numeroHojas = numeroHojas;
    }

    /**
     * @return the numeroHojas
     */
    public int getNumeroHojas() {
        return numeroHojas;
    }

    /**
     * @param numeroHojas the numeroHojas to set
     */
    public void setNumeroHojas(int numeroHojas) {
        this.numeroHojas = numeroHojas;
    }

    @Override
    public void prestar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void devolver() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mantenimientoHojas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
