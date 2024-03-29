package CapaDatos;

import CapaComun.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

//@authors Dennis David Lincango, Kelvin Ojeda, Andrés Ponce

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
 

    public int actualizarClase(int ID, String nombre, int capacidad) {
        ArrayList<Object[]> parametros = new ArrayList<Object[]>();
        
        Object[] id = new Object[3];
        id[0] = "int";
        id[1] = "id_clase";
        id[2] = ID;
        
        Object[] datosNombre = new Object[3];
        datosNombre[0] = "String";
        datosNombre[1] = "nombre_clase";
        datosNombre[2] = nombre;
        
        Object[] datosCapacidad = new Object[3];
        datosCapacidad[0] = "int";
        datosCapacidad[1] = "capacidad_clase";
        datosCapacidad[2] = capacidad;
        
        parametros.add(id);
        parametros.add(datosNombre);
        parametros.add(datosCapacidad);
        
        return executeQuery("actualizarClase(?,?,?)", parametros);
    }

    public int borrarClase(int ID) {
        ArrayList<Object[]> parametros = new ArrayList<Object[]>();
         
        Object[] id = new Object[3];
        id[0] = "int";
        id[1] = "id_clase";
        id[2] = ID;
        
        parametros.add(id);
        
        return executeQuery("eliminarClase(?)", parametros);
    }
    
    public List<Cm_ClsClase> mostrarClaseAll(JComboBox jCBClase) {
        List<Cm_ClsClase> listaClase = new ArrayList<Cm_ClsClase>();
        String storeProcedure = "mostrarClaseAll()";

        int id = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(getConnectionString());
            String SQL = "{call "+getDbName()+".dbo." + storeProcedure + "}";
     
            CallableStatement cs = con.prepareCall(SQL);
             
            ResultSet rs = cs.executeQuery();

            jCBClase.addItem("Seleccione una opción");
             
            while (rs.next()) {
                listaClase.add(new Cm_ClsClase(
                        (int) rs.getInt("id"),
                        (String) rs.getString("nombre"),
                        (int) rs.getInt("capacidad")
                ));
                 jCBClase.addItem(new Cm_ClsComboItem(rs.getString("nombre"), String.valueOf(rs.getInt("id"))));
            }

            id = 1;
            rs.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listaClase;
    }
}
