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
public class Restaurante implements Serializable{
    private String CIF;
    private String nombre;
    private Direccion direccion;
    private String especialidad;
    private double calificacion;
    private double gastosEnvio;
    private int tiempoMedioEnvio;
    private boolean servicioCatering;
    ArrayList<Comida> comidas = new ArrayList();

    public Restaurante(String CIF, String nombre, Direccion direccion, String especialidad, double calificacion, double gastosEnvio, int tiempoMedioEnvio, boolean servicioCatering) {
        this.CIF = CIF;
        this.nombre = nombre;
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.calificacion = calificacion;
        this.gastosEnvio = gastosEnvio;
        this.tiempoMedioEnvio = tiempoMedioEnvio;
        this.servicioCatering = servicioCatering;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public double getGastosEnvio() {
        return gastosEnvio;
    }

    public void setGastosEnvio(double gastosEnvio) {
        this.gastosEnvio = gastosEnvio;
    }

    public int getTiempoMedioEnvio() {
        return tiempoMedioEnvio;
    }

    public void setTiempoMedioEnvio(int tiempoMedioEnvio) {
        this.tiempoMedioEnvio = tiempoMedioEnvio;
    }

    public boolean isServicioCatering() {
        return servicioCatering;
    }

    public void setServicioCatering(boolean servicioCatering) {
        this.servicioCatering = servicioCatering;
    }

    public ArrayList<Comida> getComidas() {
        return comidas;
    }

    public void setComidas(ArrayList<Comida> comidas) {
        this.comidas = comidas;
    }
    public String getCodigoPostal(){
        return direccion.getCodigoPostal();
    }

    @Override
    public String toString() {
        return "Restaurante{" + "CIF=" + CIF + ", nombre=" + nombre + ", direccion=" + direccion.toString() + ", especialidad=" + especialidad + ", calificacion=" + calificacion + ", gastosEnvio=" + gastosEnvio + ", tiempoMedioEnvio=" + tiempoMedioEnvio + ", servicioCatering=" + servicioCatering + ", comidas=" + comidas + '}';
    }
    
}
