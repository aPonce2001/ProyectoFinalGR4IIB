
package Fuentes;

import java.sql.*;
import java.util.ArrayList;

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
    
    //Operaciones para realizar los comandos de código SQL:
    
    @Override
    public String getNombreEntidad() {
        return "CLIENTE";
    }

    @Override
    public String getDatos() {
        return ("(" + this.idCliente +"," + this.pais.getIdPais() +",\'" + this.nombre +"\')");
    }

    @Override
    public String toQuery() {
        return ("ID_CLIENTE = " + this.idCliente + ", ID_PAIS = " + this.pais.getIdPais() + ", NOMBRE_CLIENTE = \'" + this.nombre + "\'");
    }
    
    @Override
    public Cliente obtenerEntidadDeBase(int ID, Conexion conexion) {
        Cliente cliente = new Cliente();
        Pais pais = new Pais();
        try{
            ResultSet resultado = conexion.getDeclaracion().executeQuery("SELECT * FROM CLIENTE WHERE ID_CLIENTE = " + ID);
            while(resultado.next()){
                cliente.setIdCliente(resultado.getInt(1));
                cliente.setPais(pais.obtenerEntidadDeBase(resultado.getInt(2), conexion));
                cliente.setNombre(resultado.getString(3));
                return cliente;
            }
        }catch(SQLException ex){
        }
        return cliente;
    }

    @Override
    public Cliente obtenerEntidadDeBase(String ID, Conexion conexion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public ArrayList obtenerListaObjectos(Conexion conexion) {
       ArrayList<Cliente> clientes = new ArrayList<Cliente>();
       Cliente cliente = new Cliente();
       Pais pais = new Pais();
        try{
            ResultSet resultado = conexion.getDeclaracion().executeQuery("SELECT * FROM CLIENTE");
            while(resultado.next()){
                cliente.setIdCliente(resultado.getInt(1));
                cliente.setPais(pais.obtenerEntidadDeBase(resultado.getInt(2), conexion));
                cliente.setNombre(resultado.getString(3));
                clientes.add(cliente);
            }
        }catch(SQLException ex){
        }
        return clientes;
    }
    
    @Override
    public String toString() {
        return ("ID_CLIENTE = " + this.idCliente + ", ID_PAIS = " + this.pais.getIdPais() + ", NOMBRE_CLIENTE = \'" + this.nombre + "\'");
    }
}
