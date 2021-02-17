/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaComun.Cm_ClsCliente;
import CapaDatos.Dt_ClsCliente;
import java.util.List;
 

/**
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
    
}
