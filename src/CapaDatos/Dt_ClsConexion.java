package CapaDatos;

import java.sql.CallableStatement;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Dennis David
 */
public class Dt_ClsConexion {

    public Dt_ClsConexion() {
    }
    
    public static String getConnectionString() {
        String connectionURL = "jdbc:sqlserver://localhost;"
                    + "databaseName="+getDbName()+";"
                    + "user=admin;"
                    + "password=Admin1234;";

        return connectionURL;
    }
    
    public static String getDbName() {
        String dbName = "DB_Viaje";
        return dbName;
    }

    public static int executeQuery(String storeProcedure, ArrayList<Object[]> params) {
        int id = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            Connection con = DriverManager.getConnection(getConnectionString());
            System.out.println("Conexión exitosa");
            
            String SQL = "{call "+getDbName()+".dbo." +storeProcedure+"}";
            CallableStatement cs = con.prepareCall(SQL);
            
            for (Object[] param : params ) {
                if(param[0].equals("String") ) {
                    String columnName = String.valueOf(param[1]);
                    String columnValue = String.valueOf(param[2]);
                    
                    cs.setString(columnName, columnValue);
                } else if(param[0].equals("int")) {
                    String columnName = String.valueOf(param[1]);
                    int columnValue = (int)(param[2]);
                    
                    cs.setInt(columnName, columnValue);
                } /*else if(param[0].equals("date")) {
                    
                    String columnName = String.valueOf(param[1]);
                    Date columnValue = (Date)(param[2]);
                    
                    cs.setDate(columnName, columnValue);
                }*/
                
            }
            /*cs.setString("nombre", "Clase baja");
            cs.setInt("capacidad", 100);*/
            
            cs.execute();
            //ResultSet rs = cs.executeQuery();
            /*  while (rs.next()) {
               // System.out.println(rs.getString(1));
                //System.out.println(cs);
            }
             */
            id = 1;
            cs.close();

            //           Statement st = con.createStatement();
            //         ResultSet rs = st.executeQuery("select * from RESERVA");
            //       System.out.println("Tabla vuelos\n");
            //     while (rs.next()) {
            //     int id_reserva = rs.getInt(1);
            //   System.out.println(id_reserva);
            //   }
        } catch (Exception e) {
            System.out.println("error catch es: " + e.getMessage());
        }
        System.out.println(id);
        return id;
    }
    
    
    public static int mostrarQuery(String storeProcedure, ArrayList<Object[]> params) {
        int id = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(getConnectionString());
            System.out.println("Conexión exitosa");
 
            String SQL = "{call "+getDbName()+".dbo." +storeProcedure+"}";
            CallableStatement cs = con.prepareCall(SQL);
            
            for (Object[] param : params ) {
                if(param[0].equals("String") ) {
                    String columnName = String.valueOf(param[1]);
                    String columnValue = String.valueOf(param[2]);
                    
                    cs.setString(columnName, columnValue);
                } else if(param[0].equals("int")) {
                    String columnName = String.valueOf(param[1]);
                    int columnValue = (int)(param[2]);
                    
                    cs.setInt(columnName, columnValue);
                } /*else if(param.equals("date")) {
                    //cs.setDate("capacidad", 100);
                }*/
                
            }
            
           
            ResultSet rs = cs.executeQuery();
              while (rs.next()) {
               System.out.println("Id: " + rs.getString(1));//id
                System.out.println("Nombre: " + rs.getString(2));//nombre
              
            }
             
            id = 1;
            rs.close();
 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(id);
        return id;
    }
    
    
}
