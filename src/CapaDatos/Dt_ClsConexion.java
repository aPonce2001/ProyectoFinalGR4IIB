package CapaDatos;

import java.sql.*;
import java.util.ArrayList;

//@authors Dennis David Lincango, Kelvin Ojeda, Andrés Ponce

public class Dt_ClsConexion {

    public Dt_ClsConexion() {
    }
    
    public static String getConnectionString() {
        String connectionURL = "jdbc:sqlserver://sql5054.site4now.net;"
                    + "databaseName="+getDbName()+";"
                    + "user=DB_A7086C_Viaje_admin;"
                    + "password=Admin1234;";

        return connectionURL;
    }
    
    public static String getDbName() {
        String dbName = "DB_A7086C_Viaje";
        return dbName;
    }

    public static int executeQuery(String storeProcedure, ArrayList<Object[]> params) {
        int id = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            Connection con = DriverManager.getConnection(getConnectionString());
            
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
                }
                
            }
            
            cs.execute();

            id = 1;
            cs.close();

        } catch (Exception e) {

        }
        System.out.println(id);
        return id;
    }
    
    
    public static int mostrarQuery(String storeProcedure, ArrayList<Object[]> params) {
        int id = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(getConnectionString());
 
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
                }
                
            }
             
            ResultSet rs = cs.executeQuery();
             
            id = 1;
            rs.close();
 
        } catch (Exception e) {
        }
        return id;
    }  
}
