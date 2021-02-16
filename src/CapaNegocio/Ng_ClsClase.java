/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.Dt_ClsClase;
import static CapaDatos.Dt_ClsConexion.executeQuery;
import CapaDatos.Dt_ClsPais;
import java.util.ArrayList;

/**
 *
 * @author Dennis David
 */
public class Ng_ClsClase {

    Dt_ClsClase dt_Actividad =  new Dt_ClsClase();
    
    public Ng_ClsClase() {
    }
    
    public int insertarClase(String nombre, int capacidad) {
        return dt_Actividad.insertarClase(nombre, capacidad);
    }

    
}
