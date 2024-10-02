/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia;

/**
 *
 * @author chuck
 */
public class Hotel {

    // Atributos
    public String id, nombre, ubicacion, tipoHabitacion;
    public String[] habitaciones = new String[]{"Presidencial", "Ejecutiva", "Normal"};
    public Proveedor proveedor;
    public int precioNoche;
    public int habitacionesDisponibles;
    public boolean disponibilidad;

    // Constructor
    public Hotel(String id, String nombre, String ubicacion, Proveedor proveedor, int precioNoche, int habitacionesDisponibles, boolean disponibilidad) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.proveedor = proveedor;
        this.precioNoche = precioNoche;
        this.habitacionesDisponibles = habitacionesDisponibles;
        this.disponibilidad = disponibilidad;
    }

    // Metodos
    public int getHabitacionesDisponibles() {
        return habitacionesDisponibles;
    }

    public void setHabitacionesDisponibles(int habitacionesDisponibles) {
        this.habitacionesDisponibles = habitacionesDisponibles;
    }

    public String[] getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(String[] habitaciones) {
        this.habitaciones = habitaciones;
    }

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public int getPrecioNoche() {
        return precioNoche;
    }

    public void setPrecioNoche(int precioNoche) {
        this.precioNoche = precioNoche;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void elegirHabitacion(int indice) {
        if (indice < 0 || indice > 2) {
            System.out.println("Por favore legir indice entre 0 y 2 inclusive.");
        }
        this.tipoHabitacion = habitaciones[indice];
        System.out.println("La habitación seleccionada fue : " + this.habitaciones[indice]);
    }
    
    public void disminuirDisponibilidad(){
        this.habitacionesDisponibles--;
        System.out.println("La cantidad de habitaciones disponibles disminuyó : " + this.habitacionesDisponibles);
    }

    // toString
    @Override
    public String toString() {
        return "Hotel{" + "id=" + id + ", nombre=" + nombre + ", ubicacion=" + ubicacion + ", tipoHabitacion=" + tipoHabitacion + ", habitaciones=" + habitaciones + ", proveedor=" + proveedor + ", precioNoche=" + precioNoche + ", disponibilidad=" + disponibilidad + '}';
    }

}
