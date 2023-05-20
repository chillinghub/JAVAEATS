/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ediso
 */
public class Venta {

    private Cliente cliente;
    private LocalDate fechaVenta;
    private Catering catering;

    HashMap<Comida, Integer> pedido = new HashMap<>();
    private int precioTotal;

    public Venta(Cliente cliente, LocalDate fechaVenta, Catering catering, int precioTotal) {
        this.cliente = cliente;
        this.fechaVenta = fechaVenta;
        this.catering = catering;
        this.precioTotal = precioTotal;
    }

    public LocalDate getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(LocalDate fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public Catering getCatering() {
        return catering;
    }

    public void setCatering(Catering catering) {
        this.catering = catering;
    }

    public int calcularPrecio(HashMap<Comida, Integer> pedido) {
        int precio = 0;
        for (Map.Entry<Comida, Integer> entry : pedido.entrySet()) {
            Comida comida = entry.getKey();
            int cantidad = entry.getValue();
            System.out.println("Comida: " + comida.toString() + ", Cantidad: " + cantidad);
            precio += cantidad*comida.getPrecio();
        }
        return precio;
    }
    
    public static void generarFicha(Cliente cliente) throws IOException {
        PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter(cliente.getNombre() + ".txt")));
    }
}
