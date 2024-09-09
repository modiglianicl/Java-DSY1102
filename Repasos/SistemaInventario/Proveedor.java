package inventario;

public class Proveedor {

    // Atributos
    String idProveedor, nombre, contacto;

    // Constructor
    public Proveedor(){
        this.nombre = "Sin nombre";
    }
    
    public Proveedor(String idProveedor, String nombre, String contacto) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.contacto = contacto;
    }

    // Metodos
    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void imprimirProveedor() {
            System.out.println("ID Proveedor : " + this.getIdProveedor());
            System.out.println("Nombre Proveedor : " + this.getNombre());
            System.out.println("Contacto : " + this.getContacto());
    }

    // toString
    @Override
    public String toString() {
        return "Proveedor{" + "idProveedor=" + idProveedor + ", nombre=" + nombre + ", contacto=" + contacto + '}';
    }

}
