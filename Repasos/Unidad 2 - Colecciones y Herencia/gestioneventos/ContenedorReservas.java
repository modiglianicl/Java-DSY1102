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
public class ContenedorReservas {

    private ArrayList<Reserva> reservas;

    public ContenedorReservas() {
        this.reservas = new ArrayList<>();
    }

    public boolean agregarReserva(Reserva nuevaReserva) {
        if (!(this.reservas.contains(nuevaReserva))) {
            return this.reservas.add(nuevaReserva);
        } else {
            return false;
        }

    }

    public boolean removerReserva(Reserva reserva) {
        return this.reservas.remove(reserva);
    }
    
    public void mostrarReservas(){
        int contador = 1;
        for(Reserva reservaTemp : this.reservas){
            System.out.println(contador + ".- Reserva " + contador);
            contador++;
        }
    }

}
