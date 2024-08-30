
package agencia;


public class TransporteTerrestre {
    
    // Atributos
    public String id;
    public String tipoTransporte;
    public Proveedor proveedor;
    public int capacidad;
    public int precio;
    public boolean disponibilidad;
    
    // Constructor
    
    public TransporteTerrestre(String id, String tipoTransporte,Proveedor proveedor, int capacidad, int precio, boolean disponibilidad) {
        this.id = id;
        this.tipoTransporte = tipoTransporte;
        this.proveedor = proveedor;
        this.capacidad = capacidad;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }
    
    // Metodos

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    // toString

    @Override
    public String toString() {
        return "TransporteTerrestre{" + "id=" + id + ", tipoTransporte=" + tipoTransporte + ", proveedor=" + proveedor + ", capacidad=" + capacidad + ", precio=" + precio + ", disponibilidad=" + disponibilidad + '}';
    }
    
}
