/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioncursosgpt;

import java.util.ArrayList;

/**
 *
 * @author chuck
 */
public abstract class Curso {
    protected String nombreCurso;
    protected int duracion;
    protected ArrayList<Estudiante> estudiantes;

    public Curso() {
        this.estudiantes = new ArrayList<>();
    }

    public Curso(String nombreCurso, int duracion) {
        this.nombreCurso = nombreCurso;
        this.duracion = duracion;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    public boolean registrarEstudiante(Estudiante nuevoEstudiante){
        for (Estudiante tmpEstudiante : this.getEstudiantes()){
            if(tmpEstudiante.getNombreEstudiante().equals(nuevoEstudiante.getNombreEstudiante())){
                return false;
            }
        }
        this.getEstudiantes().add(nuevoEstudiante);
        return true;
    }
    
    
    
    public abstract void mostrarInfoCurso();
}
