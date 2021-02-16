
package Fuentes;

//@author Andrés Ponce

public class Cliente implements Entidad{
    private int idCliente;
    private Pais pais;
    private String nombre;

    public Cliente() {
        this.idCliente = 0;
        this.pais = new Pais();
        this.nombre = "";
    }

    public Cliente(int idCliente, Pais pais, String nombre) {
        this.idCliente = idCliente;
        this.pais = pais;
        this.nombre = nombre;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String getNombreEntidad() {
        return "CLIENTE";
    }

    @Override
    public String getDatos() {
        return ("(" + this.idCliente +"," + this.pais.getIdPais() +",\'" + this.nombre +"\')");
    }

    @Override
    public String toString() {
        return "Número de pasaporte: " + idCliente + "\nNombre: " + nombre + "\nPaís del cliente: " + pais.toString();
    }
}
