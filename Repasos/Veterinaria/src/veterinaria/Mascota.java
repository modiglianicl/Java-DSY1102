package veterinaria;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author felipe
 */
public class Mascota {
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    
    public Mascota(String nombre, String especie, String raza , int edad){
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getEspecie(){
        return this.especie;
    }
    
    public String getRaza(){
        return this.raza;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    @Override
    
    public String toString(){
        return this.getNombre() + ", especie : " + this.getEspecie() + ", edad : " + this.getEdad();
    }
}
