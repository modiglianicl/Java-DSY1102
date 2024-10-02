/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioneventos;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author vina
 */
public class Evento {

    private String idEvento, Nombre;
    private LocalDate fecha;
    private ArrayList<Reserva> reservas;

    public Evento() {
        this.reservas = new ArrayList<>();
    }

    public Evento(String idEvento, String Nombre, LocalDate fecha) {
        this.idEvento = idEvento;
        this.Nombre = Nombre;
        this.fecha = fecha;
        this.reservas = new ArrayList<>();
    }

    public String getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public boolean agregarReserva(Reserva nuevaReserva) {
        if (!(this.reservas.contains(nuevaReserva))) {
            // nuevaReserva.setEvento(this); // Hago la referencia al evento
            return this.reservas.add(nuevaReserva);
        } else {
            return false;
        }
    }

    @Override // OJO NO LLAMAR A RESERVA de forma entera AQUI ya que hara recursion infinita!!!
    public String toString() {
        return "Evento{" + "idEvento=" + idEvento + ", Nombre=" + Nombre + ", fecha=" + fecha + '}';
    }

}
