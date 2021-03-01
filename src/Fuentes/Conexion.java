
package Fuentes;

import java.sql.*;
import java.util.ArrayList;

//@author Andrés Ponce

public class Conexion {
    private String url, user, password, baseDeDatos;
    private Connection con = null;
    private Statement declaracion = null;
    private PreparedStatement validacion = null;

    public Conexion() throws SQLException, SQLException {
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
    public void conectarBaseDeDatos () throws SQLException{
        this.con = DriverManager.getConnection(url, user, password);
        this.declaracion = this.con.createStatement();
    }
    
    public Cliente login(Cliente cliente) throws SQLException{
        validacion = con.prepareStatement("SELECT * FROM Cliente WHERE Correo = \'" + cliente.getCorreo() + "\' AND Contrasenia = \'" + cliente.getContrasenia() + "\'");
        ResultSet resultado = validacion.executeQuery();
        while(resultado.next()){
            long idCliente = resultado.getLong(1);
            String correo = resultado.getString(2);
            String contrasenia = resultado.getString(3);
            String nombre = resultado.getString(4);
            Pais pais = this.obtenerPaisDeLaBase(resultado.getInt(5));
            long telefono = resultado.getLong(6);
            Cliente clienteLogin = new Cliente(idCliente, correo, contrasenia, pais, nombre, telefono);
            return clienteLogin;
        }
        throw new SQLException("Credenciales incorrectas");
    }
    
    public void registro(Cliente cliente){
        this.subirALaBase(cliente);
    }
    
    public void cerrarConexion(){
        try {
            this.con.close();
            this.declaracion.close();
        } catch (SQLException ex) {
        }
    }
    
    public void subirALaBase(Entidad entidad){
        try {
            this.declaracion = this.con.createStatement();
            this.declaracion.execute("insert into " + entidad.getNombreEntidad() + " values " + entidad.getDatos());
        } catch (SQLException ex){
            
        }
    }
    
    public void actualizarEnLaBase(int ID, Entidad entidad){
        try {
            this.declaracion = this.con.createStatement();
            this.declaracion.execute("UPDATE "+ entidad.getNombreEntidad() + " SET " + entidad.toQuery() + " WHERE ID_" + entidad.getNombreEntidad() + " = " + ID);
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
    
    public Asiento obtenerAsientoDeLaBase(int ID) {
        Asiento asiento = new Asiento();
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = this.declaracion.executeQuery("SELECT * FROM ASIENTO WHERE ID_ASIENTO = " + ID);
            while(resultado.next()){
                int idAsiento = resultado.getInt(1);
                Clase clase = this.obtenerClaseDeLaBase(resultado.getInt(2));
                Avion avion = this.obtenerAvionDeLaBase(resultado.getInt(3));
                int numero = resultado.getInt(4);
                String ubicacion = resultado.getString(5);
                boolean estado = resultado.getBoolean(6);
                asiento = new Asiento(idAsiento, clase, avion, numero, ubicacion, estado);
            }
        }catch(SQLException ex){
        }
        return asiento;
    }
    
    public ArrayList<Asiento> obtenerListaAsientos() {
        ArrayList<Asiento> asientos = new ArrayList<Asiento>();
        Asiento asiento = new Asiento();
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = this.declaracion.executeQuery("SELECT * FROM ASIENTO");
            while(resultado.next()){
                int idAsiento = resultado.getInt(1);
                Clase clase = this.obtenerClaseDeLaBase(resultado.getInt(2));
                Avion avion = this.obtenerAvionDeLaBase(resultado.getInt(3));
                int numero = resultado.getInt(4);
                String ubicacion = resultado.getString(5);
                boolean estado = resultado.getBoolean(6);
                asiento = new Asiento(idAsiento, clase, avion, numero, ubicacion, estado);
                asientos.add(asiento);
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return asientos;
    }
    
    public Avion obtenerAvionDeLaBase(int ID) {
        Avion avion = new Avion();
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = this.declaracion.executeQuery("SELECT * FROM AVION WHERE ID_AVION = " + ID);
            while(resultado.next()){
                int idAvion = resultado.getInt(1);
                String descripcion = resultado.getString(2);
                avion = new Avion(idAvion, descripcion);
            }
        }catch(SQLException ex){
        }
        return avion;
    }
    
    
    public ArrayList<Avion> obtenerListaAviones() {
       ArrayList<Avion> aviones = new ArrayList<Avion>();
       Avion avion = new Avion();
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = this.declaracion.executeQuery("SELECT * FROM AVION");
            while(resultado.next()){
                int idAvion = resultado.getInt(1);
                String descripcion = resultado.getString(2);
                avion = new Avion(idAvion, descripcion);
                aviones.add(avion);
            }
        }catch(SQLException ex){
        }
        return aviones;
    }
    
    public Clase obtenerClaseDeLaBase(int ID) {
        Clase clase = new Clase();
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = this.declaracion.executeQuery("SELECT * FROM CLASE WHERE ID_CLASE = " + ID);
            while(resultado.next()){
                clase = new Clase(resultado.getInt(1), resultado.getString(2));  
            }
        }catch(SQLException ex){
        }
        return clase;
    }
    
    public ArrayList<Clase> obtenerListaClases() {
       ArrayList<Clase> clases = new ArrayList<Clase>();
       Clase clase = new Clase();
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = this.declaracion.executeQuery("SELECT * FROM CLASE");
            while(resultado.next()){
                clase = new Clase(resultado.getInt(1), resultado.getString(2));
                clases.add(clase);
            }
        }catch(SQLException ex){
        }
        return clases;
    }

    public Comida obtenerComidaDeLaBase(int ID){
        Comida comida = new Comida();
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = this.declaracion.executeQuery("SELECT * FROM COMIDA WHERE ID_CLASE = " + ID);
            while(resultado.next()){
                comida = new Comida(resultado.getInt(0), resultado.getString(1), resultado.getString(2));
            }
        }catch(SQLException ex){
        }
        return comida;
    }
    
    public ArrayList<Comida> obtenerListaComida(){
        ArrayList<Comida> comidas = new ArrayList<Comida>();
        Comida comida = new Comida();
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = this.declaracion.executeQuery("SELECT * FROM COMIDA");
            while(resultado.next()){
                comida = new Comida(resultado.getInt(0), resultado.getString(1), resultado.getString(2));
                comidas.add(comida);
            }
        }catch(SQLException ex){
        }
        return comidas;
    }
    
    public Cliente obtenerClienteDeLaBase(int ID) {
        Cliente cliente = new Cliente();
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = this.declaracion.executeQuery("SELECT * FROM CLIENTE WHERE ID_CLIENTE = " + ID);
            while(resultado.next()){
                long idCliente = resultado.getLong(1);
                String correo = resultado.getString(2);
                String contrasenia = resultado.getString(3);
                String nombre = resultado.getString(4);
                Pais pais = this.obtenerPaisDeLaBase(resultado.getInt(5));
                long telefono = resultado.getLong(6);
                cliente = new Cliente(idCliente, correo, contrasenia, pais, nombre, telefono);
            }
            return cliente;
        }catch(SQLException ex){
            System.out.println(ex);
        }
        return cliente;      
    }
    
    public ArrayList<Cliente> obtenerListaClientes() {
       ArrayList<Cliente> clientes = new ArrayList<Cliente>();
       Cliente cliente = new Cliente();
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = this.declaracion.executeQuery("SELECT * FROM CLIENTE");
            while(resultado.next()){
                long idCliente = resultado.getLong(1);
                String correo = resultado.getString(2);
                String contrasenia = resultado.getString(3);
                String nombre = resultado.getString(4);
                Pais pais = this.obtenerPaisDeLaBase(resultado.getInt(5));
                long telefono = resultado.getLong(6);
                cliente = new Cliente(idCliente, correo, contrasenia, pais, nombre, telefono);
                clientes.add(cliente);
            }
        }catch(SQLException ex){
        }
        return clientes;
    }
    
    public Pais obtenerPaisDeLaBase(int ID) {
        Pais pais = new Pais();
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = this.declaracion.executeQuery("SELECT * FROM PAIS WHERE ID_PAIS = " + ID);
            while(resultado.next()){
                int idPais = resultado.getInt(1);
                String nombrePais = resultado.getString(2);
                pais = new Pais(idPais, nombrePais);
            }
            return pais;
        }catch(SQLException ex){
            return null;
        }
    }
    
    public ArrayList<Pais> obtenerListaPaises() {
       ArrayList<Pais> paises = new ArrayList<Pais>();
       Pais pais = new Pais();
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = this.declaracion.executeQuery("SELECT * FROM PAIS ORDER BY Nombre");
            while(resultado.next()){
                int idPais = resultado.getInt(1);
                String nombrePais = resultado.getString(2);
                pais = new Pais(idPais, nombrePais);
                paises.add(pais);
            }
        }catch(SQLException ex){
        }
        return paises;
    }

    public Reserva obtenerReservaDeLaBase(int ID) {
        Reserva reserva = new Reserva();
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = this.declaracion.executeQuery("SELECT * FROM RESERVA WHERE ID_RESERVA = " + ID);
            while(resultado.next()){
                int idReserva = resultado.getInt(1);
                Cliente cliente = this.obtenerClienteDeLaBase(resultado.getInt(2));
                Vuelo vuelo = this.obtenerVueloDeLaBase(resultado.getInt(3));
                Asiento asiento = this.obtenerAsientoDeLaBase(resultado.getInt(4));
                Comida comida = this.obtenerComidaDeLaBase(resultado.getInt(5));
                reserva = new Reserva(idReserva, cliente, vuelo, asiento, comida);
            }
        }catch(SQLException ex){
        }
        return reserva;
    }
    
    public ArrayList<Reserva> obtenerListaReservas() {
        ArrayList<Reserva> reservas = new ArrayList<>();
        Reserva reserva = new Reserva();
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = this.declaracion.executeQuery("SELECT * FROM RESERVA");
            while(resultado.next()){
                int idReserva = resultado.getInt(1);
                Cliente cliente = this.obtenerClienteDeLaBase(resultado.getInt(2));
                Vuelo vuelo = this.obtenerVueloDeLaBase(resultado.getInt(3));
                Asiento asiento = this.obtenerAsientoDeLaBase(resultado.getInt(4));
                Comida comida = this.obtenerComidaDeLaBase(resultado.getInt(5));
                reserva = new Reserva(idReserva, cliente, vuelo, asiento, comida);
                reservas.add(reserva);
            }
        }catch(SQLException ex){
        }
        return reservas;
    }
    
    public Vuelo obtenerVueloDeLaBase(int ID) {
        Vuelo vuelo = new Vuelo();
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = this.declaracion.executeQuery("SELECT * FROM VUELO WHERE ID_VUELO = \'" + ID + "\'");
            while(resultado.next()){
                int idVuelo = resultado.getInt(1);
                Avion avion = this.obtenerAvionDeLaBase(resultado.getInt(2));
                Pais paisOrigen = this.obtenerPaisDeLaBase(resultado.getInt(3));
                Pais paisDestino = this.obtenerPaisDeLaBase(resultado.getInt(4));
                boolean estadoDeVuelo = resultado.getBoolean(5);
                Timestamp fechaHora = resultado.getTimestamp(6);
                vuelo = new Vuelo(idVuelo, avion, paisOrigen, paisDestino, estadoDeVuelo, fechaHora);
            }
        }catch(SQLException ex){
        }
        return vuelo;
    }

    public ArrayList<Vuelo> obtenerListaVuelos() {
        ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();
        Vuelo vuelo = new Vuelo();
        try{
            this.declaracion = this.con.createStatement();
            ResultSet resultado = this.declaracion.executeQuery("SELECT * FROM VUELO");
            while(resultado.next()){
                int idVuelo = resultado.getInt(1);
                Avion avion = this.obtenerAvionDeLaBase(resultado.getInt(2));
                Pais paisOrigen = this.obtenerPaisDeLaBase(resultado.getInt(3));
                Pais paisDestino = this.obtenerPaisDeLaBase(resultado.getInt(4));
                boolean estadoDeVuelo = resultado.getBoolean(5);
                Timestamp fechaHora = resultado.getTimestamp(6);
                vuelo = new Vuelo(idVuelo, avion, paisOrigen, paisDestino, estadoDeVuelo, fechaHora);
                vuelos.add(vuelo);
            }
        }catch(SQLException ex){
        }
        return vuelos;
    }    
}
