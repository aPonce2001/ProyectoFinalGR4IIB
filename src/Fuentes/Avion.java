
package Fuentes;

//@author Andrés Ponce

import java.sql.*;
import java.util.ArrayList;
 
public class Avion implements Entidad{
    private int idAvion;
    private String descripcion;

    public Avion() {
        this.idAvion = 0;
        this.descripcion = "";
    }

    public Avion(int idAvion, String descripcion) {
        this.idAvion = idAvion;
        this.descripcion = descripcion;
    }
    
    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    //Operaciones para realizar los comandos de código SQL:
    
    @Override
    public String getNombreEntidad() {
        return "AVION";
    }

    @Override
    public String getDatos() {
        return ("(" + this.idAvion +",\'" + descripcion +"\')");
    }
    
    @Override
    public String toQuery() {
        return ("ID_AVION = " + this.idAvion + ", DESCRIPCION = \'" + this.descripcion + "\'");
    }
    
    @Override
    public Avion obtenerEntidadDeBase(int ID, Conexion conexion) {
        Avion avion = new Avion();
        try{
            ResultSet resultado = conexion.getDeclaracion().executeQuery("SELECT * FROM AVION WHERE ID_AVION = " + ID);
            while(resultado.next()){
                avion.setIdAvion(resultado.getInt(1));
                avion.setDescripcion(resultado.getString(2));
                return avion;
            }
        }catch(SQLException ex){
        }
        return avion;
    }

    @Override
    public Avion obtenerEntidadDeBase(String ID, Conexion conexion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public ArrayList obtenerListaObjectos(Conexion conexion) {
       ArrayList<Avion> aviones = new ArrayList<Avion>();
       Avion avion = new Avion();
        try{
            ResultSet resultado = conexion.getDeclaracion().executeQuery("SELECT * FROM AVION");
            while(resultado.next()){
                avion.setIdAvion(resultado.getInt(1));
                avion.setDescripcion(resultado.getString(2));
                aviones.add(avion);
            }
        }catch(SQLException ex){
        }
        return aviones;
    }
    
    @Override
    public String toString() {
        return "Avion No." + idAvion + "\nDescripción: " + this.descripcion;
    }

}
