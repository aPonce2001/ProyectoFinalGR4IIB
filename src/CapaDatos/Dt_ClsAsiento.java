package CapaDatos;

import CapaComun.Cm_ClsAsiento;
import CapaComun.Cm_ClsCliente;
import CapaComun.Cm_ClsReserva;
import static CapaDatos.Dt_ClsConexion.executeQuery;
import static CapaDatos.Dt_ClsConexion.getConnectionString;
import static CapaDatos.Dt_ClsConexion.getDbName;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dennis David
 */
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
            System.out.println("Conexión exitosa");

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
                /*else if(param.equals("date")) {
                    //cs.setDate("capacidad", 100);
                }*/

            }

            ResultSet rs = cs.executeQuery();

            
            while (rs.next()) {

                //   System.out.println("Id: " + rs.getString(1));//id
                // System.out.println("Nombre: " + rs.getString(2));//nombre
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
            System.out.println("Conexión exitosa");

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
                /*else if(param.equals("date")) {
                    //cs.setDate("capacidad", 100);
                }*/

            }

            ResultSet rs = cs.executeQuery();

            
            while (rs.next()) {

                //   System.out.println("Id: " + rs.getString(1));//id
                // System.out.println("Nombre: " + rs.getString(2));//nombre
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
            System.out.println(e.getMessage());
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
            System.out.println("Conexión exitosa");

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
                /*else if(param.equals("date")) {
                    //cs.setDate("capacidad", 100);
                }*/

            }

            ResultSet rs = cs.executeQuery();

            
            while (rs.next()) {

                //   System.out.println("Id: " + rs.getString(1));//id
                // System.out.println("Nombre: " + rs.getString(2));//nombre
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
            System.out.println(e.getMessage());
        }

        return listaAsiento;
    }

}
