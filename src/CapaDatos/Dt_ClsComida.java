package CapaDatos;

import CapaComun.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;

//@authors Dennis David Lincango, Kelvin Ojeda, Andrés Ponce

public class Dt_ClsComida extends Dt_ClsConexion {

    public Dt_ClsComida() {
    }
    
    public int insertarComida (String nombre){
       ArrayList<Object[]> parametros = new ArrayList<Object[]>();
        Object[] datosComida = new Object[3];
        datosComida[0] = "String";
        datosComida[1] = "nombre_comida";
        datosComida[2] = nombre;
 
        parametros.add(datosComida);
        
        return executeQuery("insertarComida(?)", parametros);
    }
    
    public int actualizarComida (int id,String nombre){
        ArrayList<Object[]> parametros = new ArrayList<Object[]>();
        Object[] identificacionComida = new Object[3];
        identificacionComida[0] = "int";
        identificacionComida[1] = "id_comida";
        identificacionComida[2] = id;
        parametros.add(identificacionComida);
        
        Object[] datosComida = new Object[3];
        datosComida[0] = "String";
        datosComida[1] = "nombre_comida";
        datosComida[2] = nombre;
        parametros.add(datosComida);
        
        
        return executeQuery("actualizarComida(?,?)", parametros);
    }
    
    public int eliminarComida (int id){
        ArrayList<Object[]> parametros = new ArrayList<Object[]>();
        Object[] identificacionComida = new Object[3];
        identificacionComida[0] = "int";
        identificacionComida[1] = "id_comida";
        identificacionComida[2] = id;
        parametros.add(identificacionComida);
        return executeQuery("eliminarComida(?)", parametros);
    }
  
    
    public List<Cm_ClsComida> mostrarComidaAll(JComboBox jCBReservaComida) {
        List<Cm_ClsComida> listaComida = new ArrayList<Cm_ClsComida>();
        String storeProcedure = "mostrarComidaAll()";

        int id = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(getConnectionString());

            String SQL = "{call "+getDbName()+".dbo." + storeProcedure + "}";
            CallableStatement cs = con.prepareCall(SQL);
            ArrayList<Object[]> parametros = new ArrayList<Object[]>();

            for (Object[] param : parametros) {
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
            
            while (rs.next()) {
                listaComida.add(new Cm_ClsComida(
                        (int) rs.getInt("id"),
                        (String) rs.getString("nombre")
                ));
                 jCBReservaComida.addItem(new Cm_ClsComboItem(rs.getString("nombre"), String.valueOf(rs.getInt("id"))));
            }

            id = 1;
            rs.close();

        } catch (Exception e) {
        }

        return listaComida;
    }
    
    
     public List<Cm_ClsComida> mostrarComidaXId(int id_comida) {
        List<Cm_ClsComida> listaComidaXId = new ArrayList<Cm_ClsComida>();
        String storeProcedureName =  "mostrarComidaXId(?)";
        
        int id = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(getConnectionString());

            String SQL = "{call "+getDbName()+".dbo." + storeProcedureName + "}";
            CallableStatement cs = con.prepareCall(SQL);
            ArrayList<Object[]> parametros = new ArrayList<Object[]>();

            Object[] datoComida = new Object[3];
            datoComida[0] = "int";
            datoComida[1] = "id_comida";
            datoComida[2] = id_comida;

            parametros.add(datoComida);
  
            for (Object[] param : parametros) {
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
 
            while (rs.next()) {
               
                listaComidaXId.add(new Cm_ClsComida(
                        (int) rs.getInt("id"),
                        (String) rs.getString("nombre")
                ));
                 
            }

            id = 1;
            rs.close();

        } catch (Exception e) {
        }

        return listaComidaXId;
   
     }
   
       public List<Cm_ClsComida> mostrarComidaTabla() {
        List<Cm_ClsComida> listaComida = new ArrayList<Cm_ClsComida>();
        String storeProcedure = "mostrarComidaAll()";

        int id = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(getConnectionString());

            String SQL = "{call "+getDbName()+".dbo." + storeProcedure + "}";
            CallableStatement cs = con.prepareCall(SQL);
            ArrayList<Object[]> parametros = new ArrayList<Object[]>();

            for (Object[] param : parametros) {
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
  
            while (rs.next()) {
                listaComida.add(new Cm_ClsComida(
                        (int) rs.getInt("id"),
                        (String) rs.getString("nombre")
                ));
            }

            id = 1;
            rs.close();

        } catch (Exception e) {
        }

        return listaComida;

    }
  
    
}
