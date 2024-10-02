/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioneventos;

/**
 *
 * @author vina
 */
public class Reserva {

    private Evento evento;
    private String asientoReservado;

    public Reserva() {
    }

    public Reserva(Evento evento, String asientoReservado) {
        this.evento = evento;
        this.asientoReservado = asientoReservado;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getAsientoReservado() {
        return asientoReservado;
    }

    public void setAsientoReservado(String asientoReservado) {
        this.asientoReservado = asientoReservado;
    }

    @Override // OJO NO LLAMAR A EVENTO AQUI de forma entera ya que hara recursion infinita!!!
    public String toString() {
        return "Reserva{" + "eventoId=" + evento.getIdEvento() + ", asientoReservado=" + asientoReservado + '}';
    }

}
