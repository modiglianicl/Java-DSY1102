package agencia;


public class Vuelo {
    
    // Atributos
    public String id,numeroVuelo;
    public FechaCustom fecha;
    public String hora;
    public String origen;
    public String destino;
    public Proveedor aerolinea;
    public int precio;
    public int asientosDisponibles;
    
    // Constructor
    public Vuelo(String id, String numeroVuelo, FechaCustom fecha, String hora, String origen, String destino, Proveedor aerolinea,int precio,int asientosDisponibles) {
        this.id = id;
        this.numeroVuelo = numeroVuelo;
        this.fecha = fecha;
        this.hora = hora;
        this.origen = origen;
        this.destino = destino;
        this.aerolinea = aerolinea;
        this.precio = precio;
        this.asientosDisponibles = asientosDisponibles;
    }
    
    // Metodos

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public FechaCustom getFecha() {
        return fecha;
    }

    public void setFecha(FechaCustom fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Proveedor getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Proveedor aerolinea) {
        this.aerolinea = aerolinea;
    }
    
    // toString

    @Override
    public String toString() {
        return "Vuelo{" + "id=" + id + ", numeroVuelo=" + numeroVuelo + ", fecha=" + fecha + ", hora=" + hora + ", origen=" + origen + ", destino=" + destino + ", aerolinea=" + aerolinea + ", precio=" + precio + ", asientosDisponibles=" + asientosDisponibles + '}';
    }

    
    
    
}
