/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuintaPregunta;

import java.util.List;

/**
 *
 * @author az230
 */
public class Banco {
    List<Cuenta> cuentas; 

    public Banco(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    public Banco() {
    }

    public List<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(List<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }
    
   public void depositar(String numeroCuenta, double cantidad){
       if(cantidad <= 0){
           throw new IllegalArgumentException("LA CANTIDAD DEBE SER MAYOR QUE 8");
       }
       for (Cuenta cuenta : cuentas) {
           if(cuenta.getNumeroCuenta().equals(numeroCuenta)){
               double saldo = cuenta.getSaldo() + cantidad;
               cuenta.setSaldo(saldo);
               return;
           }
       }
       
       throw new IllegalArgumentException("NO EXISTE NUMERO DE CUENTA");
   }
   
   public void retirar(String numeroCuenta, double cantidad){
       if(cantidad <= 0){
           throw new IllegalArgumentException("LA CANTIDAD DEBE SER MAYOR QUE 0");
       }
       
       for (Cuenta cuenta : cuentas) {
           if(cuenta.getNumeroCuenta().equals(numeroCuenta)){
               throw new IllegalArgumentException("FONDOS INSUFICIENTES");
           }
           double saldo = cuenta.getSaldo() - cantidad;
           cuenta.setSaldo(saldo);
          return; 
       }
       
       throw new IllegalArgumentException("NO EXISTE NUMERO DE CUENTA");
   }
   
   public boolean existeCuenta(String titular){
       for (Cuenta cuenta : cuentas) {
           if(cuenta.getTitular().equals(titular)){
               return true;
           }
       }
       return false;
   }
}
