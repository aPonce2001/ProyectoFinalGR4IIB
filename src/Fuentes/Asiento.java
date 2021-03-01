
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
        return("ID_asiento = " + this.idAsiento + ", ID_Clase = " + this.clase.getTipo() + ", ID_Avion = " + this.avion.getIdAvion() + ", Numero = " + this.numero + ", Ubicacion = \'" + this.ubicacion + "\', Estado = \'" + this.estado + "\'");
    }
 
    @Override
    public String toString() {
        return "Asiento No. " + idAsiento + "\nClase: " + clase + "\nAvión: " + avion + "\nNúmero de asiento: " + numero + "\nUbicación: " + ubicacion + "\nEstado: " + (estado?("Ocupado"):("Disponible"));
    }
}
