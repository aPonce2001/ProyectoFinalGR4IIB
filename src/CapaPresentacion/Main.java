/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaPresentacion;

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
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://localhost;"
                + "databaseName=DB_Viaje;"
                + "user=admin;"
                + "password=Admin1234;";
        
        Connection con = DriverManager.getConnection(connectionURL);
        System.out.println("Conexión exitosa");
        
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from RESERVA");
        System.out.println("Tabla vuelos\n");
        while (rs.next()) {
            int id_reserva = rs.getInt(1);
            // int pasaporte= rs.getInt(2);
            //String idVuelo=  rs.getString(3);
            //int asiento= rs.getInt(4);
            //System.out.println(id_reserva+ " "+pasaporte+" "+idVuelo+" "+asiento);
            System.out.println(id_reserva);
        }
        
        JFLogin jfLogin = new JFLogin();
        jfLogin.setVisible(true);
        
    }
}
