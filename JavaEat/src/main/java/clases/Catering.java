/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ediso
 */
import java.io.Serializable;
import java.util.*;

public class Catering implements Serializable{
    
    private boolean activado;
    private ArrayList<Comida> comidasProporcionadas;
    private boolean camareros;
    private boolean cocineros;
    private boolean decoracion;
    private long precioTotal;

    public Catering() {
        this.comidasProporcionadas = new ArrayList<>();
        this.activado = false;
        this.camareros = false;
        this.cocineros = false;
        this.decoracion = false;
        this.precioTotal = 0;
    }

    public ArrayList<Comida> getComidasProporcionadas() {
        return comidasProporcionadas;
    }

    public void setComidasProporcionadas(ArrayList<Comida> comidasProporcionadas) {
        this.comidasProporcionadas = comidasProporcionadas;
    }

    public boolean isCamareros() {
        return camareros;
    }

    public void setCamareros(boolean camareros) {
        this.camareros = camareros;
    }

    public boolean isCocineros() {
        return cocineros;
    }

    public void setCocineros(boolean cocineros) {
        this.cocineros = cocineros;
    }

    public boolean isDecoracion() {
        return decoracion;
    }

    public void setDecoracion(boolean decoracion) {
        this.decoracion = decoracion;
    }

    public long getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(long precioTotal) {
        this.precioTotal = precioTotal;
    }

}
