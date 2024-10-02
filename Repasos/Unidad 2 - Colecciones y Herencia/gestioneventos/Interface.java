/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioneventos;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vina
 */
public class Interface {

    private Scanner scanner;
    private ContenedorEventos eventos;
    private ContenedorReservas reservas;
    private ContenedorClientes clientes;

    public Interface(Scanner scanner, ContenedorEventos eventos, ContenedorReservas reservas,ContenedorClientes clientes) {
        this.scanner = scanner;
        this.eventos = eventos;
        this.reservas = reservas;
        this.clientes = clientes;
    }

    public void iniciar() {
        int opcionUsuario;
        do {
            System.out.println("Por favor seleccione que desea hacer");
            System.out.println("1.- Crear evento");
            System.out.println("2.- Mostrar Eventos");
            System.out.println("3.- Crear reservas");
            System.out.println("4.- Crear cliente");
            System.out.println("5.- Mostrar Reservas");
            System.out.println("6.- Crear Lugar");
            System.out.println("7.- Terminar programa");
            opcionUsuario = Integer.parseInt(this.scanner.nextLine());

            switch (opcionUsuario) {
                case 1 ->
                    opcionUno();
                case 2 ->
                    opcionDos();
                case 3 ->
                    opcionTres();
                case 4 ->
                    opcionCuatro();
                case 5 ->
                    opcionCinco();
            }
        } while (opcionUsuario != 7);
        System.out.println("Terminando programa");

    }

    public void opcionUno() {
        String idEvento, nombreEvento;
        int anio, mes, dia;
        Evento nuevoEvento;

        // Preguntando ID evento
        while (true) {
            System.out.println("Ingrese el ID del evento");
            idEvento = scanner.nextLine();
            if (idEvento.isEmpty()) {
                System.out.println("Debe de ingresar al menos un caracter!");
            } else {
                break;
            }
        }

        // Preguntando nombre Evento
        while (true) {
            System.out.println("Ingrese el nombre del evento");
            nombreEvento = scanner.nextLine();
            if (nombreEvento.isEmpty()) {
                System.out.println("Debe de ingresar al menos un caracter!");
            } else {
                break;
            }
        }

        // Preguntando anio
        while (true) {
            System.out.println("Ingrese el anio del evento");
            anio = Integer.parseInt(scanner.nextLine());
            if (anio < LocalDate.now().getYear()) {
                System.out.println("Debe de ingresar un anio no menor al actual!");
            } else {
                break;
            }
        }

        // Preguntando mes
        while (true) {
            System.out.println("Ingrese el mes del evento");
            mes = Integer.parseInt(scanner.nextLine());
            if (mes < 0 || mes > 12) {
                System.out.println("Debe de ingresar un digito de mes correcto!");
            } else {
                break;
            }
        }

        // Preguntando dia
        while (true) {
            System.out.println("Ingrese el dia del evento");
            dia = Integer.parseInt(scanner.nextLine());
            if (dia < 0 || dia > 31) {
                System.out.println("Debe de ingresar un digito de dia correcto!");
            } else {
                break;
            }
        }

        // Creando un evento (sin reservas)
        nuevoEvento = new Evento(idEvento, nombreEvento, LocalDate.of(anio, mes, dia));
        if(this.eventos.agregarEvento(nuevoEvento)){
            System.out.println("Evento agregado!");
        } else {
            System.out.println("No se pudo agregar el evento! favor contactar administracion");
        }

    }

    public void opcionDos() {
        this.eventos.mostrarEventos();
    }

    public void opcionTres() {
        int opcionUsuario;
        Evento eventoSeleccionado;
        String asientoReservado;
        Reserva reservaCreada;
        // Seleccion de evento que tendra la reserva
        while (true) {
            System.out.println("Seleccione que evento tendra la reserva");
            this.eventos.mostrarEventosNumerados();
            opcionUsuario = Integer.parseInt(scanner.nextLine());

            if (opcionUsuario > this.eventos.getEventos().size() || opcionUsuario <= 0) {
                System.out.println("Debe de elegir una opcion correcta");
            } else {
                eventoSeleccionado = this.eventos.getEventos().get(opcionUsuario - 1);
                break;
            }

        }
        // Preguntamos por nombre de asiento
        while(true){
            System.out.println("Ingrese el asiento a reserva");
            asientoReservado = scanner.nextLine();
            
            if(asientoReservado.isEmpty()){
                System.out.println("Debe de ingresar al menos un caracter!");
            } else {
                break;
            }
        }
        
        // Creamos la reserva y agregamos la reserva al evento relacionado
        System.out.println("Reseva creada!");
        reservaCreada = new Reserva(eventoSeleccionado, asientoReservado);
        
        if(this.reservas.agregarReserva(reservaCreada)){
            System.out.println("Reserva creada! aqui esta la info : ");
            eventoSeleccionado.agregarReserva(reservaCreada); // Agregando reserva a ese evento
            System.out.println(reservaCreada);
        } else {
            System.out.println("No se pudo crear la reserva!");
        }

    }

    public void opcionCuatro() {
        String idCliente,nombreCliente;
        Cliente nuevoCliente;
        
        // Preguntamos ID
        while(true){
            System.out.println("Ingrese la ID del cliente");
            idCliente = scanner.nextLine();
            
            if(idCliente.isEmpty()){
                System.out.println("Debe de ingresar al menos un caracter");
            } else {
                break;
            }
        }
        
        // Preguntamos Nombre
        while(true){
            System.out.println("Ingrese el nombre del cliente");
            nombreCliente = scanner.nextLine();
            
            if(nombreCliente.isEmpty()){
                System.out.println("Debe de ingresar al menos un caracter");
            } else{
                break;
            }
        }
        
        // Creamos un cliente (sin reservas)
        nuevoCliente = new Cliente(idCliente, nombreCliente);
        this.clientes.agregarCliente(nuevoCliente);
        System.out.println("Informacion cliente creado : ");
        System.out.println(nuevoCliente);
        
    }
    
    public void opcionCinco(){
        System.out.println("=== RESERVAS EXISTENTES ===");
        this.reservas.mostrarReservas();
        System.out.println("===========================");
    }
}
