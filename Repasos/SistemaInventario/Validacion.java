
package inventario;

/**
 *
 * @author chuck
 */
public class Validacion {
    
    public boolean validarPrecio(int precio){
        return precio >= 0;
    }
    
    public boolean validarCantidad(int cantidad){
        return cantidad > 0;
    }
    
    public boolean validarNombre(String nombre){
        return (!(nombre.isEmpty())); // Si no es blanco
    }
}
