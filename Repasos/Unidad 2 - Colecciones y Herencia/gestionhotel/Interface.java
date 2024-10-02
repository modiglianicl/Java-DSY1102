/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionhotel;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author chuck
 */
public class Interface {

    // Atributos
    private Scanner scanner;
    private ContenedorHoteles hoteles;
    private ContenedorHabitaciones habitaciones;
    private ContenedorReservas reservas;
    private ContenedorClientes clientes;

    // Constructor
    public Interface(Scanner scanner, ContenedorHoteles hoteles, ContenedorHabitaciones habitaciones, ContenedorReservas reservas, ContenedorClientes clientes) {
        this.scanner = scanner;
        this.hoteles = hoteles;
        this.habitaciones = habitaciones;
        this.reservas = reservas;
        this.clientes = clientes;
    }

    // Metodos
    public void start() {
        int opcionUsuario;

        do {
            System.out.println("======= MENU =======");
            System.out.println("1.- Agregar Hotel");
            System.out.println("2.- Ver Hoteles");
            System.out.println("3.- Agregar Habitaciones");
            System.out.println("4.- Ver Habitaciones");
            System.out.println("5.- Agregar habitacion a un hotel");
            System.out.println("6.- Agregar una reserva");
            System.out.println("7.- Ver reservas");
            System.out.println("8.- Crear un cliente");
            System.out.println("9.- Ver resumen clientes");
            System.out.println("10.- Terminar Programa");
            opcionUsuario = Integer.parseInt(scanner.nextLine());

            switch (opcionUsuario) {
                case 1 -> {
                    this.opcionUno();
                }
                case 2 -> {
                    this.opcionDos();
                }
                case 3 -> {
                    this.opcionTres();
                }

                case 4 -> {
                    this.opcionCuatro();
                }

                case 5 -> {
                    this.opcionCinco();
                }

                case 6 -> {
                    this.opcionSeis();
                }

                case 7 -> {
                    this.opcionSiete();
                }

                case 8 -> {
                    this.opcionOcho();
                }

                case 9 ->  {
                    this.opcionNueve();
                }
            }

        } while (opcionUsuario != 10);
        System.out.println("Terminando programa....");

    }

    public void opcionUno() { // Permite agregar un hotel
        String idHotel;
        String nombreHotel;
        while (true) {
            // Preguntando ID
            while (true) {
                System.out.println("Ingrese el ID del hotel");
                idHotel = scanner.nextLine();
                if (idHotel.isEmpty()) {
                    System.out.println("El ID no debe estar vacio!");
                } else {
                    break;
                }
            }

            // Preguntando Nombre
            while (true) {
                System.out.println("Ingrese el nombre del hotel");
                nombreHotel = scanner.nextLine();
                if (nombreHotel.isEmpty()) {
                    System.out.println("El nombre del hotel debe tener al menos una letra");
                } else {
                    break;
                }
            }

            // Creando y agregando hotel
            Hotel hotelCreado = new Hotel(idHotel, nombreHotel);
            if (this.hoteles.agregarHotel(hotelCreado)) {
                this.hoteles.agregarHotel(hotelCreado);
                System.out.println("Hotel agregado!");
                break;
            } else {
                System.out.println("No se pudo crear el hotel, ya existe");
            }
        }
    }

    public void opcionDos() { // Mostrar hoteles agregados
        System.out.println("=======  HOTELES AGREGADOS =======");
        this.hoteles.mostrarHoteles();
    }

    public void opcionTres() { // Agregar habitaciones a la BD...
        String numeroHabitacion;
        double precioNoche;
        boolean disponibilidadHabitacion;
        String disponibilidadHabitacionInterface;

        while (true) { // Ingresando numero habitacion
            System.out.println("Ingrese numero Habitacion");
            numeroHabitacion = scanner.nextLine();

            if (numeroHabitacion.isEmpty()) {
                System.out.println("Debe tener al menos un caracter!");
            } else {
                break;
            }

        }

        while (true) { // Ingresando el precio por noche
            System.out.println("Ingrese el precio por noche");
            precioNoche = Double.parseDouble(scanner.nextLine());

            if (precioNoche < 0) {
                System.out.println("El precio debe ser mayor a 0");
            } else {
                break;
            }
        }

        while (true) { // Ingresando disponibilidad habitacion
            System.out.println("Ingrese si esta disponible o no (s/n)");
            disponibilidadHabitacionInterface = scanner.nextLine();

            if (disponibilidadHabitacionInterface.equals("s")) {
                System.out.println("Aprete la S");
                disponibilidadHabitacion = true;
                System.out.println("Disponibilidad : " + disponibilidadHabitacion);

                break;
            } else if (disponibilidadHabitacionInterface.equals("n")) {
                System.out.println("Aprete la N");
                disponibilidadHabitacion = false;
                System.out.println("Disponibilidad : " + disponibilidadHabitacion);

                break;
            } else {
                System.out.println("Debe ingresar s o n !");
            }

        }

        // Agregando a la lista
        Habitacion habitacionNueva = new Habitacion(numeroHabitacion, precioNoche, disponibilidadHabitacion);
        if (this.habitaciones.agregarHabitacion(habitacionNueva)) {
            this.habitaciones.agregarHabitacion(habitacionNueva);
            System.out.println("Habitacion agregada!");
        } else {
            System.out.println("Habitacion no agregada, ya existe");
        }

    }

    public void opcionCuatro() { // Mosramos la infon de las habitaciones agregadas
        System.out.println("=======  HABITACIONES AGREGADAS =======");
        this.habitaciones.mostrarHabitaciones();
    }

    public void opcionCinco() { // Nos permite agregar habitaciones a un hotel
        int opcionHotel;
        int opcionHabitacion;
        Hotel hotelAgregarHabitacion;
        Habitacion habitacionAgregar;
        if (this.habitaciones.getHabitaciones().isEmpty() || this.hoteles.getHoteles().isEmpty()) {
            System.out.println("Para usar esta opcion debe al menos haber 1 habitacion y 1 hotel!");
        } else {

            do {
                System.out.println("Seleccione hotel al que desea agregar una habitacion");
                this.hoteles.mostrarHoteles();
                System.out.println(this.hoteles.getHoteles().size() + 1 + ".- Volver al menu");
                opcionHotel = Integer.parseInt(scanner.nextLine());
                // Obteniendo hotel dependiendo opcion
                if (opcionHotel < 0) {
                    System.out.println("Debe de elegir una opcion correcta");
                    break;
                } else if (opcionHotel == this.hoteles.getHoteles().size() + 1) {
                    System.out.println("Volviendo al menu");
                    break;
                } else {
                    hotelAgregarHabitacion = this.hoteles.getHoteles().get(opcionHotel - 1);
                    System.out.println("Mostrando hotel seleccionado : ");
                    System.out.println(hotelAgregarHabitacion);
                }

                // Seleccionando habitacion a agregar
                while (true) {
                    System.out.println("Seleccione que habitacion desea agregar");
                    this.habitaciones.mostrarHabitacionesUi();
                    System.out.println(this.habitaciones.getHabitaciones().size() + 1 + ".- Volver al menu");
                    opcionHabitacion = Integer.parseInt(scanner.nextLine());
                    if (opcionHabitacion < 0) {
                        System.out.println("Debe elegir una opcion correcta");
                    } else if (opcionHabitacion == this.habitaciones.getHabitaciones().size() + 1) {
                        break;
                    } else {
                        habitacionAgregar = this.habitaciones.getHabitaciones().get(opcionHabitacion - 1);
                        hotelAgregarHabitacion.agregarHabitacionDisponible(habitacionAgregar);
                        System.out.println("Habitacion agregada!");
                        break;
                    }
                }
                break;

            } while (opcionHotel != this.hoteles.getHoteles().size() + 1);
        }

    }

    public void opcionSeis() {
        int opcionHotel;
        Hotel hotelAgregarHabitacion;
        int opcionHabitacion;
        Habitacion habitacionReserva;
        Reserva reservaAgregar;
        // Seleccionando Hotel
        do {
            System.out.println("Seleccione hotel al que desea agregar una habitacion");
            this.hoteles.mostrarHoteles();
            System.out.println(this.hoteles.getHoteles().size() + 1 + ".- Volver al menu");
            opcionHotel = Integer.parseInt(scanner.nextLine());
            // Obteniendo hotel dependiendo opcion
            if (opcionHotel < 0) {
                System.out.println("Debe de elegir una opcion correcta");
                break;
            } else if (opcionHotel == this.hoteles.getHoteles().size() + 1) {
                System.out.println("Volviendo al menu");
                break;
            } else {
                hotelAgregarHabitacion = this.hoteles.getHoteles().get(opcionHotel - 1);
                System.out.println("Mostrando hotel seleccionado : ");
                System.out.println(hotelAgregarHabitacion);
            }
            // Seleccionando habitacion que tenga el hotel
            while (true) {
                if (hotelAgregarHabitacion.getHabitacionesDisponibles().isEmpty()) {
                    System.out.println("El hotel no posee habitaciones disponibles");
                    break;
                }
                System.out.println("Seleccione la habitacion de la reserva");
                this.habitaciones.mostrarHabitacionesUi();
                System.out.println(this.habitaciones.getHabitaciones().size() + 1 + ".- Salir");
                opcionHabitacion = Integer.parseInt(scanner.nextLine());

                if (opcionHabitacion < 0) {
                    System.out.println("Debe elegir una opcion correcta");
                } else if (opcionHabitacion == this.habitaciones.getHabitaciones().size() + 1) {
                    System.out.println("Regresando al menu");
                    break;
                } else {
                    habitacionReserva = this.habitaciones.getHabitaciones().get(opcionHabitacion - 1);
                    System.out.println("Info habitacion seleccionada");
                    System.out.println(habitacionReserva);
                    reservaAgregar = new Reserva(hotelAgregarHabitacion);
                    reservaAgregar.agregarHabitacionReservada(habitacionReserva);
                    // Falta metodo para agregar reservas
                    if (this.reservas.agregarReserva(reservaAgregar)) {
                        this.reservas.agregarReserva(reservaAgregar);
                        System.out.println("Reserva agregada");
                    } else {
                        System.out.println("Reserva no agregada ya existe");
                    }
                    break;
                }

            }
            break;

        } while (opcionHotel != this.hoteles.getHoteles().size() + 1);
    }

    public void opcionSiete() {
        System.out.println("=======INFORMACION RESERVAS =======");
        this.reservas.mostrarReservasUi();
    }

    public void opcionOcho() {
        String idCliente;
        String nombreCliente;
        int opcionReserva;
        String opcionCliente;
        Reserva reservaAgregar;
        ArrayList<Reserva> reservasCliente = new ArrayList<>();
        Cliente clienteNuevo;

        // Preguntamos ID
        while (true) {
            System.out.println("Asigne una ID para el cliente : ");
            idCliente = scanner.nextLine();
            if (idCliente.isEmpty()) {
                System.out.println("Debe de asignarle al menos un caracter!");
            } else {
                break;
            }
        }

        // Preguntamos nombre ciente
        while (true) {
            System.out.println("Ingrese el nombre del cliente");
            nombreCliente = scanner.nextLine();
            if (nombreCliente.isEmpty()) {
                System.out.println("El nombre debe tener al menos un caracter");
            } else {
                break;
            }
        }

        // Preguntamos que reservas agregar
        while (true) {
            System.out.println("Que reserva desea asignarle al cliente:");
            this.reservas.mostrarReservasUi();
            System.out.println(this.reservas.getReservas().size() + 1 + ".- Volver al menu principal");
            opcionReserva = Integer.parseInt(scanner.nextLine());

            if (opcionReserva < 0) {
                System.out.println("Elija una opcion correcta");
            } else if (opcionReserva == this.reservas.getReservas().size() + 1) {
                break;
            } else {
                reservaAgregar = this.reservas.getReservas().get(opcionReserva - 1);
                reservasCliente.add(reservaAgregar);
                System.out.println("Reserva agregada al cliente");
                System.out.println("Desea agregar otra reserva para el cliente? presione 's' si lo desea");
                opcionCliente = scanner.nextLine();

                if (opcionCliente.toLowerCase().equals("s")) {
                    continue;
                }

                break;
            }
        }

        // Creamos cliente
        clienteNuevo = new Cliente(idCliente, nombreCliente, reservasCliente);

        // Agregamos cliente a lista de cliente
        if (this.clientes.agregarCliente(clienteNuevo)) {
            this.clientes.agregarCliente(clienteNuevo);
        } else {
            System.out.println("El cliente ya existe!");
        }

    }

    public void opcionNueve() {
        this.clientes.mostrarInformacionClientesUi();
    }

}
