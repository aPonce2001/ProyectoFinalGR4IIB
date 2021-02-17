
package Fuentes;

//@author Andrés Ponce

import java.sql.*;
import java.util.ArrayList;
 
public class Vuelo implements Entidad{
    private String idVuelo;
    private Avion avion;
    private String ruta;
    private boolean estadoDeVuelo;

    public Vuelo() {
        this.idVuelo = "";
        this.avion = new Avion();
        this.ruta = "";
        this.estadoDeVuelo = false;
    }

    public Vuelo(String idVuelo, Avion avion, String ruta, boolean estadoDeVuelo) {
        this.idVuelo = idVuelo;
        this.avion = avion;
        this.ruta = ruta;
        this.estadoDeVuelo = estadoDeVuelo;
    }

    public String getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(String idVuelo) {
        this.idVuelo = idVuelo;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public boolean isEstadoDeVuelo() {
        return estadoDeVuelo;
    }

    public void setEstadoDeVuelo(boolean estadoDeVuelo) {
        this.estadoDeVuelo = estadoDeVuelo;
    }

    //Operaciones para realizar los comandos de código SQL:
    @Override
    public String getNombreEntidad() {
        return "VUELO";
    }

    @Override
    public String getDatos() {
        return ("(\'" + this.idVuelo +"\'," + this.avion.getIdAvion() + ",\'" + this.getRuta() +"\',\'" + this.estadoDeVuelo + "\')");
    }

    @Override
    public Vuelo obtenerEntidadDeBase(int ID, Conexion conexion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vuelo obtenerEntidadDeBase(String ID, Conexion conexion) {
        Vuelo vuelo = new Vuelo();
        Avion avion = new Avion();
        try{
            ResultSet resultado = conexion.getDeclaracion().executeQuery("SELECT * FROM VUELO WHERE ID_VUELO = \'" + ID + "\'");
            while(resultado.next()){
                vuelo.setIdVuelo(resultado.getString(1));
                vuelo.setAvion(avion.obtenerEntidadDeBase(resultado.getString(2), conexion));
                vuelo.setRuta(resultado.getString(3));
                vuelo.setEstadoDeVuelo(resultado.getBoolean(4));
                return vuelo;
            }
        }catch(SQLException ex){
        }
        return vuelo;
    }

    @Override
    public ArrayList obtenerListaObjectos(Conexion conexion) {
        ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();
        Vuelo vuelo = new Vuelo();
        Avion avion = new Avion();
        try{
            ResultSet resultado = conexion.getDeclaracion().executeQuery("SELECT * FROM VUELO");
            while(resultado.next()){
                vuelo.setIdVuelo(resultado.getString(1));
                vuelo.setAvion(avion.obtenerEntidadDeBase(resultado.getString(2), conexion));
                vuelo.setRuta(resultado.getString(3));
                vuelo.setEstadoDeVuelo(resultado.getBoolean(4));
                vuelos.add(vuelo);
                return vuelos;
            }
        }catch(SQLException ex){
        }
        return vuelos;
    }

    
    
    @Override
    public String toQuery() {
        return ("ID_VUELO = \'" + this.idVuelo + "\', ID_AVION = " + this.avion.getIdAvion() + ", RUTA = \'" + this.ruta + "\', ESTADODEVUELO = \'" + this.estadoDeVuelo + "\'");
    }
    
    @Override
    public String toString() {
        return "Vuelo No. " + idVuelo + "\nAvión: " + avion.toString() + "\nRuta: " + ruta + "\nEstado de vuelo: " + (estadoDeVuelo?("En curso"):("Por empezar"));
    }

}
