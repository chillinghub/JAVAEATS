/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ediso
 */
public class Cliente extends Usuario implements Serializable, Comparable<Cliente> {

    private boolean estaRegistrado = false;
    private String nombre;
    private Direccion direccion;
    private TarjetaCredito tarjeta;
    private long telefono;
    private ArrayList<Venta> ventas;
    

    public Cliente(String nombre, String correo, String clave, Direccion direccion, TarjetaCredito tarjeta, int telefono) {
        super(correo, clave);
        this.nombre = nombre;
        this.direccion = direccion;
        this.tarjeta = tarjeta;
        this.telefono = telefono;
    }

    public boolean isEstaRegistrado() {
        return estaRegistrado;
    }

    public void setEstaRegistrado(boolean estaRegistrado) {
        this.estaRegistrado = estaRegistrado;
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

    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public int compareTo(Cliente p) {
        return this.nombre.compareTo(p.getNombre());
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
            return false;
        }
        return true;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(Venta venta) {
        if (!ventas.contains(venta)){
            ventas.add(venta);
        }
    }
    
    public void removeVentas(Venta venta) {
        if (ventas.contains(venta)){
            ventas.remove(venta);
        }
    }
    
    
    
    
    @Override
    public String toString() {
        return "Cliente{" + "estaRegistrado=" + estaRegistrado + ", nombre=" + nombre + ", direccion=" + direccion.toString() + ", tarjeta=" + tarjeta.toString() + ", telefono=" + telefono + '}';
    }

}
