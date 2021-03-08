/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaComun.Cm_ClsAsiento;
import CapaComun.Cm_ClsCliente;
import CapaComun.Cm_ClsReserva;
import CapaDatos.Dt_ClsAsiento;
import java.util.List;

/**
 *
 * @author Dennis David
 */
public class Ng_ClsAsiento {
    Dt_ClsAsiento dt_asiento = new Dt_ClsAsiento();

    public Ng_ClsAsiento() {
    }
    
     public List<Cm_ClsAsiento> mostrarAsientoXClase(int id_clase_FK) {
         return dt_asiento.mostrarAsientoXClase(id_clase_FK);
     }
     
     public  int actualizarEstadoAsiento(int id,String ubicacion,String estado,int id_clase_FK){
         return dt_asiento.actualizarEstadoAsiento(id, ubicacion, estado, id_clase_FK);
     }
   
     
     public List<Cm_ClsAsiento> mostrarAsientoAll() {
       return dt_asiento.mostrarAsientoAll();
     }
}
