/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemametro;

import java.util.ArrayList;

/**
 *
 * @author chuck
 */
public class Tren {
    private String idTren,estadoTren;
    private int capacidadMaxima;
    private Linea lineasAsociada;

    public Tren() {
    }

    public Tren(String idTren, String estadoTren, int capacidadMaxima, Linea lineasAsociada) {
        this.idTren = idTren;
        this.estadoTren = estadoTren;
        this.capacidadMaxima = capacidadMaxima;
        this.lineasAsociada = lineasAsociada;
    }
    
    // Metodos

    public String getIdTren() {
        return idTren;
    }

    public void setIdTren(String idTren) {
        this.idTren = idTren;
    }

    public String getEstadoTren() {
        return estadoTren;
    }

    public void setEstadoTren(String estadoTren) {
        this.estadoTren = estadoTren;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Linea getLineasAsociada() {
        return lineasAsociada;
    }

    public void setLineasAsociada(Linea lineasAsociada) {
        this.lineasAsociada = lineasAsociada;
    }
    
    // toString

    @Override
    public String toString() {
        return "Tren{" + "idTren=" + idTren + ", estadoTren=" + estadoTren + ", capacidadMaxima=" + capacidadMaxima + ", lineasAsociada=" + lineasAsociada + '}';
    }
    
    
}
