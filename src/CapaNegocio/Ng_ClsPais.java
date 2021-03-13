
package CapaNegocio;

import CapaComun.Cm_ClsPais;
import CapaDatos.Dt_ClsPais;
import java.util.List;
import javax.swing.JComboBox;

//@authors Dennis David Lincango, Kelvin Ojeda, Andrés Ponce

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
    
    public int actualizarPais(int ID, String nombre){
        return dt_pais.actualizarPais(ID, nombre);
    }
    
    public int borrarPais(int ID){
        return dt_pais.borrarPais(ID);
    }
}
