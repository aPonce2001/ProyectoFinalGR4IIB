
package Fuentes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//@author Andrés Ponce

public class Conexion {
    private String url, user, password, baseDeDatos;
    private Connection con = null;
    private Statement declaracion = null;

    public Conexion() {
        this.url = "";
        this.user = "";
        this.password = "";
        this.baseDeDatos = "";
    }
    
    public Conexion(String url, String baseDeDatos, String login, String password) {
        this.url = url + ";databaseName=" + baseDeDatos;
        this.user = login;
        this.password = password;
        this.baseDeDatos = baseDeDatos;
    }

    public String getURL() {
        return url;
    }

    public void setURL(String server) {
        this.url = server;
    }

    public String getLogin() {
        return user;
    }

    public void setLogin(String login) {
        this.user = login;
    }

    //El método getPassword() no existe, con el fin de que no que se pueda encontrar la contraseña del usuario dentro del programa.
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Statement getDeclaracion() {
        return declaracion;
    }

    public void setDeclaracion(Statement declaracion) {
        this.declaracion = declaracion;
    }
    
    /*conectarBaseDeDatos() realiza la conexión con la base de datos que está en el servidor.
    *Si las credenciales son correctas, retorna this, es decir, los datos que se encuentran en la conexión.
    *Caso contrario, retorna un null, como una bandera para decir que la información de ingreso es incorrecta.*/
    public Conexion conectarBaseDeDatos(){
        try {
            this.con = DriverManager.getConnection(url, user, password);
            this.declaracion = this.con.createStatement();
            return this;
        } catch (SQLException ex) {
            return null;
        }
    }
    
    public void subirALaBase(Entidad entidad){
        try {
            this.declaracion = this.con.createStatement();
            this.declaracion.execute("insert into " + entidad.getNombreEntidad() + " values " + entidad.getDatos());
        } catch (SQLException ex){
            
        }
    }
    
    /*public Asiento obtenerAsiento(int ID){
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = declaracion.executeQuery("SELECT * FROM ASIENTO WHERE ID=" + ID);
            int idAsiento = resultado.getInt(1);
            int pasaporte= resultado.getInt(2);
            String idVuelo=  resultado.getString(3);
            int asiento= resultado.getInt(4);
        }catch (SQLException ex){
            return null;
        }
    }*/
    
    public Cliente obtenerCliente(int ID){
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = declaracion.executeQuery("SELECT * FROM CLIENTE WHERE ID_CLIENTE=" + ID);
            while(resultado.next()){
                int idCliente = resultado.getInt("ID_CLIENTE");
                Pais pais = obtenerPais(resultado.getInt("ID_PAIS"));
                String nombre = resultado.getString("NOMBRE_CLIENTE");
                                Cliente cliente = new Cliente(idCliente, pais, nombre);
                return cliente;
            }
            return null;
        }catch (SQLException ex){
            return null;
        }
    }
    
    public Pais obtenerPais(int ID){
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = declaracion.executeQuery("SELECT * FROM PAIS WHERE ID_PAIS=" + ID);
            while(resultado.next()){
                int idPais = resultado.getInt(1);
                String nombrePais = resultado.getString(2);
                Pais pais = new Pais(idPais, nombrePais);
                return pais;
            }
            return null;
        }catch (SQLException ex){
            return null;
        }
    }
    
    /*public Entidad obtenerDeLaBase(int ID, String nombreTabla){
        nombreTabla = nombreTabla.toUpperCase();
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = declaracion.executeQuery("SELECT * FROM " + nombreTabla + " WHERE ID_" + nombreTabla + "=" + ID);
            
            /*switch(nombreTabla){
                case "CLIENTE":
                    while(resultado.next()){
                        int idCliente = resultado.getInt("ID_CLIENTE");
                        Pais pais = (Pais) obtenerDeLaBase(resultado.getInt("ID_PAIS"), "PAIS");
                        String nombre = resultado.getString("NOMBRE_CLIENTE");
                        Cliente cliente = new Cliente(idCliente, pais, nombre);
                        return cliente;                  
                    }
                    return null;
                case "PAIS":
                    while(resultado.next()){
                        int idPais = resultado.getInt(1);
                        String nombrePais = resultado.getString(2);
                        Pais pais = new Pais(idPais, nombrePais);
                        return pais;
                    }
                    return null;
            }
            while(resultado.next()){
                int idPais = resultado.getInt(1);
                String nombrePais = resultado.getString(2);
                Pais pais = new Pais(idPais, nombrePais);
                return pais;
            }
            return null;*//*
        }catch (SQLException ex){
            return null;
        }
    }*/    
    
    public <Entidad> Entidad obtenerDeLaBase(int ID, Class<Entidad> tipo){
        //Es importante que el objeto tenga el mismo nombre que la tabla en SQL.
        String nombre = tipo.getSimpleName().toUpperCase();
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = declaracion.executeQuery("SELECT * FROM " + nombre + " WHERE ID_" + nombre + "=" + ID);
            
            return null;
        }catch (SQLException ex){
            return null;
        }
    }
    
    public <Entidad> Entidad obtenerDeLaBase(String ID, Class<Entidad> tipo){
        //Es importante que el objeto tenga el mismo nombre que la tabla en SQL.
        String nombre = tipo.getSimpleName().toUpperCase();
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = declaracion.executeQuery("SELECT * FROM " + nombre + " WHERE ID_" + nombre + "=\'" + ID + "\'");
            
            return null;
        }catch (SQLException ex){
            return null;
        }
    }
    
    /*public Entidad obtenerDeLaBase(String ID, String nombreTabla){
        nombreTabla = nombreTabla.toUpperCase();
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = declaracion.executeQuery("SELECT * FROM " + nombreTabla + " WHERE ID_" + nombreTabla + "=\'" + ID + "\'");
            switch(nombreTabla){
                case "VUELO":
                    while(resultado.next()){
                        String idVuelo = resultado.getString("ID_VUELO");
                        Avion avion = (Avion)obtenerDeLaBase(resultado.getInt("ID_AVION"), "AVION");
                        String ruta = resultado.getString("RUTA");
                        
                        Vuelo vuelo = new Vuelo(idVuelo, avion, url, true);
                        return vuelo;                  
                    }
                    return null;
                default:
                    return null;
            }
        }catch (SQLException ex){
            return null;
        }
    }*/
    
    public void actualizarEnLaBase(int ID, Entidad entidad){
        try {
            this.declaracion = this.con.createStatement();
            this.declaracion.execute("insert into " + entidad.getNombreEntidad() + " values " + entidad.getDatos());
        } catch (SQLException ex){
            
        }
    }
    
    public <Entidad> void eliminarDeLaBase(int ID, Class<Entidad> tipo){
        String nombre = tipo.getSimpleName().toUpperCase();
        try {
            this.declaracion = this.con.createStatement();
            this.declaracion.execute("DELETE FROM " + nombre + " WHERE ID_" + nombre + "=" + ID);
        } catch (SQLException ex){  
        }
    }
    
    public <Entidad> void eliminarDeLaBase(String ID, Class<Entidad> tipo){
        String nombre = tipo.getSimpleName().toUpperCase();
        try {
            this.declaracion = this.con.createStatement();
            this.declaracion.execute("DELETE FROM " + nombre + " WHERE ID_" + nombre + "=\'" + ID + "\'");
        } catch (SQLException ex){  
        }
    }
}
