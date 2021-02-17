
package Fuentes;

//@author Andrés Ponce

import java.sql.*;
import java.util.ArrayList;

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
    public Reserva obtenerEntidadDeBase(int ID, Conexion conexion) {
        Reserva reserva = new Reserva();
        Cliente cliente = new Cliente();
        Vuelo vuelo = new Vuelo();
        Asiento asiento = new Asiento();
        try{
            ResultSet resultado = conexion.getDeclaracion().executeQuery("SELECT * FROM RESERVA WHERE ID_RESERVA = " + ID);
            while(resultado.next()){
                reserva.setIdReserva(resultado.getInt(1));
                reserva.setCliente(cliente.obtenerEntidadDeBase(resultado.getInt(2), conexion));
                reserva.setVuelo(vuelo.obtenerEntidadDeBase(resultado.getString(3), conexion));
                reserva.setAsiento(asiento.obtenerEntidadDeBase(resultado.getInt(4), conexion));
                return reserva;
            }
        }catch(SQLException ex){
        }
        return reserva;
    }

    @Override
    public Reserva obtenerEntidadDeBase(String ID, Conexion conexion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList obtenerListaObjectos(Conexion conexion) {
        ArrayList<Reserva> reservas = new ArrayList<>();
        Reserva reserva = new Reserva();
        Cliente cliente = new Cliente();
        Vuelo vuelo = new Vuelo();
        Asiento asiento = new Asiento();
        try{
            ResultSet resultado = conexion.getDeclaracion().executeQuery("SELECT * FROM RESERVA");
            while(resultado.next()){
                reserva.setIdReserva(resultado.getInt(1));
                reserva.setCliente(cliente.obtenerEntidadDeBase(resultado.getInt(2), conexion));
                reserva.setVuelo(vuelo.obtenerEntidadDeBase(resultado.getString(3), conexion));
                reserva.setAsiento(asiento.obtenerEntidadDeBase(resultado.getInt(4), conexion));
                reservas.add(reserva);
                return reservas;
            }
        }catch(SQLException ex){
        }
        return reservas;
    }
    
    
    
    @Override
    public String toString() {
        return "Reserva No. " + idReserva + "\nDatos del cliente:\n" + cliente + "\nVuelo: " + vuelo + "\nAsiento: " + asiento;
    }    
    
}
