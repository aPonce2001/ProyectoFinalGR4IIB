package Fuentes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//@author Kelvin Ojeda

public class Main {

   
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL= "jdbc:sqlserver://sql5054.site4now.net;databaseName=DB_A6F631_AEREOPUERTOBD;user=DB_A6F631_AEREOPUERTOBD_admin;password=P@ssw0rd;";
        Connection con = DriverManager.getConnection(connectionURL);
        System.out.println("Conexión exitosa");
        
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from RESERVA");
        System.out.println("Tabla vuelos\n");
        while(rs.next()){
            int id_reserva = rs.getInt(1);
            int pasaporte= rs.getInt(2);
            String idVuelo=  rs.getString(3);
            int asiento= rs.getInt(4);
            System.out.println(id_reserva+ " "+pasaporte+" "+idVuelo+" "+asiento);
        }
    }
    
}
