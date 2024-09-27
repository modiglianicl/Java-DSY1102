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
public class ContenedorHoteles {

    private ArrayList<Hotel> hoteles;

    public ContenedorHoteles() {
        this.hoteles = new ArrayList<>();
    }

    public boolean agregarHotel(Hotel hotelNuevo) {
        for (Hotel tempHotel : hoteles) {
            if (tempHotel.getIdHotel().equals(hotelNuevo.getIdHotel())) {
                return false;
            }
        }

        this.hoteles.add(hotelNuevo);
        return true;

    }

    public void mostrarHoteles() {
        int contador = 0;
        for (Hotel hotel : this.hoteles) {
            System.out.println(contador + 1 + ".- " + hotel.getNombreHotel());
            contador++;
        }
    }

    public ArrayList<Hotel> getHoteles() {
        return hoteles;
    }

    public void setHoteles(ArrayList<Hotel> hoteles) {
        this.hoteles = hoteles;
    }

    
    
}
