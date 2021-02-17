/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaComun.Cm_ClsAsiento;
import CapaComun.Cm_ClsCliente;
import CapaDatos.Dt_ClsAsiento;
import java.util.List;

/**
 *
 * @author Dennis David
 */
public class Ng_ClsAsiento {
    Dt_ClsAsiento dt_cliente = new Dt_ClsAsiento();

    public Ng_ClsAsiento() {
    }
    
     public List<Cm_ClsAsiento> mostrarAsientoXClase(int id_clase_FK) {
         return dt_cliente.mostrarAsientoXClase(id_clase_FK);
     }
}
