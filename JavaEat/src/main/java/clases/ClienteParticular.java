/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.Serializable;

/**
 *
 * @author ediso
 */
public class ClienteParticular extends Cliente implements Serializable{
    private String Dni;

    public ClienteParticular(String nombre, String correo, String clave, Direccion direccion, TarjetaCredito tarjeta, int telefono, String Dni) {
        super(nombre, correo, clave, direccion, tarjeta, telefono);
        this.Dni = Dni;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String Dni) {
        this.Dni = Dni;
    }

    @Override
    public String toString() {
        return "ClienteParticular{" + "Dni=" + Dni + '}';
    }
    
}
