package CapaDatos;

import CapaComun.Cm_ClsAsiento;
import CapaComun.Cm_ClsCliente;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dennis David
 */
public class Dt_ClsAsiento {

    public Dt_ClsAsiento() {
    }
    
    public int insertarAsiento (String ubicacion,String estado,int id_clase_FK ){
        return 0;
        
    }
    
    public int actualizarAsiento (int id,String ubicacion,String estado,int id_clase_FK ){
        return 0;
        
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
            String connectionURL = "jdbc:sqlserver://localhost;"
                    + "databaseName=DB_Viaje;"
                    + "user=admin;"
                    + "password=Admin1234;";
            Connection con = DriverManager.getConnection(connectionURL);
            System.out.println("Conexión exitosa");

            String SQL = "{call DB_Viaje.dbo." + storeProcedure + "}";
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

 
}