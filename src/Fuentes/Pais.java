
package Fuentes;

//@author Andrés Ponce

import java.sql.*;
import java.util.ArrayList;
 
public class Pais implements Entidad{
    private int idPais;
    private String nombrePais;

    public Pais() {
        this.idPais = 0;
        this.nombrePais = "";
    }

    public Pais(int id_Pais, String nombrePais) {
        this.idPais = id_Pais;
        this.nombrePais = nombrePais;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int id_Pais) {
        this.idPais = id_Pais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    //Operaciones para realizar los comandos de código SQL:
    
    @Override
    public String getNombreEntidad() {
        return "PAIS";
    }

    @Override
    public String getDatos() {
        return ("(" + this.idPais +",\'" + this.nombrePais +"\')");
    }
    
    @Override
    public String toQuery() {
        return ("ID_PAIS = " + this.idPais + ", NOMBRE_PAIS = \'" + this.nombrePais + "\'");
    }

    @Override
    public Pais obtenerEntidadDeBase(int ID, Conexion conexion) {
        Pais pais = new Pais();
        try{
            ResultSet resultado = conexion.getDeclaracion().executeQuery("SELECT * FROM PAIS WHERE ID_PAIS = " + ID);
            while(resultado.next()){
                int idPais = resultado.getInt(1);
                String nombrePais = resultado.getString(2);
                pais = new Pais(idPais, nombrePais);
                return pais;
            }
        }catch(SQLException ex){
        }
        return pais;
    }

    @Override
    public Pais obtenerEntidadDeBase(String ID, Conexion conexion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public ArrayList obtenerListaObjectos(Conexion conexion) {
       ArrayList<Pais> paises = new ArrayList<Pais>();
       Pais pais = new Pais();
        try{
            ResultSet resultado = conexion.getDeclaracion().executeQuery("SELECT * FROM PAIS");
            while(resultado.next()){
                int idPais = resultado.getInt(1);
                String nombrePais = resultado.getString(2);
                pais = new Pais(idPais, nombrePais);
                paises.add(pais);
            }
        }catch(SQLException ex){
        }
        return paises;
    }
    
    @Override
    public String toString() {
        return "Código ISO 3166-1: " + idPais + "\nNombre: " + nombrePais;
    }
}
