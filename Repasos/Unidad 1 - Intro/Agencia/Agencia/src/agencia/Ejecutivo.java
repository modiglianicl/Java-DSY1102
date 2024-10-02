
package agencia;

// El ejecutivo es quien vende!, esta clase va dentro del paquete turistico
// Me sirve para ver que ejecutivo es el que mas vende!
public class Ejecutivo {
    // Atributos
    public String id,nombre;
    public boolean empleado;
    public String descripcion;
    public int ventasRealizadas;
    
    // Constructor
    public Ejecutivo(String id, String nombre,boolean empleado) {
        this.id = id;
        this.nombre = nombre;
        this.empleado = true;
    }
    
    // Metodos

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEmpleado() {
        return empleado;
    }

    public void setEmpleado(boolean empleado) {
        this.empleado = empleado;
    }
    
    public void despedir(String descripcion){
        this.empleado = false;
        this.descripcion = descripcion;
    }
    
    public void recontratar(String descripcion){
        this.empleado = true;
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(int ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }
    
    public void aumentarVenta(){
        this.setVentasRealizadas(this.getVentasRealizadas() + 1);
    }
    
    
    // toString

    @Override
    public String toString() {
        return "Ejecutivo{" + "id=" + id + ", nombre=" + nombre + ", empleado=" + empleado + ", descripcion=" + descripcion + ", ventasRealizadas=" + ventasRealizadas + '}';
    }
    
    
    
}
