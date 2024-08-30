package agencia;

import java.util.ArrayList;
import java.util.Date;

public class ReporteV2 {

    // Atributos
    public String id;
    public Date fechaReporte; // Al momento de crear se establece una fecha.
    public ArrayList<Reserva> reservas; // Lista de reservas, esto es lo que analizo!!
    public int totalReservas = 0; // Cuantas reservas se hicieron. OK
    public int totalReservasPagadas; // Cuantas reservas se pagaron
    public int montoTotal; // Monto total entre todas las reservas. OK
    public int montoTotalPagado; // El monto total que se ha pagado en reservas OK
    public int montoTotalAdeudado;// Cuanto deben los clientes OK
    public int cantidadActividades;// Cuantas actividades se contrataron OK
    public int cantidadHoteles;// Cuantos hoteles se contrataron OK
    public int cantidadVuelos;// Cuantos vuelos se contrataron OK
    public ArrayList<Ejecutivo> ejecutivos;
    public ArrayList<Integer> ventasEjecutivos;

    // Constructores 
    public ReporteV2(String id) { // Inicializamos uno vacio
        this.id = id;
        this.fechaReporte = new Date();
        this.reservas = new ArrayList<>();
        this.ejecutivos = new ArrayList<>();
    }

    public ReporteV2(String id, Reserva reserva) { // Inicializamos con uno
        this.id = id;
        this.fechaReporte = new Date();
        this.reservas = new ArrayList<>();
        this.reservas.add(reserva);
        this.ejecutivos = new ArrayList<>();
    }

    public ReporteV2(String id, ArrayList<Reserva> reservas) { // Inicializamos con una lista.
        this.id = id;
        this.fechaReporte = new Date();
        this.reservas = new ArrayList<>();
        for (Reserva reserva : reservas) {
            this.reservas.add(reserva);
        }
        this.ejecutivos = new ArrayList<>();
    }

    // Metodos
    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFechaReporte() {
        return fechaReporte;
    }

    public void setFechaReporte(Date fechaReporte) {
        this.fechaReporte = fechaReporte;
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    public int getTotalReservas() {
        return totalReservas;
    }

    public void setTotalReservas(int totalReservas) {
        this.totalReservas = totalReservas;
    }

    public int getTotalReservasPagadas() {
        return totalReservasPagadas;
    }

    public void setTotalReservasPagadas(int totalReservasPagadas) {
        this.totalReservasPagadas = totalReservasPagadas;
    }

    public int getMontoTotalPagado() {
        return montoTotalPagado;
    }

    public void setMontoTotalPagado(int montoTotalPagado) {
        this.montoTotalPagado = montoTotalPagado;
    }

    public int getMontoTotalAdeudado() {
        return montoTotalAdeudado;
    }

    public void setMontoTotalAdeudado(int montoTotalAdeudado) {
        this.montoTotalAdeudado = montoTotalAdeudado;
    }

    public int getCantidadActividades() {
        return cantidadActividades;
    }

    public void setCantidadActividades(int cantidadActividades) {
        this.cantidadActividades = cantidadActividades;
    }

    public int getCantidadHoteles() {
        return cantidadHoteles;
    }

    public void setCantidadHoteles(int cantidadHoteles) {
        this.cantidadHoteles = cantidadHoteles;
    }

    public int getCantidadVuelos() {
        return cantidadVuelos;
    }

    public ArrayList<Integer> getVentasEjecutivos() {
        return ventasEjecutivos;
    }

    public void setVentasEjecutivos(ArrayList<Integer> ventasEjecutivos) {
        this.ventasEjecutivos = ventasEjecutivos;
    }

    public ArrayList<Ejecutivo> getEjecutivos() {
        return ejecutivos;
    }

    public void setEjecutivos(ArrayList<Ejecutivo> ejecutivos) {
        this.ejecutivos = ejecutivos;
    }

    public void setCantidadVuelos(int cantidadVuelos) {
        this.cantidadVuelos = cantidadVuelos;
    }

    public void agregarReserva(Reserva reservaNueva) { // Agregar una reserva no implica que el reporte se actualice!
        this.reservas.add(reservaNueva);
        System.out.println("Reserva agregada al reporte.");
    }

    public void reporteFull() { // Analiza todas las variables que dependen de las reservas agregadas desde 0
        // Seteamos todo en 0
        this.totalReservas = 0;
        this.montoTotal = 0;
        this.montoTotalAdeudado = 0;
        this.montoTotalPagado = 0;
        this.cantidadActividades = 0;
        this.cantidadHoteles = 0;
        this.cantidadVuelos = 0;
        this.ejecutivos = new ArrayList<>();

        // Contamos cuantas reservas
        for (Reserva reserva : this.getReservas()) {
            this.totalReservas++;
        }

        // Obtenemos el total de la reserva
        for (Reserva reserva : this.getReservas()) {
            this.montoTotal += reserva.getMontoTotal();
        }

        // Obtenemos el monto adeudado
        for (Reserva reserva : this.getReservas()) {
            this.montoTotalAdeudado += reserva.getAdeudado();
        }

        // Obtenemos el monto pagado
        this.montoTotalPagado = this.montoTotal - this.montoTotalAdeudado;

        // Contar actividades
        // Debo de acceder primero a la reserva y luego dentro de la reserva acceder a la lista especifica qeu esta en paquete turistico
        for (Reserva reserva : this.getReservas()) {
            ArrayList<Actividad> actividades = reserva.paqueteReservado.getActividades(); // Una reserva tiene un paquete, este paquete tiene actividades en forma de lista.
            for (Actividad actividad : actividades) {
                this.cantidadActividades++;
            }
        }

        // Contar Hoteles
        for (Reserva reserva : this.getReservas()) {
            ArrayList<Hotel> hoteles = reserva.paqueteReservado.getHoteles();
            for (Hotel hotel : hoteles) {
                this.cantidadHoteles++;
            }
        }

        // Contar Vuelos
        for (Reserva reserva : this.getReservas()) {
            ArrayList<Vuelo> vuelos = reserva.paqueteReservado.getVuelos();
            for (Vuelo vuelo : vuelos) {
                this.cantidadVuelos++;
            }
        }

        // Analizando ventas realizadas por ejecutivo

        // Analizando ejecutivos unicos
        for (Reserva reserva : this.getReservas()) {
            if (!(this.ejecutivos.contains(reserva.getEjecutivo()))) {
                this.ejecutivos.add(reserva.getEjecutivo());
                System.out.println("El ejecutivo " + reserva.ejecutivo.getNombre() + " ha realizado " + reserva.ejecutivo.getVentasRealizadas() + " reserva(s)");
            }
        }

    }

    // toString
    @Override
    public String toString() {
        return "ReporteV2{" + "id=" + id + ", fechaReporte=" + fechaReporte + ", reservas=" + reservas + ", totalReservas=" + totalReservas + ", totalReservasPagadas=" + totalReservasPagadas + ", montoTotalPagado=" + montoTotalPagado + ", montoTotalAdeudado=" + montoTotalAdeudado + ", cantidadActividades=" + cantidadActividades + ", cantidadHoteles=" + cantidadHoteles + ", cantidadVuelos=" + cantidadVuelos + '}';
    }

}
