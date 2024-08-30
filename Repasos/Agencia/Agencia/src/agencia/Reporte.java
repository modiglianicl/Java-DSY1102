package agencia;

import java.util.ArrayList;
import java.util.Date;

public class Reporte {
    // NO USAR ESTA CLASE, ERA MI PRIMERA IDEA!!
    // Atributos, cada lista de objetos se usara para analizar
    public ArrayList<String> id;
    public Date fechaReporte;
    public PaqueteTuristico paquetes;
    public int totalReservas;
    public int totalReservasPagadas;
    public int montoTotalPagado;
    public int montoTotalAdeudado;
    public int cantidadActividades;
    public int cantidadHoteles;
    public int cantidadVuelos;

    // Constructor
    public Reporte(ArrayList<String> id, Date fechaReporte, PaqueteTuristico paquetes) {
        this.id = id;
        this.fechaReporte = fechaReporte;
        this.paquetes = paquetes;
    }

    // Metodos

    public ArrayList<String> getId() {
        return id;
    }

    public void setId(ArrayList<String> id) {
        this.id = id;
    }

    public Date getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(Date fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public PaqueteTuristico getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(PaqueteTuristico paquetes) {
        this.paquetes = paquetes;
    }
    
    // toString

    @Override
    public String toString() {
        return "Reporte{" + "id=" + id + ", fechaReporte=" + fechaReporte + ", paquetes=" + paquetes + '}';
    }
    
}
