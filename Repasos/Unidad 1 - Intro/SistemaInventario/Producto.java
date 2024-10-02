package inventario;

public class Producto {

    // Atributos
    private String idProducto, nombre;
    private int precio, stock;
    private Categoria categoria;
    private Proveedor proveedor;

    // Constructor
    public Producto() {
        this.nombre = "Sin nombre";

    }

    public Producto(String idProducto, String nombre, int precio, int stock, Categoria categoria, Proveedor proveedor) {
        this.precio = precio;
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.stock = stock;
        this.categoria = categoria;
        this.proveedor = proveedor;
    }

    // Metodos
    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;

    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;

    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    // Customer
    public void agregarStock(int cantidad) {
        this.setStock(this.getStock() + cantidad);
        System.out.println("Se agregaron " + cantidad + " " + this.getNombre());
    }

    public int comprarProducto(int cantidad) {
        if (this.getStock() >= cantidad) {
            int total = this.getPrecio() * cantidad;
            this.setStock(this.getStock() - cantidad);
            System.out.println("Stock despues de la compra : " + this.getStock());
            return total;
        } else {
            System.out.println("No hay stock suficiente!");
        }
        return 0;
    }

    public void imprimirProducto() {
        System.out.println("ID Producto : " + this.getIdProducto());
        System.out.println("Nombre Producto : " + this.getNombre());
        System.out.println("Precio Producto : $" + this.getPrecio());
        System.out.println("Stock producto : " + this.getStock());
        System.out.println("Categoria Producto : " + this.getCategoria().getNombre());
        System.out.println("Nombre Proveedor : " + this.getProveedor().getNombre());
    }

    // toString
    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", categoria=" + categoria + ", proveedor=" + proveedor + '}';
    }

}
