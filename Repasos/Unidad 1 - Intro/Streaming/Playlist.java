/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streaming;

import java.util.ArrayList;

/**
 *
 * @author vina
 */
public class Playlist {
    
    //Atributos
    private String id,nombre;
    private ArrayList<Cancion> canciones;
    private int totalSegundos = 0;
    
    // Constructores
    public Playlist(String id){
        this(id,"Sin nombre",new ArrayList<>());
    }
    
    public Playlist(String id , String nombre){
        this(id,nombre,new ArrayList<>());
    }
    
    public Playlist(String id, String nombre, ArrayList<Cancion> canciones) {
        this.id = id;
        this.nombre = nombre;
        this.canciones = canciones;
    }
    
    // Metodos
    // Getters y Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }
    
    // Customers
    public void agregarCancion(Cancion cancion){
        this.canciones.add(cancion);
    }
    
    public void agregarCancion(ArrayList<Cancion> canciones){
        for (Cancion cancion:canciones){
            this.canciones.add(cancion);
        }
    }
    
    public void removerCancion(int indice){
        this.canciones.remove(indice);
    }
    
    public void reportePlaylist(){
        int contador = 0;
        String ceroMinuto = "";
        String ceroSegundo = "";
        for (Cancion cancion:this.canciones){
            System.out.println("|| Cancion #"+(contador+1) +" ||");
            this.totalSegundos += cancion.getDuracion();
            cancion.reporteCancion();
            contador++;
        }
        int minutosPlaylist = this.totalSegundos / 60;
        int segundosPlaylist = this.totalSegundos % 60;
        if(minutosPlaylist < 10){
            ceroMinuto = "0";
        }
        if(segundosPlaylist < 10) {
            ceroSegundo = "0";
        }
        switch (contador) { // Switch rule aplicado
            case 0 -> System.out.println("La playlist no tiene canciones.");
            case 1 -> System.out.println("La playlist tiene " + contador + " cancion.");
            default -> System.out.println("La playlist tiene " + contador + " canciones.");
        }
        System.out.println("=== Duracion playlist : " + ceroMinuto + minutosPlaylist + ":" + ceroSegundo +segundosPlaylist + " ===");
        
    }
    
    // toString

    @Override
    public String toString() {
        return "Playlist{" + "id=" + id + ", nombre=" + nombre + ", canciones=" + canciones + ", totalSegundos=" + totalSegundos + '}';
    }


    
    
    
}
