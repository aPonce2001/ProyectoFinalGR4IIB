
package Fuentes;

//@author Andrés Ponce

import java.sql.*;
import java.util.ArrayList;

public class Asiento implements Entidad{
    private int idAsiento;
    private Clase clase;
    private Avion avion;
    private int numero;
    private String ubicacion;
    private boolean estado;

    public Asiento() {
        this.idAsiento = 0;
        this.clase = new Clase();
        this.avion = new Avion();
        this.numero = 0;
        this.ubicacion = "";
        this.estado = false;
    }

    public Asiento(int idAsiento, Clase clase, Avion avion, int numero, String ubicacion, boolean estado) {
        this.idAsiento = idAsiento;
        this.clase = clase;
        this.avion = avion;
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.estado = estado;
    }

    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    //Operaciones para realizar los comandos de código SQL:
    
    @Override
    public String getNombreEntidad() {
        return "ASIENTO";
    }

    @Override
    public String getDatos() {
        return ("(" + this.idAsiento +"," + this.clase.getTipo()+ "," + this.avion.getIdAvion() + "," + this.numero + ",\'" + this.ubicacion + "\',\'" + this.estado + "\')");
    }

    @Override
    public String toQuery() {
        return("ID_ASIENTO = " + this.idAsiento + ", TIPO = " + this.clase.getTipo() + ", ID_AVION = " + this.avion.getIdAvion() + ", NUMERO = " + this.numero + ", UBICACION = \'" + this.ubicacion + "\', ESTADO = \'" + this.estado + "\'");
    }

    @Override
    public Asiento obtenerEntidadDeBase(int ID, Conexion conexion) {
        Asiento asiento = new Asiento();
        Clase clase = new Clase();
        Avion avion = new Avion();
        try{
            ResultSet resultado = conexion.getDeclaracion().executeQuery("SELECT * FROM ASIENTO WHERE ID_ASIENTO = " + ID);
            while(resultado.next()){
                int idAsiento = resultado.getInt(1);
                clase = clase.obtenerEntidadDeBase(resultado.getInt(2), conexion);
                avion = avion.obtenerEntidadDeBase(resultado.getInt(3), conexion);
                int numero = resultado.getInt(4);
                String ubicacion = resultado.getString(5);
                boolean estado = resultado.getBoolean(6);
                asiento = new Asiento(idAsiento, clase, avion, numero, ubicacion, estado);
            }
        }catch(SQLException ex){
        }
        return asiento;
    }

    @Override
    public Asiento obtenerEntidadDeBase(String ID, Conexion conexion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public ArrayList obtenerListaObjectos(Conexion conexion) {
        ArrayList<Asiento> asientos = new ArrayList<Asiento>();
        Asiento asiento = new Asiento();
        Clase clase = new Clase();
        Avion avion = new Avion();
        try{
            //Conexion conexion2 = conexion.clone();
            //Conexion conexion3 = conexion.clone();
            ResultSet resultado = conexion.getDeclaracion().executeQuery("SELECT * FROM ASIENTO");
            while(resultado.next()){
                int idAsiento = resultado.getInt(1);
                boolean estado = resultado.getBoolean(6);
                int numero = resultado.getInt(4);
                String ubicacion = resultado.getString(5);
                clase = clase.obtenerEntidadDeBase(resultado.getInt(2), conexion);
                avion = avion.obtenerEntidadDeBase(resultado.getInt(3), conexion);
                asiento = new Asiento(idAsiento, clase, avion, numero, ubicacion, estado);
                asientos.add(asiento);
            }
        }catch(SQLException ex){
        }
        return asientos;
    }
 
    @Override
    public String toString() {
        return "Asiento No. " + idAsiento + "\nClase: " + clase + "\nAvión: " + avion + "\nNúmero de asiento: " + numero + "\nUbicación: " + ubicacion + "\nEstado: " + (estado?("Ocupado"):("Disponible"));
    }
}
