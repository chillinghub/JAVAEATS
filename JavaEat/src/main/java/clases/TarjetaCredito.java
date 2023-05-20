/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ediso
 */
import java.time.*;
public class TarjetaCredito {
    private String titular;
    private long numeroTarjeta;
    private LocalDate fechaCaducidad; 

    public TarjetaCredito(String titular, long numeroTarjeta, LocalDate fechaCaducidad) {
        this.titular = titular;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public long getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(long numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" + "titular=" + titular + ", numeroTarjeta=" + numeroTarjeta + ", fechaCaducidad=" + fechaCaducidad + '}';
    }
    
    
}
