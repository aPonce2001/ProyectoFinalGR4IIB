/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaComun.Cm_ClsPais;
import CapaDatos.Dt_ClsPais;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author Dennis David
 */
public class Ng_ClsPais {

    Dt_ClsPais dt_pais =  new Dt_ClsPais();
    
    public Ng_ClsPais() {
    }
    
     public List<Cm_ClsPais> mostrarPaisAll(JComboBox jCBPais, Boolean isUpdateAt, int selectedIdx) {
         return dt_pais.mostrarPaisAll(jCBPais, isUpdateAt, selectedIdx);
     }
     
     
     public int insertarPais(int id, String nombre) {
        return dt_pais.insertarPais(id, nombre);
    }
     
}
