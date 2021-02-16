package CapaDatos;

import static CapaDatos.Dt_ClsConexion.executeQuery;
import java.util.ArrayList;

/**
 *
 * @author Dennis David
 */
public class Dt_ClsCliente {

    public Dt_ClsCliente() {
    }

    public int insertarCliente(String nombre, String apellido, String cedula, String passwd, int id_pais_fk) {

        ArrayList<Object[]> parametros = new ArrayList<Object[]>();
        Object[] datosNombre = new Object[3];
        datosNombre[0] = "String";
        datosNombre[1] = "nombre_cliente";
        datosNombre[2] = nombre;

        Object[] datosApellido = new Object[3];
        datosApellido[0] = "String";
        datosApellido[1] = "apellido_cliente";
        datosApellido[2] = apellido;

        Object[] datosCedula = new Object[3];
        datosCedula[0] = "String";
        datosCedula[1] = "cedula_cliente";
        datosCedula[2] = cedula;

        Object[] datosPasswd = new Object[3];
        datosPasswd[0] = "String";
        datosPasswd[1] = "passwd_cliente";
        datosPasswd[2] = passwd;

        Object[] datosPaisFk = new Object[3];
        datosPaisFk[0] = "int";
        datosPaisFk[1] = "id_pais_fk";
        datosPaisFk[2] = id_pais_fk;

        parametros.add(datosNombre);
        parametros.add(datosApellido);
        parametros.add(datosCedula);
        parametros.add(datosPasswd);
        parametros.add(datosPaisFk);
       
        return executeQuery("insertarCliente(?,?,?,?,?)", parametros);

    }

    public void actualizarCliente(int id, String nombre, String apellido, String cedula, String passwd, int id_pais_fk) {

    }

    public void borrarCliente(int id) {

    }

    public void mostrarCliente(int id) {

    }

}
