package agencia;

public class Proveedor {
    // Atributos
    public String id,nombre,pais,ciudad;
    public boolean proveedorActivo;
    
    
    // Constructor
    public Proveedor(String id, String nombre, String pais, String ciudad ,boolean proveedorActivo) {
        this.id = id;
        this.nombre = nombre;
        this.proveedorActivo = proveedorActivo;
        this.pais = pais;
        this.ciudad = ciudad;
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

    public boolean isProveedorActivo() {
        return proveedorActivo;
    }

    public void setProveedorActivo(boolean proveedorActivo) {
        this.proveedorActivo = proveedorActivo;
    }
    
    // toString

    @Override
    public String toString() {
        return "Proveedor{" + "id=" + id + ", nombre=" + nombre + ", pais=" + pais + ", ciudad=" + ciudad + ", proveedorActivo=" + proveedorActivo + '}';
    }
    
    
    
}
