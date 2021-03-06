/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import CapaComun.Cm_ClsComboItem;
import CapaComun.Cm_ClsPais;
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
public class Dt_ClsPais extends Dt_ClsConexion {

    public Dt_ClsPais() {
    }

    public int insertarPais(String nombre) {
        return 0;

    }

    public int actualizarPais(int id, String nombre) {
        return 0;

    }

    public int borrarPais(int id) {
        return 0;

    }

    public List<Cm_ClsPais> mostrarPaisAll(JComboBox jCBPais, Boolean isUpdatedAt, int selectedIdx) {
        List<Cm_ClsPais> listaPais = new ArrayList<Cm_ClsPais>();
        String storeProcedure = "mostrarPaisAll()";

        int id = 0;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(getConnectionString());
            System.out.println("Conexión exitosa");

            String SQL = "{call DB_A7086C_Viaje.dbo." + storeProcedure + "}";
            CallableStatement cs = con.prepareCall(SQL);
            ArrayList<Object[]> parametros = new ArrayList<Object[]>();

            for (Object[] param : parametros) {
                System.out.println("param[0] PAIS:" + param[0]);
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
            jCBPais.addItem("Seleccione una opción");
            while (rs.next()) {

                //   System.out.println("Id: " + rs.getString(1));//id
                // System.out.println("Nombre: " + rs.getString(2));//nombre
                listaPais.add(new Cm_ClsPais(
                        (int) rs.getInt("id"),
                        (String) rs.getString("nombre")
                ));
                
                 
                 jCBPais.addItem(new Cm_ClsComboItem(rs.getString("nombre"), String.valueOf(rs.getInt("id"))));
            }
            
            if(isUpdatedAt) {
                jCBPais.setSelectedIndex(selectedIdx);
            }

            id = 1;
            rs.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return listaPais;

    }

}
