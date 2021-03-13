
package CapaDatos;

import CapaComun.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

//@authors Dennis David Lincango, Kelvin Ojeda, Andrés Ponce

public class Dt_ClsPais extends Dt_ClsConexion {

    public Dt_ClsPais() {
    }

    public int insertarPais(int ID, String nombre) {
     
        ArrayList<Object[]> parametros = new ArrayList<Object[]>();
         
        Object[] id = new Object[3];
        id[0] = "int";
        id[1] = "id_Pais";
        id[2] = ID;
        
        Object[] datosPais = new Object[3];
        datosPais[0] = "String";
        datosPais[1] = "nombre_Pais";
        datosPais[2] = nombre;
        
        parametros.add(id);
        parametros.add(datosPais);
        
        return executeQuery("insertarPais(?,?)", parametros);

    }

    public int actualizarPais(int ID, String nombre) {
        ArrayList<Object[]> parametros = new ArrayList<Object[]>();
         
        Object[] id = new Object[3];
        id[0] = "int";
        id[1] = "id_Pais";
        id[2] = ID;
        
        Object[] datosPais = new Object[3];
        datosPais[0] = "String";
        datosPais[1] = "nombre_Pais";
        datosPais[2] = nombre;
        
        parametros.add(id);
        parametros.add(datosPais);
        
        return executeQuery("actualizarPais(?,?)", parametros);

    }

    public int borrarPais(int ID) {
        ArrayList<Object[]> parametros = new ArrayList<Object[]>();
         
        Object[] id = new Object[3];
        id[0] = "int";
        id[1] = "id_Pais";
        id[2] = ID;
        
        parametros.add(id);
        
        return executeQuery("eliminarPais(?)", parametros);
    }

    public List<Cm_ClsPais> mostrarPaisAll(JComboBox jCBPais, Boolean isUpdatedAt, int selectedIdx) {
        List<Cm_ClsPais> listaPais = new ArrayList<Cm_ClsPais>();
        String storeProcedure = "mostrarPaisAll()";

        int id = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(getConnectionString());

            String SQL = "{call "+getDbName()+".dbo." + storeProcedure + "}";
            CallableStatement cs = con.prepareCall(SQL);
            ArrayList<Object[]> parametros = new ArrayList<Object[]>();

            for (Object[] param : parametros) {
                System.out.println("param[0] PAIS:" + param[0]);
                if (param[0].equals("String")) {
                    String columnName = String.valueOf(param[1]);
                    String columnValue = String.valueOf(param[2]);
                    cs.setString(columnName, columnValue);
                } else if (param[0].equals("int")) {
                    
                    String columnName = String.valueOf(param[1]);
                    int columnValue = (int) (param[2]);
                    cs.setInt(columnName, columnValue);
                }
            }

            ResultSet rs = cs.executeQuery();

            jCBPais.addItem("Seleccione una opción");
            while (rs.next()) {
                listaPais.add(new Cm_ClsPais(
                        (int) rs.getInt("id"),
                        (String) rs.getString("nombre")
                ));
                jCBPais.addItem(new Cm_ClsComboItem(rs.getString("nombre"), String.valueOf(rs.getInt("id"))));
            }
            
            if(isUpdatedAt) {
                jCBPais.setSelectedIndex(selectedIdx);
            }

            id = 1;
            rs.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listaPais;
    }
}
