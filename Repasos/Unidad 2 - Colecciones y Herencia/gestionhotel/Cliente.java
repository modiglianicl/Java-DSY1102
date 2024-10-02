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
public class Cliente {

    // Atributos
    private String idCliente;
    private String nombreCliente;
    ArrayList<Reserva> reservasRealizadas;

    // Constructores
    public Cliente() {
        this.reservasRealizadas = new ArrayList<>();
    }

    public Cliente(String idCliente, String nombreCliente) {
        this(idCliente, nombreCliente, new ArrayList<>());
    }

    public Cliente(String idCliente, String nombreCliente, ArrayList<Reserva> reservasRealizadas) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.reservasRealizadas = reservasRealizadas;
    }

    // Metodos
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

    public ArrayList<Reserva> getReservasRealizadas() {
        return reservasRealizadas;
    }

    public void setReservasRealizadas(ArrayList<Reserva> reservasRealizadas) {
        this.reservasRealizadas = reservasRealizadas;
    }

    public void agregarReserva(Reserva nuevaReserva) {
        if (!(this.getReservasRealizadas().contains(nuevaReserva))) {
            this.getReservasRealizadas().add(nuevaReserva);
        } else {
            System.out.println("Reserva ya se encuentra en la lista!");
        }
    }

    // toString
    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", reservasRealizadas=" + reservasRealizadas + '}';
    }

}
