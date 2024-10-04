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
        this.clientes = new ArrayList<>();
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

    public boolean agregarCliente(Cliente nuevoCliente) {
        if (!(this.existeCliente(nuevoCliente))) {
            return this.clientes.add(nuevoCliente);
        } else {
            return false;
        }
    }

    public boolean existeCliente(Cliente cliente) {
        boolean existe = false;
        for (Cliente tempCliente : this.clientes) {
            if (tempCliente.getIdCliente().equals(cliente.getIdCliente())) {
                existe = true;
            }
        }
        return existe;
    }
    
    public void mostrarClientes(){
        System.out.println("=== INFO CLIENTES ===");
        int contador = 1;
        for(Cliente tempCliente:this.clientes){
            System.out.println("----- Cliente " + contador + " ------");
            System.out.println("Nombre :" + tempCliente.getNombreCliente());
            System.out.println("ID Cliente : " + tempCliente.getIdCliente());
            System.out.println("Reservas cliente : " + tempCliente.getReservas());
        }
    }

}

