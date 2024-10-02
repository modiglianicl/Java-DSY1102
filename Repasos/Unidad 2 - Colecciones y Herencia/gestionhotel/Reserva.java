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
public class Reserva {
    // Atributos

    private Hotel hotel;
    private ArrayList<Habitacion> habitacionesReservada;

    // Constructores
    public Reserva() {
        this.habitacionesReservada = new ArrayList<>();
    }
    
    public Reserva(Hotel hotel){
        this(hotel,new ArrayList<>());
    }

    public Reserva(Hotel hotel, ArrayList<Habitacion> habitacionesReservada) {
        this.hotel = hotel;
        this.habitacionesReservada = habitacionesReservada;
    }

    // Metodos
    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public ArrayList<Habitacion> getHabitacionesReservada() {
        return habitacionesReservada;
    }

    public void setHabitacionesReservada(ArrayList<Habitacion> habitacionesReservada) {
        this.habitacionesReservada = habitacionesReservada;
    }

    public void agregarHabitacionReservada(Habitacion habitacionNueva) {
        if (!this.getHabitacionesReservada().contains(habitacionNueva)) {
            this.getHabitacionesReservada().add(habitacionNueva);
        } else {
            System.out.println("Habitacion ya se encuentra en la lista!");
        }

    }

    public void removerHabitacionReservada(String numeroHabitacion) {
        boolean encontrado = false;
        Habitacion habitacionRemover = new Habitacion();
        for (Habitacion tempHabitacion : this.getHabitacionesReservada()) {
            if (tempHabitacion.getNumeroHabitacion().equals(numeroHabitacion)) {
                habitacionRemover = tempHabitacion;
            }
        }

        if (!encontrado) {
            System.out.println("Habitacion no encontrada!");
        } else {
            System.out.println("Habitacion " + numeroHabitacion + " removida!");
            this.getHabitacionesReservada().remove(habitacionRemover);
        }
    }

    public Habitacion buscarHabitacionResevada(String numeroHabitacion) {
        boolean encontrado = false;
        Habitacion habitacionEncontrada = new Habitacion();
        for (Habitacion tempHabitacion : this.getHabitacionesReservada()) {
            if (tempHabitacion.getNumeroHabitacion().equals(numeroHabitacion)) {
                habitacionEncontrada = tempHabitacion;
            }
        }

        if (!encontrado) {
            System.out.println("Habitacion no encontrada!");
            return null;
        } else {
            System.out.println("Habitacion " + numeroHabitacion + " encontrada!");
            return habitacionEncontrada;
        }
    }

    // toString
    @Override
    public String toString() {
        return "Reserva{" + "hotel=" + hotel + ", habitacionesReservada=" + habitacionesReservada + '}';
    }

}
