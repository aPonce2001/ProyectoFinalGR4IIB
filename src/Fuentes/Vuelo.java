
package Fuentes;

//@author Andrés Ponce

import java.sql.ResultSet;

 
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

    @Override
    public String getNombreEntidad() {
        return "VUELO";
    }

    @Override
    public String getDatos() {
        return ("(\'" + this.idVuelo +"\'," + this.avion.getIdAvion() + ",\'" + this.getRuta() +"\',\'" + this.estadoDeVuelo + "\')");
    }

    
    
    @Override
    public String toString() {
        return "Vuelo No. " + idVuelo + "\nAvión: " + avion.toString() + "\nRuta: " + ruta + "\nEstado de vuelo: " + (estadoDeVuelo?("En curso"):("Por empezar"));
    }

}
