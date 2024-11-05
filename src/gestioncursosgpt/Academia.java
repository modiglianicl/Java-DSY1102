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
public class Academia {

    private ArrayList<Curso> cursos;

    public Academia() {
        this.cursos = new ArrayList<>();
    }

    public Academia(ArrayList<Curso> cursos) {
        this.cursos = new ArrayList<>();
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public void agregarCurso(Curso curso) {
        this.getCursos().add(curso);
    }

    public void inscribirEstudiante(Curso curso, Estudiante estudiante) {
        // Buscando el curso
        for (Curso tmpCurso : this.getCursos()) {
            if (tmpCurso.getNombreCurso().equalsIgnoreCase(curso.getNombreCurso())) {
                if (tmpCurso.registrarEstudiante(estudiante)) {
                    System.out.println("Agregado el estudiante exitosamente");
                } else {
                    System.out.println("El estudiante ya existe");
                }
            }

        }
    }

    public boolean registrarAsistenciaPresencial(CursoPresencial curso, Estudiante estudiante) {
        System.out.println("Ok!");
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Academia{");
        sb.append("cursos=").append(cursos);
        sb.append('}');
        return sb.toString();
    }

}
