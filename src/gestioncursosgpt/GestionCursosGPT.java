/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestioncursosgpt;

/**
 *
 * @author chuck
 */
public class GestionCursosGPT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instanciando Objetos
        Curso mateOnline = new CursoOnline("Teams", "Matematica 1", 25);
        Curso matePresencial = new CursoPresencial("Vina", "Mate para ML", 30);
        Instructor instructor1 = new Instructor("John", "Profesor de Mate");
        Estudiante estudiante1 = new Estudiante("E001", "Estudiante 1");
        Estudiante estudiante2 = new Estudiante("E002" , "Estudiante 2");
        Estudiante estudiante3 = new Estudiante("E003" , "Estudiante 3");
        Academia academia1 = new Academia();
        
        // Agregando cursos a la academia
        academia1.agregarCurso(mateOnline);
        academia1.agregarCurso(matePresencial);
        
        
        
        // Inscribiendo alumnos a un curso
        academia1.inscribirEstudiante(mateOnline, estudiante1);
        academia1.inscribirEstudiante(matePresencial, estudiante2);
        academia1.inscribirEstudiante(matePresencial, estudiante2);// Ya existe
        academia1.inscribirEstudiante(mateOnline, estudiante3);
    }
    
}
