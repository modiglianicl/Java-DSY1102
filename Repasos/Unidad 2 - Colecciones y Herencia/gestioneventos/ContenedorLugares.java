/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioneventos;

import java.util.ArrayList;

/**
 *
 * @author chuck
 */
public class ContenedorLugares {

    private ArrayList<Lugar> lugares;

    public ContenedorLugares() {
        this.lugares = new ArrayList<>();
    }

    public ArrayList<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(ArrayList<Lugar> lugares) {
        this.lugares = lugares;
    }

    public boolean existeLugar(Lugar lugar) {
        boolean existe = false;
        for (Lugar tempLugar : this.lugares) {
            if (tempLugar.getIdLugar().equals(lugar.getIdLugar())) {
                existe = true;
            }
        }
        return existe;
    }

    public boolean agregarLugar(Lugar nuevoLugar) {
        if (!(existeLugar(nuevoLugar))) {
            return this.lugares.add(nuevoLugar);
        } else {
            return false;
        }
    }

    public void mostrarLugares() {
        System.out.println("=== INFO LUGARES ===");
        for (Lugar tempLugar : this.getLugares()) {
            System.out.println("---------------------");
            System.out.println("ID Lugar : " + tempLugar.getIdLugar());
            System.out.println("Nombre Lugar : " + tempLugar.getNombre());
            System.out.println("--- Eventos del lugar ---");
            if (tempLugar.getEventosDisponibles().isEmpty()) {
                System.out.println("El lugar no posee eventos");
            } else {
                for (Evento tempEvento : tempLugar.getEventosDisponibles()) {
                    System.out.println(tempEvento.getNombre());
                }
            }

        }
        System.out.println("---------------------");
    }

}
