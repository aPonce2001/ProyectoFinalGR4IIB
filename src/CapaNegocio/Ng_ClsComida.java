
package CapaNegocio;

import CapaComun.Cm_ClsComida;
import CapaDatos.Dt_ClsComida;
import java.util.List;
import javax.swing.JComboBox;

//@authors Dennis David Lincango, Kelvin Ojeda, Andrés Ponce

public class Ng_ClsComida {

    Dt_ClsComida dt_comida = new Dt_ClsComida();
    
    public Ng_ClsComida() {
    }
    
    public List<Cm_ClsComida> mostrarComidaAll(JComboBox jCBReservaComida) {
         return dt_comida.mostrarComidaAll(jCBReservaComida);
     }
    
    public List<Cm_ClsComida> mostrarComidaXId(int id_comida) {
         return dt_comida.mostrarComidaXId(id_comida);
     }
    
    public List<Cm_ClsComida> mostrarComidaTabla() {
         return dt_comida.mostrarComidaTabla();
     }
    
    public int insertarComida(String nombre) {
        return dt_comida.insertarComida(nombre);
   }
    public int eliminarComida(int id) {
        return dt_comida.eliminarComida(id);
   }
    public int actualizarComida(int id, String nombre) {
        return dt_comida.actualizarComida(id, nombre);
   }
    
}
