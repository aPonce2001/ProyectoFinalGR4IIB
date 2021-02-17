
package Fuentes;

//@author Andrés Ponce

import java.sql.*;
import java.util.ArrayList;
 
public class Clase implements Entidad{
    
    private int idClase;
    private String nombreClase;

    public Clase() {
        this.idClase = 0;
        this.nombreClase = "";
    }

    public Clase(int tipo, String nombreClase) {
        this.idClase = tipo;
        this.nombreClase = nombreClase;
    }

    public int getTipo() {
        return idClase;
    }

    public void setTipo(int tipo) {
        this.idClase = tipo;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }
    
    //Operaciones para realizar los comandos de código SQL:
    
    @Override
    public String getNombreEntidad() {
        return "CLASE";
    }

    @Override
    public String getDatos() {
        return ("(" + this.idClase +",\'" + this.nombreClase +"\')");
    }

    @Override
    public String toQuery() {
        return ("ID_CLASE = " + this.idClase + ", NOMBRE_CLASE = \'" + this.nombreClase + "\'");
    }
    
    @Override
    public Clase obtenerEntidadDeBase(int ID, Conexion conexion) {
        Clase clase = new Clase();
        try{
            ResultSet resultado = conexion.getDeclaracion().executeQuery("SELECT * FROM CLASE WHERE ID_CLASE = " + ID);
            while(resultado.next()){
                clase = new Clase(resultado.getInt(1), resultado.getString(2));
                return clase;
            }
        }catch(SQLException ex){
        }
        return clase;
    }

    @Override
    public Clase obtenerEntidadDeBase(String ID, Conexion conexion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public ArrayList obtenerListaObjectos(Conexion conexion) {
       ArrayList<Clase> clases = new ArrayList<Clase>();
       Clase clase = new Clase();
        try{
            ResultSet resultado = conexion.getDeclaracion().executeQuery("SELECT * FROM CLASE");
            while(resultado.next()){
                clase = new Clase(resultado.getInt(1), resultado.getString(2));
                clases.add(clase);
            }
        }catch(SQLException ex){
        }
        return clases;
    }
    
    @Override
    public String toString() {
        return "Clase\n" + "Tipo:" + idClase + "\nNombre de la clase: " + nombreClase;
    }
}
