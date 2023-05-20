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
public class ClienteEmpresa extends Cliente implements Serializable{

    private String CIF;
    private String web;

    public ClienteEmpresa(String nombre, String correo, String clave, Direccion direccion, TarjetaCredito tarjeta, int telefono, String CIF, String web) {
        super(nombre, correo, clave, direccion, tarjeta, telefono);
        this.CIF = CIF;
        this.web = web;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    @Override
    public String toString() {
        return "ClienteEmpresa{" + "CIF=" + CIF + ", web=" + web + '}';
    }

}
