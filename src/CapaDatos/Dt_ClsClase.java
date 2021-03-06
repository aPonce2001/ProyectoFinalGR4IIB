package CapaDatos;

import CapaComun.Cm_ClsClase;
import CapaComun.Cm_ClsComboItem;
import CapaComun.Cm_ClsPais;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

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
    
    public List<Cm_ClsClase> mostrarClaseAll(JComboBox jCBClase) {
        List<Cm_ClsClase> listaClase = new ArrayList<Cm_ClsClase>();
        String storeProcedure = "mostrarClaseAll()";

        int id = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(getConnectionString());
            System.out.println("Conexión exitosa");
            String SQL = "{call DB_A7086C_Viaje.dbo." + storeProcedure + "}";
     
            CallableStatement cs = con.prepareCall(SQL);
             
            ResultSet rs = cs.executeQuery();

            //LLenamos nuestro ComboBox
            jCBClase.addItem("Seleccione una opción");
             
            while (rs.next()) {

                //System.out.println("Id: " + rs.getString(1));//id
                //System.out.println("Nombre: " + rs.getString(2));//nombre
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
