package veterinaria;

import java.util.ArrayList;

/**
 *
 * @author felipe
 */
public class Veterinaria {

    public static void main(String[] args) {
        // Creando mascotas
        Mascota terry = new Mascota("Terry","Perro","nose",2);
        Mascota bobby = new Mascota("Bobby","Perro","cocker",15);
        // Inicializando arraylist de mascotas de Felipe
        ArrayList<Mascota> mascotasFelipe = new ArrayList<>();
        // Agregamos mascotas a las mascotas de Felipe
        mascotasFelipe.add(terry); // A
        mascotasFelipe.add(bobby);
        // Creamos persona que constructor recibe nombre y un arraylist de Mascotas
        Persona felipe = new Persona("Felipe",mascotasFelipe);
        
        // Imprimimos el toString de felipe.
        System.out.println(felipe);
        // Creando mascota nueva y probando metodo que agrega mascota a Felipe
        Mascota bruce = new Mascota("Bruce","Hamster","ardilla china",2);
        felipe.agregarMascota(bruce);
        // Imprimimos a felipe denuevo
        System.out.println(felipe);
    }
    
}
