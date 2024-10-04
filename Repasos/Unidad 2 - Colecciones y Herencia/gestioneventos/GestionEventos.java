/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestioneventos;

import java.util.Scanner;

/**
 *
 * @author vina
 */
public class GestionEventos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        ContenedorEventos eventos = new ContenedorEventos();
        ContenedorReservas reservas = new ContenedorReservas();
        ContenedorClientes clientes = new ContenedorClientes();
        ContenedorLugares lugares = new ContenedorLugares();
        Interface ui = new Interface(scanner,eventos,reservas,clientes,lugares);
        ui.iniciar();
    }
    
}
