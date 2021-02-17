
package Fuentes;

//@author Andrés Ponce

import java.sql.ResultSet;
import java.sql.SQLException;

 
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
    public String toString() {
        return "Clase\n" + "Tipo:" + idClase + "\nNombre de la clase: " + nombreClase;
    }
}
