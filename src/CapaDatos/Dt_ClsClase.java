package CapaDatos;

import java.util.ArrayList;

/**
 *
 * @author Dennis David
 */
public class Dt_ClsClase extends Dt_ClsConexion {

    public Dt_ClsClase() {
    }

    public int insertarClase(String nombre, int capacidad) {
        ArrayList<Object[]> parametros = new ArrayList<Object[]>();
        Object[] datosNombre = new Object[3];
        datosNombre[0] = "String";
        datosNombre[1] = "nombre_clase";
        datosNombre[2] = nombre;
        
        Object[] datosCapacidad = new Object[3];
        datosCapacidad[0] = "int";
        datosCapacidad[1] = "capacidad_clase";
        datosCapacidad[2] = capacidad;
        
        parametros.add(datosNombre);
        parametros.add(datosCapacidad);
        
        return executeQuery("insertarClase(?,?)", parametros);
        
    }
 

    public void actualizarClase(int id, String nombre, int capacidad) {

    }

    public void borrarClase(int id) {

    }

    public void mostrarClase(int id) {

    }
}
