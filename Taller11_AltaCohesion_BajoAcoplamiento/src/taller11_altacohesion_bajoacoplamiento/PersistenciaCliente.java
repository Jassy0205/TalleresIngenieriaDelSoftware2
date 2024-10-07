/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package taller11_altacohesion_bajoacoplamiento;


/**
 *
 * @author az230
 * 
 */
public interface PersistenciaCliente{
    void guardar(Cliente cliente);
    void obtenerTodos();
    void eliminar(String id);
    void buscar(String id);
}

