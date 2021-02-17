package CapaDatos;

import CapaComun.Cm_ClsComboItem;
import CapaComun.Cm_ClsComida;
import CapaComun.Cm_ClsPais;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

/**
 * @author Dennis David
 */
public class Dt_ClsComida {

    public Dt_ClsComida() {
    }
    
    public void insertarComida (String nombre){
        
    }
    
    public void actualizarComida (int id,String nombre){
        
    }
    
    public void borrarComida (int id){
        
    }
  
    
    public List<Cm_ClsComida> mostrarComidaAll(JComboBox jCBReservaComida) {
        List<Cm_ClsComida> listaComida = new ArrayList<Cm_ClsComida>();
        String storeProcedure = "mostrarComidaAll()";

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

            //LLenamos nuestro ComboBox
            jCBReservaComida.addItem("Seleccione una opción");
            while (rs.next()) {

                //   System.out.println("Id: " + rs.getString(1));//id
                // System.out.println("Nombre: " + rs.getString(2));//nombre
                listaComida.add(new Cm_ClsComida(
                        (int) rs.getInt("id"),
                        (String) rs.getString("nombre")
                ));
                
                 
                 jCBReservaComida.addItem(new Cm_ClsComboItem(rs.getString("nombre"), String.valueOf(rs.getInt("id"))));
            }

            id = 1;
            rs.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listaComida;

    }
}
