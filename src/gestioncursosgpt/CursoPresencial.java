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
public class CursoPresencial extends Curso implements Asistible {

    private String sede;
    private ArrayList<Integer> asistencias;

    public CursoPresencial() {
    }

    public CursoPresencial(String sede, String nombreCurso, int duracion) {
        super(nombreCurso, duracion);
        this.sede = sede;
        this.asistencias = new ArrayList<>();
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public ArrayList<Integer> getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(ArrayList<Integer> asistencias) {
        this.asistencias = asistencias;
    }

    @Override
    public void mostrarInfoCurso() {
        System.out.println("Nombre del Curso : " + this.getNombreCurso());
        System.out.println("Duracion del curso : " + this.getDuracion());
        System.out.println("Sede : " + this.getSede());
    }

    @Override
    public void registrarAsistencia(Estudiante estudiante) {
        int indiceEstudiante = 0;
        for (int i = 0; i < this.getEstudiantes().size(); i++) {
            if (this.getEstudiantes().get(i).getNombreEstudiante().equals(estudiante.getNombreEstudiante())) {
                indiceEstudiante = i;
                System.out.println("Encontre el indice");
            }
        }

        if (this.getAsistencias().get(indiceEstudiante) == 0) {
            this.getAsistencias().set(indiceEstudiante, 1);
        } else {
            this.getAsistencias().set(indiceEstudiante,this.getAsistencias().get(indiceEstudiante) + 1);
        }

    }

}
