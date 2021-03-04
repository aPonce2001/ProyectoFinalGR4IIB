package CapaDatos;


import CapaComun.Cm_ClsCliente;
import CapaComun.Cm_ClsReserva;
import static CapaDatos.Dt_ClsConexion.executeQuery;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Dennis David
 */
public class Dt_ClsReserva {

    public Dt_ClsReserva() {
    }

     
    public int insertarReserva(int id_cliente_fk, int id_asiento_fk, int id_comida_fk) {

        ArrayList<Object[]> parametros = new ArrayList<Object[]>();

        Object[] datosIdCliente = new Object[3];
        datosIdCliente[0] = "int";
        datosIdCliente[1] = "id_cliente_fk";
        datosIdCliente[2] = id_cliente_fk;

        Object[] datosIdAsiento = new Object[3];
        datosIdAsiento[0] = "int";
        datosIdAsiento[1] = "id_asiento_fk";
        datosIdAsiento[2] = id_asiento_fk;

        Object[] datosIdComida = new Object[3];
        datosIdComida[0] = "int";
        datosIdComida[1] = "id_comida_fk";
        datosIdComida[2] = id_comida_fk;
        
        parametros.add(datosIdCliente);
        parametros.add(datosIdAsiento);
        parametros.add(datosIdComida);
 
        return executeQuery("insertarReserva(?,?,?)", parametros);

    }

    public int actualizarReserva(int id, int id_cliente_fk, int id_asiento_fk, int id_comida_fk) {
        ArrayList<Object[]> parametros = new ArrayList<Object[]>();
        Object[] datosId = new Object[4];
        datosId[0] = "int";
        datosId[1] = "id_reserva";
        datosId[2] = id;

        Object[] datosIdCliente = new Object[3];
        datosIdCliente[0] = "int";
        datosIdCliente[1] = "id_cliente_fk";
        datosIdCliente[2] = id_cliente_fk;

        Object[] datosIdAsiento = new Object[3];
        datosIdAsiento[0] = "int";
        datosIdAsiento[1] = "id_asiento_fk";
        datosIdAsiento[2] = id_asiento_fk;

        Object[] datosIdComida = new Object[3];
        datosIdComida[0] = "int";
        datosIdComida[1] = "id_comida_fk";
        datosIdComida[2] = id_comida_fk;
        
        parametros.add(datosId);
        parametros.add(datosIdCliente);
        parametros.add(datosIdAsiento);
        parametros.add(datosIdComida);
 
        return executeQuery("actualizarReserva(?,?,?,?)", parametros);

    }

    public void borrarReserva(int id) {

    }

   public List<Cm_ClsReserva> mostrarReservasXIdCliente(int id_cliente_fk) {
        List<Cm_ClsReserva> listaReserva = new ArrayList<Cm_ClsReserva>();
        String storeProcedure = "mostrarReservaXId(?)";

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
            datosNombre[1] = "id_cliente_fk";
            datosNombre[2] = id_cliente_fk;
            
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
                listaReserva.add(new Cm_ClsReserva(
                        (int) rs.getInt("id"),
                        (Date) rs.getDate("fecha"),
                        (int) rs.getInt("id_cliente_fk"),
                        (int) rs.getInt("id_asiento_fk"),
                        (int) rs.getInt("id_comida_fk")
                        
                ));
                 
            }

            id = 1;
            rs.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listaReserva;

    }
   
     public List<Cm_ClsReserva> mostrarReservaAll() {
       List<Cm_ClsReserva> listaReserva = new ArrayList<Cm_ClsReserva>();
        String storeProcedure = "mostrarReservaXId(?)";

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

            
            while (rs.next()) {

                //   System.out.println("Id: " + rs.getString(1));//id
                // System.out.println("Nombre: " + rs.getString(2));//nombre
                listaReserva.add(new Cm_ClsReserva(
                        (int) rs.getInt("id"),
                        (Date) rs.getDate("fecha"),
                        (int) rs.getInt("id_cliente_fk"),
                        (int) rs.getInt("id_asiento_fk"),
                        (int) rs.getInt("id_comida_fk")
                        
                ));
                 
            }

            id = 1;
            rs.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listaReserva;
     }

}
