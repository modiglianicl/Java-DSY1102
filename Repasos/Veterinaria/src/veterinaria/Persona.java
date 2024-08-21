package veterinaria;

import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class Persona {
    String nombre;
    ArrayList<Mascota> mascotas = new ArrayList<>();
    
    public Persona(String nombre , ArrayList<Mascota> mascotas){
        this.nombre = nombre;
        for(Mascota mascota:mascotas){
            this.mascotas.add(mascota);
        }
    }
    
    public void agregarMascota(Mascota mascotaNueva){
        this.mascotas.add(mascotaNueva);
        System.out.println("Mascota agregada a las mascotas de " + this.nombre);
    }
    
    @Override
    
    public String toString(){
        System.out.println(this.nombre + " tiene las siguientes mascotas : ");
        for (Mascota mascota:this.mascotas){
            System.out.println(mascota.getNombre()+ ", un(a) " + mascota.getEspecie()  +  " de edad " + mascota.getEdad() + " anios.");
        }
        return "Fin resumen persona.";
    }
    
}
