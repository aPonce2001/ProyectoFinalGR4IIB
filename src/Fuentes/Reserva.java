
package Fuentes;

//@author Andrés Ponce

import java.sql.ResultSet;

 
public class Reserva implements Entidad{
    private int idReserva;
    private Cliente cliente;
    private Vuelo vuelo;
    private Asiento asiento;

    public Reserva() {
        this.idReserva = 0;
        this.cliente = new Cliente();
        this.vuelo = new Vuelo();
        this.asiento = new Asiento();
    }

    public Reserva(int idReserva, Cliente cliente, Vuelo vuelo, Asiento asiento) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.vuelo = vuelo;
        this.asiento = asiento;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

    //Operaciones para realizar los comandos de código SQL:
    
    @Override
    public String getNombreEntidad() {
        return "RESERVA";
    }

    @Override
    public String getDatos() {
        return ("(" + this.idReserva +"," + this.cliente.getIdCliente() + ",\'" + this.vuelo.getIdVuelo() +"\'," + this.asiento.getIdAsiento() +")");
    }

    @Override
    public String toQuery() {
        return ("ID_RESERVA = " + this.idReserva + ", ID_CLIENTE = " + this.cliente.getIdCliente() + ", ID_VUELO = \'" + this.vuelo.getIdVuelo() + "\', ID_ASIENTO = " + this.asiento.getIdAsiento());
    }
    
    @Override
    public String toString() {
        return "Reserva No. " + idReserva + "\nDatos del cliente:\n" + cliente + "\nVuelo: " + vuelo + "\nAsiento: " + asiento;
    }    
    
}
