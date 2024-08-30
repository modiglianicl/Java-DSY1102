package agencia;

import java.util.Date;

public class Reserva {
    // Atributos
    public String id;
    public Date fecha;
    public String detalles; // Detalles adicionales en forma de texto
    public String estadoReserva = "Reservado"; // Reservado (default), Pagado, Anulado;
    public Cliente cliente;
    public Ejecutivo ejecutivo;
    public PaqueteTuristico paqueteReservado;
    public int montoTotal;
    public int adeudado;
    public int pagado;
    
    // Constructor
    public Reserva(String id, String detalles, Cliente cliente, Ejecutivo ejecutivo , PaqueteTuristico paqueteReservado) {
        this.id = id;
        this.fecha = new Date();
        this.detalles = detalles;
        this.cliente = cliente;
        this.ejecutivo = ejecutivo;
        this.paqueteReservado = paqueteReservado;
        this.adeudado = paqueteReservado.getPrecioTotal();
        this.montoTotal = paqueteReservado.getPrecioTotal();
        this.pagado = 0;
    }
    
    // Metodos

    public Ejecutivo getEjecutivo() {
        return ejecutivo;
    }

    public void setEjecutivo(Ejecutivo ejecutivo) {
        this.ejecutivo = ejecutivo;
    }
    
    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public int getAdeudado() {
        return adeudado;
    }

    public void setAdeudado(int adeudado) {
        this.adeudado = adeudado;
    }
    
    
    public int getPagado() {
        return pagado;
    }

    public void setPagado(int pagado) {
        this.pagado = pagado;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public PaqueteTuristico getPaqueteReservado() {
        return paqueteReservado;
    }

    public void setPaqueteReservado(PaqueteTuristico paqueteReservado) {
        this.paqueteReservado = paqueteReservado;
    }
    
    public void abonarReserva(int montoAbonado){
        if((montoAbonado >= this.adeudado || montoAbonado > 0) && montoAbonado > 0){
            this.adeudado -= montoAbonado;
            this.pagado += montoAbonado;
            System.out.println("Monto abonado, se deben " + this.adeudado + " de la reserva.");
            if(this.adeudado <= 0){
                this.estadoReserva = "Pagado";
                System.out.println("El estado ha sido cambiado a 'Pagado'");
            }
        } else{
            System.out.println("Debe de ingresar un monto mayor a 0 o " + this.adeudado);
        }
    }
    
    public void anularReserva(){
        this.estadoReserva = "Anulado";
        System.out.println("La reserva ha sido anulada.");
    }
    
    // toString

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", fecha=" + fecha + ", detalles=" + detalles + ", estadoReserva=" + estadoReserva + ", cliente=" + cliente + ", ejecutivo=" + ejecutivo + ", paqueteReservado=" + paqueteReservado + ", montoTotal=" + montoTotal + ", adeudado=" + adeudado + ", pagado=" + pagado + '}';
    }

    
}
