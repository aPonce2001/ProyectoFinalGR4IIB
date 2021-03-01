
package Fuentes;

import Interfaz.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//@author Andrés Ponce

public class Main {

    public static void main(String[] args) {
        try{
            JFLogin jfLogin = new JFLogin();
            jfLogin.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al intentar conectarse a la base de datos.\nPor favor, comunícate con los estudiantes para solventar el problema.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
