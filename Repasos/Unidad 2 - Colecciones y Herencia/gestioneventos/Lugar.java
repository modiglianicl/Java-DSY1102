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
public class Lugar {
    private String idLugar;
    private String nombre;
    private ArrayList<Evento> eventosDisponibles;

    public Lugar() {
    }

    public Lugar(String idLugar, String nombre, ArrayList<Evento> eventosDisponibles) {
        this.idLugar = idLugar;
        this.nombre = nombre;
        this.eventosDisponibles = eventosDisponibles;
    }

    public String getIdLugar() {
        return idLugar;
    }

    public void setIdLugar(String idLugar) {
        this.idLugar = idLugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Evento> getEventosDisponibles() {
        return eventosDisponibles;
    }

    public void setEventosDisponibles(ArrayList<Evento> eventosDisponibles) {
        this.eventosDisponibles = eventosDisponibles;
    }

    @Override
    public String toString() {
        return "Lugar{" + "idLugar=" + idLugar + ", nombre=" + nombre + ", eventosDisponibles=" + eventosDisponibles + '}';
    }
    
    
    

}
