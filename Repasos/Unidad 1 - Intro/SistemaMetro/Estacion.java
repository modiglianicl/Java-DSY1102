package sistemametro;

public class Estacion {
    private String idEstacion,nombreEstacion;
    private int cantidadPlataformas;
    private Linea lineaAsociada;

    public Estacion() {
    }

    public Estacion(String idEstacion, String nombreEstacion, int cantidadPlataformas, Linea lineaAsociada) {
        this.idEstacion = idEstacion;
        this.nombreEstacion = nombreEstacion;
        this.cantidadPlataformas = cantidadPlataformas;
        this.lineaAsociada = lineaAsociada;
    }
    
    // Metodos

    public String getIdEstacion() {
        return idEstacion;
    }

    public void setIdEstacion(String idEstacion) {
        this.idEstacion = idEstacion;
    }

    public String getNombreEstacion() {
        return nombreEstacion;
    }

    public void setNombreEstacion(String nombreEstacion) {
        this.nombreEstacion = nombreEstacion;
    }

    public int getCantidadPlataformas() {
        return cantidadPlataformas;
    }

    public void setCantidadPlataformas(int cantidadPlataformas) {
        this.cantidadPlataformas = cantidadPlataformas;
    }

    public Linea getLineasAsociadas() {
        return lineaAsociada;
    }

    public void setLineasAsociadas(Linea lineaAsociada) {
        this.lineaAsociada = lineaAsociada;
    }
    
    public void imprimirEstado(){
        System.out.println("ID Estacion : " + this.getIdEstacion());
        System.out.println("Nombre Estacion : " + this.getNombreEstacion());
        System.out.println("Cantidad Plataformas : " + this.getCantidadPlataformas());
        System.out.println("Linea Asociada : " + this.getLineasAsociadas().getNombre());
    }

    
    // toString

    @Override
    public String toString() {
        return "Estacion{" + "idEstacion=" + idEstacion + ", nombreEstacion=" + nombreEstacion + ", cantidadPlataformas=" + cantidadPlataformas + ", lineaAsociada=" + lineaAsociada + '}';
    }
    
    
}
