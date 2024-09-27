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
public class Hotel {

    // Atributos
    private String idHotel;
    private String nombreHotel;
    private ArrayList<Habitacion> habitacionesDisponibles;

    // Constructores
    public Hotel() {
        this.habitacionesDisponibles = new ArrayList<>();
    }
    
    public Hotel(String idHotel,String nombreHotel){
        this(idHotel,nombreHotel,new ArrayList<>());
    }
    
    public Hotel(String idHotel, String nombreHotel, ArrayList<Habitacion> habitacionesDisponibles) {
        this.idHotel = idHotel;
        this.nombreHotel = nombreHotel;
        this.habitacionesDisponibles = habitacionesDisponibles;
    }

    // Metodos
    public String getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public ArrayList<Habitacion> getHabitacionesDisponibles() {
        return habitacionesDisponibles;
    }

    public void setHabitacionesDisponibles(ArrayList<Habitacion> habitacionesDisponibles) {
        this.habitacionesDisponibles = habitacionesDisponibles;
    }

    public void agregarHabitacionDisponible(Habitacion habitacionNueva) {
        if (!(habitacionNueva.getNumeroHabitacion().isEmpty())) {
            habitacionesDisponibles.add(habitacionNueva);
            System.out.println("Habitacion agregada!");
        } else {
            System.out.println("Habitacion no agregada, carece de informacion!");
        }
    }

    public void removerHabitacion(String numeroHabitacion) {
        boolean encontrado = false;
        for (Habitacion tempHabitacion : this.getHabitacionesDisponibles()) {
            if (tempHabitacion.getNumeroHabitacion().equals(numeroHabitacion)) {
                this.getHabitacionesDisponibles().remove(tempHabitacion);
                encontrado = true;
                System.out.println("Habitacion removida");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Habitacion no encontrada!");
        }
    }

    public Habitacion buscarHabitacion(String numeroHabitacion) {
        boolean encontrado = false;
        Habitacion habitacionEncontrada = new Habitacion();
        for (Habitacion tempHabitacion : this.getHabitacionesDisponibles()) {
            if (tempHabitacion.getNumeroHabitacion().equals(numeroHabitacion)) {
                encontrado = true;
                habitacionEncontrada = tempHabitacion;
            }
        }
        
        if (!encontrado) {
            System.out.println("Habitacion no encontrada!");
            return null;
        } else {
            return habitacionEncontrada;
        }

    }

    // toString
    @Override
    public String toString() {
        return "Hotel{" + "idHotel=" + idHotel + ", nombreHotel=" + nombreHotel + ", habitacionesDisponibles=" + habitacionesDisponibles + '}';
    }

}
