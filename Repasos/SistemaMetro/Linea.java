
package sistemametro;


public class Linea {
    private String idLinea,nombreLinea;
    private int cantidadEstaciones;
    private float frecuenciaServicio;

    public Linea() {
    }

    
    public Linea(String idLinea, String nombre, int cantidadEstaciones, float frecuenciaServicio) {
        this.idLinea = idLinea;
        this.nombreLinea = nombre;
        this.cantidadEstaciones = cantidadEstaciones;
        this.frecuenciaServicio = frecuenciaServicio;
    }
    
    // Metodos

    public String getIdLinea() {
        return idLinea;
    }

    public void setIdLinea(String idLinea) {
        this.idLinea = idLinea;
    }

    public String getNombre() {
        return nombreLinea;
    }

    public void setNombre(String nombre) {
        this.nombreLinea = nombre;
    }

    public int getCantidadEstaciones() {
        return cantidadEstaciones;
    }

    public void setCantidadEstaciones(int cantidadEstaciones) {
        this.cantidadEstaciones = cantidadEstaciones;
    }

    public float getFrecuenciaServicio() {
        return frecuenciaServicio;
    }

    public void setFrecuenciaServicio(float frecuenciaServicio) {
        this.frecuenciaServicio = frecuenciaServicio;
    }
    
    // toString

    @Override
    public String toString() {
        return "Linea{" + "idLinea=" + idLinea + ", nombre=" + nombreLinea + ", cantidadEstaciones=" + cantidadEstaciones + ", frecuenciaServicio=" + frecuenciaServicio + '}';
    }
    
    
}
