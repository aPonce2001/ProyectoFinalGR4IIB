package CapaDatos;

import CapaComun.Cm_ClsCliente;
import CapaComun.Cm_ClsPais;
import static CapaDatos.Dt_ClsConexion.executeQuery;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author Dennis David
 */
public class Dt_ClsCliente {

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

    public void actualizarCliente(int id, String nombre, String apellido, String cedula, String passwd, int id_pais_fk) {

    }

    public void borrarCliente(int id) {

    }

    public List<Cm_ClsCliente> mostrarClienteAll() {
        List<Cm_ClsCliente> listaCliente = new ArrayList<Cm_ClsCliente>();
        String storeProcedure = "mostrarClienteAll()";

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

}
