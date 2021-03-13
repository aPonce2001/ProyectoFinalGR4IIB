
package CapaNegocio;

import CapaComun.Cm_ClsClase;
import CapaDatos.Dt_ClsClase;
import java.util.*;
import javax.swing.JComboBox;

//@authors Dennis David Lincango, Kelvin Ojeda, Andrés Ponce

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
