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
public class ContenedorEventos {

    private ArrayList<Evento> eventos;

    public ContenedorEventos() {
        this.eventos = new ArrayList<>();
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public boolean agregarEvento(Evento eventoNuevo) {
        if (!(this.existeEvento(eventoNuevo))) {
            return this.eventos.add(eventoNuevo);
        } else {
            return false;
        }

    }

    public boolean removerEvento(String idEvento) {
        boolean borrado = false;
        for (Evento tempEvento : this.eventos) {
            if (tempEvento.getIdEvento().equals(idEvento)) {
                this.eventos.remove(tempEvento);
                borrado = true;
                break;
            }
        }
        return borrado;
    }

    public void mostrarEventos() {
        if (this.eventos.isEmpty()) {
            System.out.println("No hay eventos!");
        } else {
            System.out.println("=== INFORMACION EVENTOS ===");
            for (Evento tempEvento : this.eventos) {
                System.out.println("---------");
                System.out.println("Nombre : " + tempEvento.getNombre());
                System.out.println("ID Evento : " + tempEvento.getIdEvento());
                System.out.println("Fecha Evento : " + tempEvento.getFecha());
                System.out.println("Reservas relacionadas : " + tempEvento.getReservas());
            }
            System.out.println("---------");
        }

    }

    public int mostrarEventosNumerados() {
        int indice = 0;
        if (this.eventos.isEmpty()) {
            System.out.println("No hay eventos!");
        } else {
            indice = 1;
            for (Evento tempEvento : this.eventos) {
                System.out.println(indice + ".- " + tempEvento.getNombre());
                indice++;
            }
        }
        return indice-1;
    }
    
    public boolean existeEvento(Evento evento){ // Compara IDS!
        boolean existe = false;
        for(Evento tempEvento:this.eventos){
            if(tempEvento.getIdEvento().equals(evento.getIdEvento())){
                existe = true;
            } 
        }
        return existe;
    }

}
