
package Fuentes;

import java.sql.*;
import java.util.ArrayList;

//@author Andrés Ponce

public class Cliente implements Entidad{
    private long idCliente;
    private String correo;
    private String contrasenia;
    private Pais pais;
    private String nombre;
    private long telefono;

    public Cliente() {
        this.idCliente = 0;
        this.correo = "";
        this.contrasenia = "";
        this.pais = new Pais();
        this.nombre = "";
        this.telefono = 0;
    }

    public Cliente(long idCliente, String correo, String contrasenia, Pais pais, String nombre, long telefono) {
        this.idCliente = idCliente;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.pais = pais;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
    
    //Operaciones para realizar los comandos de código SQL:
    
    @Override
    public String getNombreEntidad() {
        return "CLIENTE";
    }

    @Override
    public String getDatos() {
        if(this.telefono >= 0){
            return ("(" + this.idCliente + ", \'" + this.correo + "\', \'" + this.contrasenia +"\', \'" + this.nombre + "\', " + this.pais.getIdPais() + ", " + this.telefono +")");
        }else{
            return ("(" + this.idCliente + ", \'" + this.correo + "\', \'" + this.contrasenia +"\', \'" + this.nombre + "\', " + this.pais.getIdPais() + ", NULL)");
        }
    }

    @Override
    public String toQuery() {
        if(this.telefono >= 0){
            return ("ID_Cliente = " + this.idCliente + ", Correo = \'" + this.correo + "\', Contrasenia = \'" + this.correo +"\', Nombre = \'" + this.nombre + "\', ID_Pais = " + this.pais.getIdPais() + ", Telefono = " + this.telefono);
        }else{
            return ("ID_Cliente = " + this.idCliente + ", Correo = \'" + this.correo + "\', Contrasenia = \'" + this.correo +"\', Nombre = \'" + this.nombre + "\', ID_Pais = " + this.pais.getIdPais() + ", Telefono = NULL");
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", correo=" + correo + ", contrasenia=" + contrasenia + ", pais=" + pais + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    
}
