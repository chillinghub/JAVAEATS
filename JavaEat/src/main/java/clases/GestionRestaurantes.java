/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 *
 * @author ediso
 */
public class GestionRestaurantes {

    public static ArrayList<Restaurante> restaurantes = new ArrayList<>();
    private static Restaurante objRest;

    public static HashMap<String, Restaurante> getHashMapRestaurantes() {
        HashMap<String, Restaurante> hashMapRestaurantes = new HashMap();
        if (restaurantes.isEmpty()) {
            return null;
        }
        for (Restaurante rl : restaurantes) {
            hashMapRestaurantes.put(rl.getCIF(), rl);
        }
        return hashMapRestaurantes;
    }

    public static void setRestaurante(ArrayList<Restaurante> r) {
        restaurantes = r;
    }

    /**
     * Da de alta una persona
     *
     * @param objper
     * @return boolean
     */
    public static boolean altaResturante(Restaurante objRest) {
        if (!restaurantes.contains(objRest)) {
            restaurantes.add(objRest);
            return true;
        } else {
            return false;
        }

    }

    /**
     * Da de baja una persona
     *
     * @param objper
     * @return boolean
     */
    public static boolean bajaRestaurante(Restaurante objRest) {
        if (restaurantes.contains(objRest)) {
            restaurantes.remove(objRest);
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return Devuelve el ArrayList de personas
     */
    public static ArrayList<Restaurante> getRestaurantes() {
        //Comparador para ordenar las personas por su nombre
        Comparator NomRestComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Restaurante r1 = (Restaurante) o1;
                Restaurante r2 = (Restaurante) o2;
                return r1.getNombre().compareTo(r2.getNombre());
            }
        };
        //Ordenamos el array
        Collections.sort(restaurantes, NomRestComp);
        return restaurantes;
    }

    public static Restaurante consultaRestaurante(int indice) {
        return restaurantes.get(indice);
    }

    public static ArrayList<Restaurante> consultaRestaurantesPorCodigoPostal(String cp) {
        if (restaurantes.isEmpty()) {
            return null;
        }
        ArrayList<Restaurante> restaurantesPorCodigoPostal = restaurantes.stream()
                .filter(objRest -> objRest.getCodigoPostal().equals(cp))
                .collect(Collectors.toCollection(ArrayList::new));
        return restaurantesPorCodigoPostal;
    }

    public static ArrayList<Restaurante> consultaRestaurantesPorEspecialidad(ArrayList<Restaurante> restaurantesPorCodigoPostal, String especialidad) {
        ArrayList<Restaurante> restaurantesFiltradosPorEspecialidad = restaurantesPorCodigoPostal.stream()
                .filter(objRest -> objRest.getEspecialidad().equals(especialidad))
                .collect(Collectors.toCollection(ArrayList::new));
        return restaurantesFiltradosPorEspecialidad;
    }

    /**
     * Modifica los datos de una persona
     *
     * @param per
     * @param p_nombre
     * @param p_fecnac
     * @param p_direccion
     * @param p_tfno
     * @param var1
     * @param var2
     * @return boolean
     */
    public static boolean modificaRestaurante(Restaurante rest, String nombre, Direccion dir, double gastosEnvio, int tiempoMedioEnvio, boolean servicioCatering) {
        if (rest == null || !restaurantes.contains(rest)) {
            return false;
        }
        rest.setNombre(nombre);
        rest.setDireccion(dir);
        rest.setGastosEnvio(gastosEnvio);
        rest.setTiempoMedioEnvio(tiempoMedioEnvio);
        rest.setServicioCatering(servicioCatering);

        return true;
    }
}
