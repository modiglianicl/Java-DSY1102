package veterinaria;


/**
 *
 * @author felipe
 */
public class Producto {
    private int sku;
    private String nombre;
    private int stock;
    private String descripcion;
    
    public Producto(int sku, String nombre, int stockInicial , String descripcion){
        this.sku = sku;
        this.nombre = nombre;
        this.stock = stockInicial;
        this.descripcion = descripcion;
    }
    
    public Producto(int sku, String nombre){
        this(sku,nombre,0,"");
    }
    
    public int getSku(){
        return this.sku;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
        System.out.println("Nombre cambiado a " + this.getNombre());
    }
    
    public int getStock(){
        return this.stock;
    }
    
    public void setStock(int cantidadObtenida){
        this.stock = this.stock + cantidadObtenida;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
    @Override
    public String toString(){
        return this.nombre + ", stock : " + this.stock;
    }
    
}
