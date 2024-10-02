/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionhotel;

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

    public boolean agregarCliente(Cliente clienteNuevo) {
        if (!(this.clientes.contains(clienteNuevo))) {
            this.clientes.add(clienteNuevo);
            return true;
        }

        return false;
    }

    public void mostrarInformacionClientesUi() {
        if (this.clientes.size() < 1) {
            System.out.println("No hay clientes");
        } else {
            int contador = 1;
            for (Cliente tempCliente : this.clientes) {
                System.out.println("------INFO CLIENTE #" + contador +"-------");
                System.out.println("Nombre Cliente : " + tempCliente.getNombreCliente());
                System.out.println("Reservas Cliente : " + tempCliente.getReservasRealizadas()); // Mejorar....
                contador++;
            }

        }
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

}
