/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TerceraPregunta;

/**
 *
 * @author az230
 */
public class FacturaFisica {
    private String codigo; 
    private double total; 
    private Cliente cliente; 

    public FacturaFisica(String codigo, double total, Cliente cliente) {
        this.codigo = codigo;
        this.total = total;
        this.cliente = cliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    } 
}
