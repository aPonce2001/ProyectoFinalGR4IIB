
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
        
    /*conectarBaseDeDatos() realiza la conexión con la base de datos que está en el servidor.
    *Si las credenciales son correctas, retorna this, es decir, los datos que se encuentran en la conexión.
    *Caso contrario, retorna un null, como una bandera para decir que la información de ingreso es incorrecta.*/
    public Conexion conectarBaseDeDatos(){
        try {
            this.con = DriverManager.getConnection(url, user, password);
            return this;
        } catch (SQLException ex) {
            return null;
        }
    }
}
