
package Fuentes;

//@author Andrés Ponce

import java.sql.*;
 
public class Vuelo implements Entidad{
    private int idVuelo;
    private Avion avion;
    private Pais paisOrigen;
    private Pais paisDestino;
    private boolean estadoDeVuelo;
    private Timestamp fechaHora;

    public Vuelo() {
        this.idVuelo = 0;
        this.avion = new Avion();
        this.paisOrigen = new Pais();
        this.paisDestino = new Pais();
        this.estadoDeVuelo = false;
        this.fechaHora = new Timestamp(0);
    }

    public Vuelo(int idVuelo, Avion avion, Pais paisOrigen, Pais paisDestino, boolean estadoDeVuelo, Timestamp fechaHora) {
        this.idVuelo = idVuelo;
        this.avion = avion;
        this.paisOrigen = paisOrigen;
        this.paisDestino = paisDestino;
        this.estadoDeVuelo = estadoDeVuelo;
        this.fechaHora = fechaHora;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Pais getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(Pais paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public Pais getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(Pais paisDestino) {
        this.paisDestino = paisDestino;
    }

    public boolean isEstadoDeVuelo() {
        return estadoDeVuelo;
    }

    public void setEstadoDeVuelo(boolean estadoDeVuelo) {
        this.estadoDeVuelo = estadoDeVuelo;
    }

    public Timestamp getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Timestamp fechaHora) {
        this.fechaHora = fechaHora;
    }
    
    
    //Operaciones para realizar los comandos de código SQL:
    @Override
    public String getNombreEntidad() {
        return "VUELO";
    }

    @Override
    public String getDatos() {
        
        return ("(" + this.idVuelo +", " + this.avion.getIdAvion() + ", " + this.paisOrigen.getIdPais() + ", " + this.paisDestino.getIdPais() + ", \'" + this.estadoDeVuelo + "\', " + this.fechaHora);
    }
    
    @Override
    public String toQuery() {
        return ("ID_VUELO = " + this.idVuelo + ", ID_AVION = " + this.avion.getIdAvion() + ", ID_Origen = " + this.paisOrigen.getIdPais() + ", ID_Destino = " + this.paisDestino.getIdPais() + ", Estado = \'" + this.estadoDeVuelo + "\', Fecha_Hora = \'" + this.fechaHora + "\'");
    }

    @Override
    public String toString() {
        return "Vuelo{" + "idVuelo=" + idVuelo + ", avion=" + avion + ", paisOrigen=" + paisOrigen + ", paisDestino=" + paisDestino + ", estadoDeVuelo=" + estadoDeVuelo + ", fechaHora=" + fechaHora + '}';
    }  
}
