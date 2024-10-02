package sistemametro;

public class Validacion {
    
    
    public boolean validarNombre(String nombre){
        return !(nombre.isEmpty());
    }
    
    public boolean validarCapacidadTren(int capacidadTren){
        return capacidadTren > 0;
    }
    
    public boolean validarFrecuenciaServicio(int frecuenciaServicio){
        return frecuenciaServicio > 0;
    }
}
