
package inventario;


public class Categoria {
    // Atributos
    private String  idCategoria,nombre,descripcion;
    
    // Constructores
    
    public Categoria(){
        this.nombre = "Sin nombre";
    }

    public Categoria(String idCategoria, String nombre, String descripcion) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    // Metodos

    public String getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
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
    
    public void imprimirInformacion(){
        System.out.println("ID Categoria : " + this.getIdCategoria());
        System.out.println("Nombre Cateogoria : " + this.getNombre());
        System.out.println("Descripcion Categoria : " + this.getDescripcion());
    }
    
    // toString

    @Override
    public String toString() {
        return "Categoria{" + "idCategoria=" + idCategoria + ", nombre=" + nombre + ", descripcion=" + descripcion + '}';
    }
    
            
            
    
}
