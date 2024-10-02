/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioneventos;

import java.util.ArrayList;

/**
 *
 * @author vina
 */
public class Cliente {
    private String idCliente, nombreCliente;
    private ArrayList<Reserva> reservas;

    public Cliente() {
    this.reservas = new ArrayList<>();
    }
    
    public Cliente(String idCliente, String nombreCliente){
        this(idCliente,nombreCliente,new ArrayList<>());
    }

    public Cliente(String idCliente, String nombreCliente, ArrayList<Reserva> reservas) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.reservas = reservas;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", reservas=" + reservas + '}';
    }
    
    
    
}
