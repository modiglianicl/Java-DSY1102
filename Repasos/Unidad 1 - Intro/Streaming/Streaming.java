package streaming;

import java.util.ArrayList;
import java.util.Scanner;

public class Streaming {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcionUsuario;
        ArrayList<Playlist> playlists = new ArrayList<>();
        ArrayList<Cancion> canciones = new ArrayList<>(); // Canciones pueden NO pertenecer a una playlist!
        String nombreCancion;
        String nombreArtista;
        int duracionCancion;

        do {
            // Menu
            System.out.println("=== MENU ===");
            System.out.println("1.- Agregar canciones");
            System.out.println("2.- Crear Playlist");
            System.out.println("3.- Ver mis playlists");
            System.out.println("4.- Agregar una cancion directo a la playlist"); // Crea una nueva cancion y la agrega a alguna playlist existente
            System.out.println("5.- Salir");
            // Seleccion usuario
            opcionUsuario = Integer.parseInt(scanner.nextLine());

            // Switch con codigos
            switch (opcionUsuario) { // Es un switch rule, pero igual puse un break porsiacaso jsjs
                case 1 -> {
                    // Nombre cancion
                    while (true) {
                        try {
                            System.out.println("Ingresa el nombre de la cancion");
                            nombreCancion = scanner.nextLine();
                            break;
                        } catch (Exception e) {
                            System.out.println("Error, algo sucedio");
                        }
                    }

                    // Nombre del artista
                    while (true) {
                        try {
                            System.out.println("Ingresa el nombre del artista");
                            nombreArtista = scanner.nextLine();
                            break;
                        } catch (Exception e) {
                            System.out.println("Error,algo sucedio");
                        }
                    }
                    
                    // Duracion de la cancion
                    while(true){
                        try{
                            System.out.println("Ingresa la duracion de la cancion en segundos");
                            duracionCancion = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (Exception e){
                            System.out.println("Error, algo ocurrio : " + e.getMessage());
                        }
                    }
                    
                    // Creacion de la cancion  y agregamos a la lista de canciones sin playlist
                    
                    Cancion cancionNueva = new Cancion(nombreCancion,nombreArtista,duracionCancion,false,false);
                    canciones.add(cancionNueva);
                    System.out.println("|| Cancion agregada! ||");
                }
                // Fin Creacion cancion
                case 2 -> {
                    // Parte caso 1
                    int idPlaylist = 1;
                    while (true) {
                        System.out.println("Ingresa el nombre de la playlist");
                        String nombrePlaylist = scanner.nextLine();

                        if (!(nombrePlaylist.isBlank())) {
                            Playlist playlistUsuario = new Playlist(String.valueOf(idPlaylist), nombrePlaylist);
                            playlists.add(playlistUsuario);
                            System.out.println("Tu playlist " + nombrePlaylist + " ha sido añadida!");
                            idPlaylist++;
                            break;
                        } else {
                            System.out.println("Debes de asignarle un nombre!");
                        }
                    }
                    break;
                }
                // Aqui termina el caso 1
                case 3 -> {
                    if(playlists.size() < 1){
                        System.out.println("No posees playlists!");
                        break;
                    }
                    // Titulo
                    String tusPlaylists = "=== TU PLAYLIST ===";
                    if (playlists.size() > 1) {
                        tusPlaylists = "=== TUS PLAYLISTS ===";
                    }
                    // Nombre de las playlists
                    System.out.println(tusPlaylists);
                    for (Playlist playlist : playlists) {
                        System.out.println("||| " + playlist.getNombre() + " |||");
                        playlist.reportePlaylist();
                    }
                    break;
                }
                case 4 -> {
                    if(playlists.size() < 1){
                        System.out.println("No posees playlists!");
                        break;
                    }
                    // Preguntamos por cancion a crear, y despues a que playlist (le mostramos la lista de playlists)
                    // 1. Nombre cancion
                    while (true) {
                        System.out.println("Ingresa el nombre de la cancion");
                        nombreCancion = scanner.nextLine();
                        if (!(nombreCancion.isBlank())) {
                            break;
                        } else {
                            System.out.println("Debe contener al menos un caracter!");
                        }
                    }
                    // Fin nombre cancion

                    // 2. Nombre artista
                    while (true) {
                        System.out.println("Ingresa el nombre del artista");
                        nombreArtista = scanner.nextLine();
                        if (!(nombreArtista.isBlank())) {
                            break;
                        } else {
                            System.out.println("El nombre no puede ser vacio.");
                        }
                    }
                    // Fin nombre artista

                    // 3. Duracion
                    while (true) {
                        try {
                            System.out.println("Ingresa en segundos cuanto dura la cancion");
                            duracionCancion = Integer.parseInt(scanner.nextLine());
                            break;
                        } catch (Exception e) {
                            System.out.println("Error, por favor intentalo denuevo " + "ERROR : " + e.getMessage());
                        }

                    }
                    // Fin duracion cancion

                    // 4. Creamos la cancion
                    Cancion cancionCreada = new Cancion(nombreCancion, nombreArtista, duracionCancion, false, false);
                    System.out.println("Cancion creada : " + cancionCreada.getTitulo());

                    // 5. Preguntamos a que playlist agregar
                    System.out.println("Selecciona que playlist deseas agregar la cancion creada");

                    int indices = 0;
                    int opcionIndice;
                    for (Playlist playlist : playlists) {
                        System.out.println(indices + ".- " + playlist.getNombre());
                        indices++;
                    }

                    // Seleccion de playlist del usuario
                    while (true) {
                        try {
                            opcionIndice = Integer.parseInt(scanner.nextLine()); // Usuario elige el numero
                            if (opcionIndice < 0 || opcionIndice > playlists.size() - 1) {
                                System.out.println("Por favor elige una opcion correcta");
                            } else {
                                break;
                            }
                        } catch (Exception e) {
                            System.out.println("Error, por favor intentalo denuevo " + "ERROR : " + e.getMessage());
                        }

                    }

                    // Agregamos la cancion creada a la playlist seleccionada
                    playlists.get(opcionIndice).agregarCancion(cancionCreada);

                    break;
                }
            }
        } while (opcionUsuario != 5);
        System.out.println("Saliste!");

    }

}
