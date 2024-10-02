/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioneventos;

import java.util.ArrayList;

/**
 *
 * @author chuck
 */
public class ContenedorClientes {
    private ArrayList<Cliente> clientes;

    public ContenedorClientes() {
    }

    public ContenedorClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public boolean agregarCliente(Cliente nuevoCliente){
        if(!(this.existeCliente(nuevoCliente))){
            return this.clientes.add(nuevoCliente);
        } else {
            return false;
        }
    }
    
    public boolean existeCliente(Cliente cliente){
        boolean existe = false;
        for(Cliente tempCliente : this.clientes){
            if(tempCliente.getIdCliente().equals(cliente.getIdCliente())){
                existe = true;
            }
        }
        
        return existe;
    }
}
