/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author ediso
 */
public class Administrador extends Usuario{
    String correo = "admin@javaeat.com";
    String clave = "admin";
    public Administrador(String correo, String clave) {
        super(correo,clave);
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Administrador{" + "correo=" + correo + ", clave=" + clave + '}';
    }
    
}
