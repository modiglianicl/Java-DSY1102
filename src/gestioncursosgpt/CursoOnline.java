/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioncursosgpt;

/**
 *
 * @author chuck
 */
public class CursoOnline extends Curso implements MaterialDisponible {

    private String herramientaParaReunion;

    public CursoOnline() {
    }

    public CursoOnline(String herramientaParaReunion, String nombreCurso, int duracion) {
        super(nombreCurso, duracion);
        this.herramientaParaReunion = herramientaParaReunion;
    }

    public String getHerramientaParaReunion() {
        return herramientaParaReunion;
    }

    public void setHerramientaParaReunion(String herramientaParaReunion) {
        this.herramientaParaReunion = herramientaParaReunion;
    }

    @Override
    public void mostrarInfoCurso() {
        System.out.println("----- Informacion del curso -----");
        System.out.println("Nombre del Curso : " + this.getNombreCurso());
        System.out.println("Duracion del curso : " + this.getDuracion());
        System.out.println("Herramienta reunion : " + this.getHerramientaParaReunion());
    }

    @Override
    public void accederMateiral() {
        System.out.println("El material de la clase iria aca");
    }

}
