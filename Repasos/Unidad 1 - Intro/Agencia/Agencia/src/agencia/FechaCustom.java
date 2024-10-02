/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agencia;

/**
 *
 * @author chuck
 */
public class FechaCustom {
    // Atributos
    public int anio,mes,dia;
    
    // Constructor
    public FechaCustom(int anio, int mes, int dia) {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
    }
    
    // Metodos

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    // toString
    public String toString(){
        String zeroMes = "";
        String zeroDia = "";
        if(this.dia < 10){
            zeroDia = "0";
        }
        if(this.mes < 10){
            zeroMes = "0";
        }
        
        return this.anio + "/" + zeroMes +this.mes + "/" + zeroDia + this.dia; 
    }
    
    
    
}
