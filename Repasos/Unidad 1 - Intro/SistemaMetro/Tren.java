package sistemametro;

public class Tren {
    private String idTren,estadoTren;
    private int capacidadMaxima;
    private Linea lineasAsociada;

    public Tren() {
    }

    public Tren(String idTren, String estadoTren, int capacidadMaxima, Linea lineasAsociada) {
        this.idTren = idTren;
        this.estadoTren = estadoTren;
        this.capacidadMaxima = capacidadMaxima;
        this.lineasAsociada = lineasAsociada;
    }
    
    // Metodos

    public String getIdTren() {
        return idTren;
    }

    public void setIdTren(String idTren) {
        this.idTren = idTren;
    }

    public String getEstadoTren() {
        return estadoTren;
    }

    public void setEstadoTren(String estadoTren) {
        this.estadoTren = estadoTren;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Linea getLineasAsociada() {
        return lineasAsociada;
    }

    public void setLineasAsociada(Linea lineasAsociada) {
        this.lineasAsociada = lineasAsociada;
    }
    
    
    @Override
    public boolean equals(Object comparado){
        // Si es la misma referencia
        if(this == comparado){
            return true;
        }
        
        // Si el objeto no es una instancia de Tren
        if(!(comparado instanceof Tren)){
            return false;
        }
        
        // Si no ocurren las dos anteriores asumimos que es un tren y casteamos
        Tren trenComparado = (Tren) comparado;
        
        // Comparamos atributos entre this y el objeto comparado
        
        return this.getCapacidadMaxima() == trenComparado.getCapacidadMaxima() &&
                this.getIdTren().equals(trenComparado.getIdTren());
        
    }
    
    // toString

    @Override
    public String toString() {
        return "Tren{" + "idTren=" + idTren + ", estadoTren=" + estadoTren + ", capacidadMaxima=" + capacidadMaxima + ", lineasAsociada=" + lineasAsociada + '}';
    }
    
    
}
