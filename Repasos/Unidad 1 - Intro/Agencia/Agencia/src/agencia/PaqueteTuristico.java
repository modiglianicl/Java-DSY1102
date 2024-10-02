
package agencia;

import java.util.ArrayList;

public class PaqueteTuristico {
    // Atributos
    public String id,nombre,descripcion;
    public int precioTotal = 0;
    public ArrayList<Vuelo> vuelos;
    public ArrayList<Hotel> hoteles;
    public ArrayList<TransporteTerrestre> transportesTerrestres;
    public ArrayList<Actividad> actividades;
    
    // Constructores
    
    public PaqueteTuristico(String id, String nombre, String descripcion, ArrayList<Vuelo> vuelos, ArrayList<Hotel> hoteles, ArrayList<TransporteTerrestre> transportesTerrestres, ArrayList<Actividad> actividades) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.vuelos = vuelos;
        this.hoteles = hoteles;
        this.transportesTerrestres = transportesTerrestres;
        this.actividades = actividades;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }

    public void setVuelos(ArrayList<Vuelo> vuelos) {
        this.vuelos = vuelos;
    }

    public ArrayList<Hotel> getHoteles() {
        return hoteles;
    }

    public void setHoteles(ArrayList<Hotel> hoteles) {
        this.hoteles = hoteles;
    }

    public ArrayList<TransporteTerrestre> getTransportesTerrestres() {
        return transportesTerrestres;
    }

    public void setTransportesTerrestres(ArrayList<TransporteTerrestre> transportesTerrestres) {
        this.transportesTerrestres = transportesTerrestres;
    }

    public ArrayList<Actividad> getActividades() {
        return actividades;
    }

    public void setActividades(ArrayList<Actividad> actividades) {
        this.actividades = actividades;
    }
    
    public void calcularTotal(){
        if(!this.vuelos.isEmpty()){
            for(Vuelo vuelo:this.vuelos){
                this.precioTotal += vuelo.getPrecio();
            }
        }
        
        if(!this.hoteles.isEmpty()){
            for(Hotel hotel:this.hoteles){
                this.precioTotal += hotel.getPrecioNoche();
            }
        }
        
        if(!this.transportesTerrestres.isEmpty()){
            for(TransporteTerrestre trans:this.transportesTerrestres){
                this.precioTotal += trans.getPrecio();
            }
        }
        
        if(!this.actividades.isEmpty()){
            for(Actividad actividad:this.actividades){
                this.precioTotal += actividad.getPrecio();
            }
        }
        
        
        System.out.println("El total del paquete es : " + this.precioTotal);
    }
    
    // toString

    @Override
    public String toString() {
        return "PaqueteTuristico{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precioTotal=" + precioTotal + ", vuelos=" + vuelos + ", hoteles=" + hoteles + ", transportesTerrestres=" + transportesTerrestres + ", actividades=" + actividades + '}';
    }
    
    
    
}
