
package agencia;

public class Actividad {
    // Atributos
    public String id;
    public String nombre;
    public String descripcion;
    public FechaCustom fecha;
    public String hora;
    public int precio;
    public String lugar;
    public int plazas;
    
    // Constructores
    public Actividad(String id, String nombre){ // En caso de no tener mas info
        this(id,nombre,"Por definir",new FechaCustom(2000,1,1),"12:12",0,"Por definir",0);
    }

    public Actividad(String id, String nombre, String descripcion, FechaCustom fecha, String hora, int precio, String lugar, int plazas) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.precio = precio;
        this.lugar = lugar;
        this.plazas = plazas;
    }
    
    
    // Metodos
    
    public String getHora() {
        return hora;
    }
    
    public void setHora(String hora) {    
        this.hora = hora;
    }

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public FechaCustom getFecha() {
        return fecha;
    }

    public void setFecha(FechaCustom fecha) {
        this.fecha = fecha;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
    
    // toString

    @Override
    public String toString() {
        return "Actividad{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fecha=" + fecha + ", precio=" + precio + ", lugar=" + lugar + ", plazas=" + plazas + '}';
    }
    
    
    
    
}
