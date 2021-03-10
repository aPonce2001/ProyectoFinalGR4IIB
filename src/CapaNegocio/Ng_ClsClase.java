/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaComun.Cm_ClsClase;
import CapaDatos.Dt_ClsClase;
import static CapaDatos.Dt_ClsConexion.executeQuery;
import CapaDatos.Dt_ClsPais;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author Dennis David
 */
public class Ng_ClsClase {

    Dt_ClsClase dt_Clase =  new Dt_ClsClase();
    
    public Ng_ClsClase() {
    }
    
    public int insertarClase(String nombre, int capacidad) {
        return dt_Clase.insertarClase(nombre, capacidad);
    }
    
    public int actualizarClase(int ID, String nombre, int capacidad){
        return dt_Clase.actualizarClase(ID, nombre, capacidad);
    }
    
    public int borrarClase(int ID){
        return dt_Clase.borrarClase(ID);
    }
    
    public List<Cm_ClsClase> mostrarClaseAll(JComboBox jCBClase) {
         return dt_Clase.mostrarClaseAll(jCBClase);
    }
    
}
