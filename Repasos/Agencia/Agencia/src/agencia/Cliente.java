package agencia;


public class Cliente {
    // Atributos
    public String id;
    public String nombre,apellidoPaterno,apellidoMaterno;
    public String direccion;
    public String telefono;
    public String correo;
    
    // Constructores
    
    public Cliente(String id , String nombre, String correo){
        this(id,nombre,"Por definir","Por definir","Por definir","Por definir",correo);
    }
    
    public Cliente(String id, String nombre,String apellidoPaterno,String apellidoMaterno ,String dirección, String telefono, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccion = dirección;
        this.telefono = telefono;
        this.correo = correo;
    }
    
    // Metodos

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
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

    public String getDirección() {
        return direccion;
    }

    public void setDirección(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    // toString

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo + '}';
    }
    
    
    
}
