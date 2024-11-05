/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioncursosgpt;

/**
 *
 * @author chuck
 */
public class Instructor {
    private String nombreInstructor,especialidad;

    public Instructor() {
    }

    public Instructor(String nombreInstructor, String especialidad) {
        this.nombreInstructor = nombreInstructor;
        this.especialidad = especialidad;
    }

    public String getNombreInstructor() {
        return nombreInstructor;
    }

    public void setNombreInstructor(String nombreInstructor) {
        this.nombreInstructor = nombreInstructor;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public void mostrarInfoInstructor(){
        System.out.println("Nombre Instructor : " + this.getNombreInstructor());
        System.out.println("Especialidad Instructor : " + this.getEspecialidad());
    }
}
