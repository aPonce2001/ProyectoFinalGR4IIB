package CapaDatos;


import CapaComun.*;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//@authors Dennis David Lincango, Kelvin Ojeda, Andrés Ponce

public class Dt_ClsReserva extends Dt_ClsConexion {

    public Dt_ClsReserva() {
    }

     
    public int insertarReserva(int id_cliente_fk, int id_asiento_fk, int id_comida_fk, int id_pais_origen_fk, int id_pais_destino_fk) {

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
        
        Object[] datosIdPaisOrigen = new Object[3];
        datosIdPaisOrigen[0] = "int";
        datosIdPaisOrigen[1] = "id_Pais_Origen_fk";
        datosIdPaisOrigen[2] = id_pais_origen_fk;
        
        Object[] datosIdPaisDestino = new Object[3];
        datosIdPaisDestino[0] = "int";
        datosIdPaisDestino[1] = "id_Pais_Destino_fk";
        datosIdPaisDestino[2] = id_pais_destino_fk;
        
        parametros.add(datosIdCliente);
        parametros.add(datosIdAsiento);
        parametros.add(datosIdComida);
        parametros.add(datosIdPaisOrigen);
        parametros.add(datosIdPaisDestino);
 
        return executeQuery("insertarReserva(?,?,?,?,?)", parametros);

    }
    
    public int actualizarReserva(int id, int id_cliente_fk, int id_asiento_fk, int id_comida_fk, int id_pais_origen_fk, int id_pais_destino_fk) {
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
        
        Object[] datosIdPaisOrigen = new Object[3];
        datosIdPaisOrigen[0] = "int";
        datosIdPaisOrigen[1] = "id_Pais_Origen_fk";
        datosIdPaisOrigen[2] = id_pais_origen_fk;
        
        Object[] datosIdPaisDestino = new Object[3];
        datosIdPaisDestino[0] = "int";
        datosIdPaisDestino[1] = "id_Pais_Destino_fk";
        datosIdPaisDestino[2] = id_pais_destino_fk;
        
        parametros.add(datosId);
        parametros.add(datosIdCliente);
        parametros.add(datosIdAsiento);
        parametros.add(datosIdComida);
        parametros.add(datosIdPaisOrigen);
        parametros.add(datosIdPaisDestino);
 
        return executeQuery("actualizarReserva(?,?,?,?,?,?)", parametros);

    }

    public void borrarReserva(int id_reserva) {

        ArrayList<Object[]> parametros = new ArrayList<Object[]>();

        Object[] datosIdReserva = new Object[3];
        datosIdReserva[0] = "int";
        datosIdReserva[1] = "id_reserva";
        datosIdReserva[2] = id_reserva;
        
        parametros.add(datosIdReserva);
        
        executeQuery("borrarReserva(?)", parametros);
    }

   public List<Cm_ClsReserva> mostrarReservasXIdCliente(int id_cliente_fk) {
        List<Cm_ClsReserva> listaReserva = new ArrayList<Cm_ClsReserva>();
        String storeProcedure = "mostrarReservaXId(?)";

        int id = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(getConnectionString());

            String SQL = "{call "+getDbName()+".dbo." + storeProcedure + "}";
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
                }else{ 
                }
            }

            ResultSet rs = cs.executeQuery();

            
            while (rs.next()) {
                listaReserva.add(new Cm_ClsReserva(
                        (int) rs.getInt("id"),
                        (Date) rs.getDate("fecha"),
                        (int) rs.getInt("id_cliente_fk"),
                        (int) rs.getInt("id_asiento_fk"),
                        (int) rs.getInt("id_comida_fk"),
                        (int) rs.getInt("id_pais_origen_fk"),
                        (int) rs.getInt("id_pais_destino_fk")
                ));  
            }

            id = 1;
            rs.close();

        } catch (Exception e) {
        }
      
        return listaReserva;
    }
   
     public List<Cm_ClsReserva> mostrarReservaAll() {
       List<Cm_ClsReserva> listaReserva = new ArrayList<Cm_ClsReserva>();
        String storeProcedure = "mostrarReservaAll()";

        int id = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(getConnectionString());

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
            }

            ResultSet rs = cs.executeQuery();

            
            while (rs.next()) {
                listaReserva.add(new Cm_ClsReserva(
                        (int) rs.getInt("id"),
                        (Date) rs.getDate("fecha"),
                        (int) rs.getInt("id_cliente_fk"),
                        (int) rs.getInt("id_asiento_fk"),
                        (int) rs.getInt("id_comida_fk"),
                        (int) rs.getInt("id_pais_origen_fk"),
                        (int) rs.getInt("id_pais_destino_fk")
                ));
                 
            }

            id = 1;
            rs.close();
        } catch (Exception e) {
        }

        return listaReserva;
     }

}
