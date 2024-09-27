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
public class ContenedorReservas {

    private ArrayList<Reserva> reservas;

    public ContenedorReservas() {
        this.reservas = new ArrayList<>();
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public boolean agregarReserva(Reserva nuevaReserva) {
        boolean mismoHotel = false;
        boolean contieneHabitacion = false;
        for (Reserva tempReserva : this.reservas) {
            if (tempReserva.getHotel().getNombreHotel().equals(nuevaReserva.getHotel().getNombreHotel())) {
                mismoHotel = true;
            }
            for (Habitacion tempHabitacion : tempReserva.getHabitacionesReservada()) {
                if (nuevaReserva.getHabitacionesReservada().contains(tempHabitacion)) {
                    contieneHabitacion = true;
                }
            }
        }
        
        if(!(mismoHotel && contieneHabitacion)){
            this.reservas.add(nuevaReserva);
            return true;
        } else{
            return false;
        }
    }

    public void mostrarReservasUi() { // Bien flojo...
        int contador = 0;
        for (Reserva reserva : this.reservas) {
            System.out.println("Reserva " + contador);
            System.out.println(reserva);
        }
    }

}
