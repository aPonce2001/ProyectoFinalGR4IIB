
package Fuentes;

//@author Andrés Ponce

import java.sql.ResultSet;
import java.sql.SQLException;

 
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return "Código ISO 3166-1: " + idPais + "\nNombre: " + nombrePais;
    }
}
