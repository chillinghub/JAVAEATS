/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author ediso
 */
public class GestionDatos {

    private static HashMap<String, Cliente> datosClientes = new HashMap<>();
    private static HashMap<String, Restaurante> datosRestaurantes = new HashMap<>();

    
    public static HashMap<String, Cliente> getDatosClientes() {
        return datosClientes;
    }

    public static void setDatosClientes(HashMap<String, Cliente> datosClientes) {
        GestionDatos.datosClientes = datosClientes;
    }

    public static HashMap<String, Restaurante> getDatosRestaurantes() {
        return datosRestaurantes;
    }

    /**
     * Carga los datos de personas del fichero
     */
    public static void setDatosRestaurantes(HashMap<String, Restaurante> datosRestaurantes) {    
        GestionDatos.datosRestaurantes = datosRestaurantes;
    }

    public static void cargarDatos() {
        try {
            //Lectura de los objetos de tipo persona
            FileInputStream fisClientes = new FileInputStream("datosClientes.dat");
            ObjectInputStream oisClientes = new ObjectInputStream(fisClientes);
            datosClientes = (HashMap) oisClientes.readObject();
            fisClientes.close();
            //Lectura de los objetos de tipo persona
            FileInputStream fisRestaurantes = new FileInputStream("datosRestaurantes.dat");
            ObjectInputStream oisRestaurantes = new ObjectInputStream(fisRestaurantes);
            datosRestaurantes = (HashMap) oisRestaurantes.readObject();
            fisRestaurantes.close();
        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (ClassNotFoundException cnfe) {
            System.out.println("Error de clase no encontrada: " + cnfe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    } //fin cargarDatos

    public static void guardarDatos() {
        try {
            //Si hay datos los guardamos...
            if (!datosClientes.isEmpty()) {
                /**
                 * **** Serialización de los objetos *****
                 */
                //Serialización de las personas
                FileOutputStream fosRestaurantess = new FileOutputStream("datosRestaurantes.dat");
                ObjectOutputStream oosRestaurantes = new ObjectOutputStream(fosRestaurantess);
                //guardamos el array de personas
                oosRestaurantes.writeObject(datosRestaurantes);
                fosRestaurantess.close();
            }
            //Si hay datos los guardamos...
            if (!datosRestaurantes.isEmpty()) {
                /**
                 * **** Serialización de los objetos *****
                 */
                //Serialización de las personas
                FileOutputStream fosClientes = new FileOutputStream("datosClientes.dat");
                ObjectOutputStream oosClientes = new ObjectOutputStream(fosClientes);
                //guardamos el array de personas
                oosClientes.writeObject(datosClientes);
                fosClientes.close();
            } else {
                System.out.println("Error: No hay datos...");
            }

        } catch (IOException ioe) {
            System.out.println("Error de IO: " + ioe.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }//fin guardarDatos
}
