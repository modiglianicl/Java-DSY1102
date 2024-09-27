/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionhotel;

import java.util.Scanner;

/**
 *
 * @author chuck
 */
public class GestionHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objetos necesarios para el menu
        Scanner scanner = new Scanner(System.in);
        ContenedorHoteles hoteles = new ContenedorHoteles();
        ContenedorHabitaciones habitaciones = new ContenedorHabitaciones();
        ContenedorReservas reservas = new ContenedorReservas();
        // Instanciamos la ui
        Interface ui = new Interface(scanner,hoteles,habitaciones,reservas);
        // Llamamos al menu
        ui.start();
    }

}
