/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TerceraPregunta;

/**
 *
 * @author az230
 */
public class Tienda {

    public Tienda() {
    }
    
    public void compraFacturaElectronica(Cliente cliente, String codigo, double total, String numeroElectronico){
        FacturaElectronica factura = new FacturaElectronica(codigo, total, numeroElectronico, cliente);
        System.out.println("Se reliza la compra y se obtiene la factura fisica" + factura.getCodigo());
    }
    
    public void compraFacturafisica(String codigo, double total, Cliente cliente){
        FacturaFisica factura = new FacturaFisica(codigo, total, cliente);
        System.out.println("Se reliza la compra y se obtiene la factura fisica" + factura.getCodigo());
    }
}
