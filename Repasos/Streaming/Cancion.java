/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streaming;


public class Cancion {

    // Atributos
    private String titulo;
    private String artista;
    private int duracion;
    private int segundoActual = 0;
    private boolean esFavorita;
    private boolean descargada;

    // Constructores
    public Cancion() {
        this("Unnamed", "Unknown", 0, false, false);
    }

    public Cancion(String titulo, String artista, int duracion, boolean esFavorita, boolean descargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.esFavorita = esFavorita;
        this.descargada = descargada;
        this.segundoActual = 0;
    }

    // Metodos
    // Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean isEsFavorita() {
        return esFavorita;
    }

    public void setEsFavorita(boolean esFavorita) {
        this.esFavorita = esFavorita;
    }

    public boolean isDescargada() {
        return descargada;
    }

    public void setDescargada(boolean descargada) {
        this.descargada = descargada;
    }

    public int getSegundoActual() {
        return segundoActual;
    }

    public void setSegundoActual(int segundoActual) {
        this.segundoActual = segundoActual;
    }

    // Customers
    public void adelantar(int segundos) {
        
        if (this.segundoActual + segundos >= this.duracion) {
            System.out.println("Termino la canción");
            this.segundoActual = this.duracion;
        } else {
            this.segundoActual += segundos;
            String ceroMinuto = "";
            String ceroSegundo = "";
            int minutoActual = this.segundoActual / 60;
            int segundoActualAdelanto = this.segundoActual % 60;
            if(minutoActual < 10){
                ceroMinuto = "0";
            }
            if(segundoActualAdelanto < 10){
                ceroSegundo = "0";
            }
            System.out.println("Cancion adelantada en " + segundos + " segundos.");
            System.out.println("La cancion quedo en el minuto : " + ceroMinuto + minutoActual + ":" + ceroSegundo + segundoActualAdelanto);
        }

    }

    public void reporteCancion() {
        String ceroSegundos= "";
        String ceroMinutos = "";
        System.out.println("Titulo : " + this.titulo);
        System.out.println("Artista : " + this.artista);
        int minutosCancion = this.duracion / 60;
        int segundosCancion = this.duracion % 60;
        if(minutosCancion < 10) {
            ceroMinutos = "0";
        }
        if(segundosCancion < 10){
            ceroSegundos = "0";
        }
        System.out.println("Duracion : " + ceroMinutos + minutosCancion + ":" + ceroSegundos +segundosCancion + " minuto(s)");
    }

    public String largoCancion() {
        if (this.duracion >= 300) {
            return "larga";
        } else {
            return "normal";
        }
    }

    // toString
    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + ", duracion=" + duracion + ", segundoActual=" + segundoActual + ", esFavorita=" + esFavorita + ", descargada=" + descargada + '}';
    }

}
