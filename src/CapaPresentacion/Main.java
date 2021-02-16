/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dennis David
 */
public class Main {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      /*  Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost;"
                + "databaseName=DB_Viaje;"
                + "user=admin;"
                + "password=Admin1234;";
        
        Connection con = DriverManager.getConnection(connectionURL);
        System.out.println("Conexión exitosa");
        */
        int id = 0;
        try {
          
           

            
            //String SQL = "{call DB_Viaje.dbo.insertarClase(?,?)}";
            /*String SQL = "{call DB_Viaje.dbo.actualizarClase(?,?,?)}";
            CallableStatement cs = con.prepareCall(SQL);
            cs.setInt("id_clase", 4);
            cs.setString("nombre_clase", "Clase baja");          Actualizar
            cs.setInt("capacidad_clase", 1234);
            cs.execute();*/
            
            /*
            String SQL = "{call DB_Viaje.dbo.eliminarClase(?)}";
            CallableStatement cs = con.prepareCall(SQL);
            cs.setInt("id_clase", 7);                      eLIMINAR
            cs.execute();*/
            
           /* String SQL = "{call DB_Viaje.dbo.mostrarClaseXId(?)}";
            CallableStatement cs = con.prepareCall(SQL);
            cs.setInt("id_clase", 3);
            cs.executeQuery();*/
          /* 
           String SQL = "{call DB_Viaje.dbo.mostrarClaseAll()}";
            CallableStatement cs = con.prepareCall(SQL);
           
            cs.executeQuery();
            
            ResultSet rs = cs.executeQuery();
              while (rs.next()) {
                System.out.println(rs.getString(1)); //columna id
                System.out.println(rs.getString(2)); //columna nombre
                System.out.println(rs.getString(3)); //columna capacidad
                System.out.println(cs);
            }

            id = 1;
            cs.close();
          */  
            
            
            
            

            //           Statement st = con.createStatement();
            //         ResultSet rs = st.executeQuery("select * from RESERVA");
            //       System.out.println("Tabla vuelos\n");
            //     while (rs.next()) {
            //     int id_reserva = rs.getInt(1);
            //   System.out.println(id_reserva);
            //   }
        } catch (Exception e) {
            System.out.println("Error es: " + e.getMessage());
            
        }
        System.out.println(id);
        //return id;
        
        JFLogin jfLogin = new JFLogin();
        jfLogin.setVisible(true);
     
        
    }
}
