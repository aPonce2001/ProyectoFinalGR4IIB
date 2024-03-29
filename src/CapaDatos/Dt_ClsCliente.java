package CapaDatos;

import CapaComun.*;
import java.sql.*;
import java.util.*;

//@authors Dennis David Lincango, Kelvin Ojeda, Andrés Ponce

public class Dt_ClsCliente extends Dt_ClsConexion {

    public Dt_ClsCliente() {
    }

    public int insertarCliente(String nombre, String apellido, String cedula, String passwd, int id_pais_fk) {

        ArrayList<Object[]> parametros = new ArrayList<Object[]>();
        Object[] datosNombre = new Object[3];
        datosNombre[0] = "String";
        datosNombre[1] = "nombre_cliente";
        datosNombre[2] = nombre;

        Object[] datosApellido = new Object[3];
        datosApellido[0] = "String";
        datosApellido[1] = "apellido_cliente";
        datosApellido[2] = apellido;

        Object[] datosCedula = new Object[3];
        datosCedula[0] = "String";
        datosCedula[1] = "cedula_cliente";
        datosCedula[2] = cedula;

        Object[] datosPasswd = new Object[3];
        datosPasswd[0] = "String";
        datosPasswd[1] = "passwd_cliente";
        datosPasswd[2] = passwd;

        Object[] datosPaisFk = new Object[3];
        datosPaisFk[0] = "int";
        datosPaisFk[1] = "id_pais_fk";
        datosPaisFk[2] = id_pais_fk;

        parametros.add(datosNombre);
        parametros.add(datosApellido);
        parametros.add(datosCedula);
        parametros.add(datosPasswd);
        parametros.add(datosPaisFk);
       
        return executeQuery("insertarCliente(?,?,?,?,?)", parametros);

    }

    public int actualizarCliente(int id, String nombre, String apellido, String cedula, String passwd, int id_pais_fk) {
        ArrayList<Object[]> parametros = new ArrayList<Object[]>();

        Object[] datosId = new Object[3];
        datosId[0] = "int";
        datosId[1] = "id_cliente";
        datosId[2] = id;

        Object[] datosNombre = new Object[3];
        datosNombre[0] = "String";
        datosNombre[1] = "nombre_cliente";
        datosNombre[2] = nombre;

        Object[] datosApellido = new Object[3];
        datosApellido[0] = "String";
        datosApellido[1] = "apellido_cliente";
        datosApellido[2] = apellido;

        Object[] datosCedula = new Object[3];
        datosCedula[0] = "String";
        datosCedula[1] = "cedula_cliente";
        datosCedula[2] = cedula;

        Object[] datosPasswd = new Object[3];
        datosPasswd[0] = "String";
        datosPasswd[1] = "passwd_cliente";
        datosPasswd[2] = passwd;

        Object[] datosPaisFk = new Object[3];
        datosPaisFk[0] = "int";
        datosPaisFk[1] = "id_pais_fk";
        datosPaisFk[2] = id_pais_fk;

        parametros.add(datosId);
        parametros.add(datosNombre);
        parametros.add(datosApellido);
        parametros.add(datosCedula);
        parametros.add(datosPasswd);
        parametros.add(datosPaisFk);
       
        return executeQuery("actualizarCliente(?,?,?,?,?,?)", parametros);
        
    }

    public void borrarCliente(int id) {

    }

    public List<Cm_ClsCliente> mostrarClienteAll() {
        List<Cm_ClsCliente> listaCliente = new ArrayList<Cm_ClsCliente>();
        String storeProcedureName = "mostrarClienteAll()";

        int id = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(getConnectionString());

            String SQL = "{call "+getDbName()+".dbo." + storeProcedureName + "}";
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
                listaCliente.add(new Cm_ClsCliente(
                        (int) rs.getInt("id"),
                        (String) rs.getString("nombre"),
                        (String) rs.getString("apellido"),
                        (String) rs.getString("cedula"),
                        (String) rs.getString("passwd"),
                        (int) rs.getInt("id_pais_fk")
                ));   
            }

            id = 1;
            rs.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listaCliente;

    }
    
    public Cm_ClsCliente inSesionXUserPass(String cedula, String passwd){
        Cm_ClsCliente usuarioLogeado = new Cm_ClsCliente();
        String storeProcedureName =  "inSesionXUserPass(?,?)";
        
         int id = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(getConnectionString());
            System.out.println("Conexión exitosa");

            String SQL = "{call "+getDbName()+".dbo." + storeProcedureName + "}";
            CallableStatement cs = con.prepareCall(SQL);
            ArrayList<Object[]> parametros = new ArrayList<Object[]>();

            Object[] datosNombre = new Object[3];
            datosNombre[0] = "String";
            datosNombre[1] = "cedula_cliente";
            datosNombre[2] = cedula;

            Object[] datosApellido = new Object[3];
            datosApellido[0] = "String";
            datosApellido[1] = "passwd_cliente";
            datosApellido[2] = passwd;

            parametros.add(datosNombre);
            parametros.add(datosApellido);
   
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
                usuarioLogeado = new Cm_ClsCliente(
                        (int) rs.getInt("id"),
                        (String) rs.getString("nombre"),
                        (String) rs.getString("apellido"),
                        (String) rs.getString("cedula"),
                        (String) rs.getString("passwd"),
                        (int) rs.getInt("id_pais_fk")
                );     
            }

            id = 1;
            rs.close();

        } catch (Exception e) {
        }

        return usuarioLogeado; 
    }
}
