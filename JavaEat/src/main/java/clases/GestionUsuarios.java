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
import java.util.List;


/**
 *
 * @author ediso
 */
public class GestionUsuarios {

    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static Cliente objCliente;
    
    public static HashMap<Long, Cliente> getHashMapClientes(){
        HashMap<Long,Cliente> hashMapClientes = new HashMap();
        if(clientes.isEmpty()) return null;
        for(Cliente cl: clientes){
            hashMapClientes.put(cl.getTelefono(), cl);
        }
        return hashMapClientes;
    }
    
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public static void setClientes(Cliente cliente) {
        if (cliente.isEstaRegistrado()&& !(clientes.contains(cliente))){
            clientes.add(cliente);
        }
    }
    
//    public ArrayList<Usuario> getUsuarios() {
//        return usuarios;
//    }
//    
//    public static void setUsuarios(Usuario usuario) {
//        if (!usuarios.contains(usuario)){
//            usuarios.add(usuario);
//        }
//    }
    
    
    /**
     * @return Devuelve el ArrayList de personas
     */
    public static ArrayList<Cliente> getPersonas() {
        //Comparador para ordenar las personas por su nombre
        Comparator NomPerComp = new Comparator() {

            @Override
            public int compare(Object o1, Object o2) {
                Cliente p1 = (Cliente) o1;
                Cliente p2 = (Cliente) o2;
                return p1.getNombre().compareTo(p2.getNombre());
            }
        };
        //Ordenamos el array
        Collections.sort(clientes, NomPerComp);
        return clientes;
    }
    
    public static List<String> getNombres(){
        List <String> result = clientes.stream()
        .map(v -> v.getCorreo())
        .collect(Collectors.toList());
        return(result);
    }
    
    public static List<String> getClaves(){
        List <String> result = (List <String>) clientes.stream()
        .map(v -> v.getClave())
        .collect(Collectors.toList());
        return(result);
    }
    

    /**
     * Da de alta una persona
     *
     * @param objper
     * @return boolean
     */
//    public static boolean altaPersona(Cliente objCliente) {
//        if (!clientes.contains(objCliente )) {
//            clientes.add(objCliente);
//            return true;
//        } else {
//            return false;
//        }
//
//    }
//
//    /**
//     * Da de baja una persona
//     *
//     * @param objper
//     * @return boolean
//     */
//    public static boolean bajaPersona(Cliente objper) {
//        if (clientes.contains(objper)) {
//            clientes.remove(objper);
//            return true;
//        } else {
//            return false;
//        }
//    }
    /** Devuelve una persona por la posición dentro del ArrayList
     * @param indice
     * @return objper */
    public static Cliente consultaCliente(int indice) {
        objCliente = clientes.get(indice);
        return objCliente;
    }
    public static boolean modificaCliente(Cliente cl, String nombre, String correo, String clave, Direccion dir, TarjetaCredito tarjCred, long telefono, boolean estaRegistrado, String web){
        if(cl == null || !clientes.contains(cl)){
            return false;
        }
        cl.setNombre(nombre);
        cl.setCorreo(correo);
        cl.setClave(clave);
        cl.setDireccion(dir);
        cl.setTarjeta(tarjCred);
        cl.setTelefono(telefono);
        String tipo = cl.getClass().getSimpleName();
        if(tipo.equals("ClienteEmpresa")){
            ClienteEmpresa cliEmp = (ClienteEmpresa) cl;
            cliEmp.setWeb(web);
        }
        return true;
    }
}
