package CapaNegocio;

import CapaComun.Cm_ClsCliente;
import CapaDatos.Dt_ClsCliente;
import java.util.List;

//@authors Dennis David Lincango, Kelvin Ojeda, Andrés Ponce

public class Ng_ClsCliente {

    Dt_ClsCliente dt_cliente = new Dt_ClsCliente();
    
    public Ng_ClsCliente() {
    }
    
    public int insertarCliente(String nombre, String apellido, String cedula, String passwd, int id_pais_fk) {
        return dt_cliente.insertarCliente(nombre, apellido, cedula, passwd, id_pais_fk);
    }
    
    public int actualizarCliente(int id, String nombre, String apellido, String cedula, String passwd, int id_pais_fk) {
        System.out.println("ng -> actualizarCliente()");
        return dt_cliente.actualizarCliente(id, nombre, apellido, cedula, passwd, id_pais_fk);
    }
    
    public List<Cm_ClsCliente> mostrarClienteAll() {
         return dt_cliente.mostrarClienteAll();
     }
    
    public Cm_ClsCliente inSesionXUserPass(String cedula, String passwd) {
        return dt_cliente.inSesionXUserPass(cedula, passwd);
    }
}