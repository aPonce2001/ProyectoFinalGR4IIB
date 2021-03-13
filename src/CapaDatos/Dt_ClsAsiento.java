package CapaDatos;

import CapaComun.*;
import static CapaDatos.Dt_ClsConexion.*;
import java.sql.*;
import java.util.*;

//@authors Dennis David Lincango, Kelvin Ojeda, Andrés Ponce

public class Dt_ClsAsiento extends Dt_ClsConexion {

    public Dt_ClsAsiento() {
    }
    
    public int insertarAsiento (String ubicacion,String estado,int id_clase_FK ){
        return 0;
        
    }
    
    public int actualizarEstadoAsiento(int id,String estado){
        ArrayList<Object[]> parametros = new ArrayList<Object[]>();
        
        Object[] actAsiento = new Object[3];
        actAsiento[0] = "int";
        actAsiento[1] = "id_asiento";
        actAsiento[2] = id;

        Object[] actEstAsiento = new Object[3];
        actEstAsiento[0] = "String";
        actEstAsiento[1] = "estado_asiento";
        actEstAsiento[2] = estado;
       
        
        parametros.add(actAsiento);
        parametros.add(actEstAsiento);
        
        return executeQuery("actualizarEstadoAsiento(?,?)", parametros);
     
    }
    
    public int borrarAsiento (int id){
        return 0;
        
    }
   
    
    public List<Cm_ClsAsiento> mostrarAsientoXClase(int id_clase_FK) {
        List<Cm_ClsAsiento> listaAsiento = new ArrayList<Cm_ClsAsiento>();
        String storeProcedure = "mostrarAsientoXClase(?)";

        int id = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(getConnectionString());

            String SQL = "{call "+getDbName()+".dbo." + storeProcedure + "}";
            CallableStatement cs = con.prepareCall(SQL);
            ArrayList<Object[]> parametros = new ArrayList<Object[]>();
            Object[] datosNombre = new Object[3];
            datosNombre[0] = "int";
            datosNombre[1] = "id_clase_FK";
            datosNombre[2] = id_clase_FK;
            
            parametros.add(datosNombre);

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

                listaAsiento.add(new Cm_ClsAsiento(
                        (int) rs.getInt("id"),
                        (String) rs.getString("ubicacion"),
                        (String) rs.getString("estado"),                    
                        (int) rs.getInt("id_clase_fk")
                ));
                 
            }

            id = 1;
            rs.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listaAsiento;

    }

    public List<Cm_ClsAsiento> mostrarAsientoAll() {

       List<Cm_ClsAsiento> listaAsiento = new ArrayList<Cm_ClsAsiento>();
        String storeProcedure = "mostrarAsientoAll()";

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
                listaAsiento.add(new Cm_ClsAsiento(
                        (int) rs.getInt("id"),
                        (String)rs.getString("ubicacion"), 
                        (String)rs.getString("estado"), 
                        (int) rs.getInt("id_clase_FK"))     
                );   
            }

            id = 1;
            rs.close();

        } catch (Exception e) {
        }

        return listaAsiento;
    }
    
    public List<Cm_ClsAsiento> mostrarAsientosDisponibles() {

       List<Cm_ClsAsiento> listaAsiento = new ArrayList<Cm_ClsAsiento>();
        String storeProcedure = "mostrarAsientosDisponibles()";

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
                listaAsiento.add(new Cm_ClsAsiento(
                        (int) rs.getInt("id"),
                        (String)rs.getString("ubicacion"), 
                        (String)rs.getString("estado"), 
                        (int) rs.getInt("id_clase_FK"))     
                );     
            }

            id = 1;
            rs.close();

        } catch (Exception e) {
        }

        return listaAsiento;
    }

}
