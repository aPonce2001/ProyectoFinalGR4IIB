package CapaNegocio;

import CapaComun.Cm_ClsCliente;
import CapaDatos.Dt_ClsCliente;
import java.util.List;
/*
 * @author Dennis David
 */
public class Ng_ClsCliente {

    Dt_ClsCliente dt_cliente = new Dt_ClsCliente();
    
    public Ng_ClsCliente() {
    }
    
    public int insertarCliente(String nombre, String apellido, String cedula, String passwd, int id_pais_fk) {
        return dt_cliente.insertarCliente(nombre, apellido, cedula, passwd, id_pais_fk);
    }
    
    public List<Cm_ClsCliente> mostrarPaisAll() {
         return dt_cliente.mostrarClienteAll();
     }
    
    public Cm_ClsCliente inSesionXUserPass(String cedula, String passwd) {
        return dt_cliente.inSesionXUserPass(cedula, passwd);
    }
}