
package CapaNegocio;

import CapaComun.Cm_ClsComida;
import CapaComun.Cm_ClsPais;
import CapaDatos.Dt_ClsComida;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author Dennis David
 */
public class Ng_ClsComida {

    Dt_ClsComida dt_comida = new Dt_ClsComida();
    
    public Ng_ClsComida() {
    }
    
    public List<Cm_ClsComida> mostrarPaisAll(JComboBox jCBReservaComida) {
         return dt_comida.mostrarComidaAll(jCBReservaComida);
     }
    
}
