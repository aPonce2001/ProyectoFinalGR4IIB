
package Fuentes;

//@author Andrés Ponce


public class Reserva implements Entidad{
    private int idReserva;
    private Cliente cliente;
    private Vuelo vuelo;
    private Asiento asiento;
    private Comida comida;

    public Reserva() {
        this.idReserva = 0;
        this.cliente = new Cliente();
        this.vuelo = new Vuelo();
        this.asiento = new Asiento();
        this.comida = new Comida();
    }

    public Reserva(int idReserva, Cliente cliente, Vuelo vuelo, Asiento asiento, Comida comida) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.vuelo = vuelo;
        this.asiento = asiento;
        this.comida = comida;
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

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }
    
    //Operaciones para realizar los comandos de código SQL:
    
    @Override
    public String getNombreEntidad() {
        return "RESERVA";
    }

    @Override
    public String getDatos() {
        return ("(" + this.idReserva +"," + this.cliente.getIdCliente() + ", " + this.vuelo.getIdVuelo() +", " + this.asiento.getIdAsiento() +", " + this.comida.getIdComida() + ")");
    }

    @Override
    public String toQuery() {
        return ("ID_Reserva = " + this.idReserva +", ID_Cliente = " + this.cliente.getIdCliente() + ", ID_Vuelo = " + this.vuelo.getIdVuelo() +", ID_Asiento = " + this.asiento.getIdAsiento() +", ID_Comida = " + this.comida.getIdComida());
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", cliente=" + cliente + ", vuelo=" + vuelo + ", asiento=" + asiento + ", comida=" + comida + '}';
    }
}
