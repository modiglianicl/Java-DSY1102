package sistemametro;

import java.util.ArrayList;
import java.util.Scanner;


public class SistemaMetro {


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Validacion val = new Validacion();
        Estacion estacionAgregar;
        Linea linea1 = new Linea("A1", "Linea 1", 2, 10);
        ArrayList<Estacion> estaciones = new ArrayList<>();
        Tren trenTest = null;
        int opcionUsuario;

        do {
            // Menu, usaremos la linea1 para probar funcionamiento
            System.out.println("=== MENU ===");
            System.out.println("1.- Agregar tren");
            System.out.println("2.- Agregar una estacion");
            System.out.println("3.- Ver estados trenes y las estaciones");
            System.out.println("4.- Salir");
            opcionUsuario = Integer.parseInt(scanner.nextLine());

            switch (opcionUsuario) {
                case 1 -> {
                    System.out.print("Ingrese la id del Tren : ");
                    String idTren = scanner.nextLine();
                    // Nombre y  su validacion
                    System.out.print("Ingrese el nombre del Tren : ");
                    String nombreTren = scanner.nextLine();
                    while (val.validarNombre(nombreTren) == false) {
                        System.out.println("Error, el nombre no puede ser vacio!");
                        nombreTren = scanner.nextLine();
                        if (val.validarNombre(nombreTren)) {
                            break;
                        }
                    }
                    // Estado tren
                    System.out.print("Ingrese el estado del tren : ");
                    String estadoTren = scanner.nextLine();
                    if (!(estadoTren.equalsIgnoreCase("en operacion"))) {
                        System.out.println("Lo siento, no se puede agregar un tren si su estado no es 'en operacion' , por favor intente con otro tren.");
                        break;
                    }

                    // Cantidad maxima que soporta el tren y su validacion
                    System.out.println("Ingrese la cantidad maxima que soporta el tren");
                    int capacidadTren = Integer.parseInt(scanner.nextLine());
                    while (val.validarCapacidadTren(capacidadTren) == false) {
                        System.out.println("Error, debe ser mayor a 0");
                        capacidadTren = Integer.parseInt(scanner.nextLine());
                        if (val.validarCapacidadTren(capacidadTren)) {
                            break;
                        }
                    }

                    // Creamos tren
                    trenTest = new Tren(idTren, nombreTren, capacidadTren, linea1);

                }
                case 2 -> {
                    // id estacion
                    System.out.print("Ingrese una id para la estacion : ");
                    String idEstacion = scanner.nextLine();

                    // nombre estacion y validacion
                    System.out.print("Ingrese un nombre para la estacion : ");
                    String nombreEstacion = scanner.nextLine();
                    while (val.validarNombre(nombreEstacion) == false) {
                        System.out.println("El nombre no puede estar en blanco");
                        nombreEstacion = scanner.nextLine();
                        if (val.validarNombre(nombreEstacion)) {
                            break;
                        }
                    }

                    // Revisando si la estacion ya esta en la linea "Linea 1"
                    boolean duplicado = false;
                    if (!(estaciones.isEmpty())) {
                        for (Estacion estacion : estaciones) {
                            if (estacion.getLineasAsociadas().getNombre().equals("Linea 1") && estacion.getNombreEstacion().equals(nombreEstacion)) {
                                duplicado = true;
                                System.out.println("Esta estacion esta duplicada!, intente con otra, volviendo al menu..");
                                break; // Dejamos de revisar apenas encontremos un duplicado
                            }
                        }
                    }

                    if (duplicado) {
                        break;
                    } else {
                        // cantidad plataformas
                        System.out.println("Ingrese cantidad de plataformas : ");
                        int cantidadPlataformasEstacion = Integer.parseInt(scanner.nextLine());

                        // Creamos estacion y agregamos a lista de estaciones
                        estacionAgregar = new Estacion(idEstacion, nombreEstacion, cantidadPlataformasEstacion, linea1);
                        estaciones.add(estacionAgregar);
                    }

                }
                case 3 -> {
                    if (!(estaciones.isEmpty())) {
                        System.out.println("=== ESTADO ESTACIONES ===");
                        for (Estacion estacion : estaciones) {
                            estacion.imprimirEstado();
                            System.out.println("=====================");
                        }
                    } else {
                        System.out.println("No hay estaciones!");
                    }
                    
                    System.out.println("=== ESTADO TRENES ===");
                    System.out.println(trenTest);

                }
            }

        } while (opcionUsuario != 4);
    }

}
