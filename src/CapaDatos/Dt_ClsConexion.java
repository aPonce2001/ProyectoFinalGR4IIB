package CapaDatos;

import java.sql.CallableStatement;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Dennis David
 */
public class Dt_ClsConexion {

    public Dt_ClsConexion() {
    }

    public static int executeQuery(String storeProcedure, List<Object> params) {
        int id = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionURL = "jdbc:sqlserver://localhost;"
                    + "databaseName=DB_Viaje;"
                    + "user=admin;"
                    + "password=Admin1234;";
            Connection con = DriverManager.getConnection(connectionURL);
            System.out.println("Conexión exitosa");

            String SQL = "{call DB_Viaje.dbo.insertarClase(?)}";
            CallableStatement cs = con.prepareCall(SQL);
            cs.setString("nombre", "Clase baja");
            cs.setInt("capacidad", 100);
            ResultSet rs = cs.executeQuery();
            /*  while (rs.next()) {
               // System.out.println(rs.getString(1));
                //System.out.println(cs);
            }
             */
            id = 1;
            rs.close();

            //           Statement st = con.createStatement();
            //         ResultSet rs = st.executeQuery("select * from RESERVA");
            //       System.out.println("Tabla vuelos\n");
            //     while (rs.next()) {
            //     int id_reserva = rs.getInt(1);
            //   System.out.println(id_reserva);
            //   }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(id);
        return id;
    }
}
