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
public class ContenedorHabitaciones {

    private ArrayList<Habitacion> habitaciones;

    public ContenedorHabitaciones() {
        this.habitaciones = new ArrayList<>();
    }

    public boolean agregarHabitacion(Habitacion habitacionNueva) {
        for (Habitacion tempHab : this.habitaciones) {
            if (tempHab.getNumeroHabitacion().equals(habitacionNueva.getNumeroHabitacion())) {
                return false;
            }
        }

        this.habitaciones.add(habitacionNueva);
        return true;
    }

    public void mostrarHabitaciones() {
        String separadorTexto = "";
        if (this.habitaciones.size() > 1) {
            separadorTexto = "---------------------";
        }

        String disponibilidadTexto;
        for (Habitacion tempHab : this.habitaciones) {
            System.out.println(separadorTexto);
            System.out.println("Numero Habitacion : " + tempHab.getNumeroHabitacion());
            System.out.println("Precio noche : $" + tempHab.getPrecioNoche());
            if (tempHab.isDisponible()) {
                disponibilidadTexto = "Disponible";
            } else {
                disponibilidadTexto = "No disponible";
            }
            System.out.println("Disponibilidad : " + disponibilidadTexto);
        }
    }

    public void mostrarHabitacionesUi() {
        int contador = 0;
        for (Habitacion habitacion : this.habitaciones) {
            System.out.println(contador + 1 + ".- Habitacion " + habitacion.getNumeroHabitacion());
            contador++;
        }
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

}
