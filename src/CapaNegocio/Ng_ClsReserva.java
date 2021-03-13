
package CapaNegocio;

import CapaComun.Cm_ClsReserva;
import CapaDatos.Dt_ClsReserva;
import java.util.List;

//@authors Dennis David Lincango, Kelvin Ojeda, Andrés Ponce

public class Ng_ClsReserva {

    Dt_ClsReserva dt_reserva = new Dt_ClsReserva();
    public Ng_ClsReserva() {
    }
    
    public int insertarReserva(int id_cliente_fk, int id_asiento_fk, int id_comida_fk, int id_pais_origen_fk, int id_pais_destino_fk) {
        return dt_reserva.insertarReserva(id_cliente_fk, id_asiento_fk, id_comida_fk, id_pais_origen_fk, id_pais_destino_fk);
    }
    
    public int actualizarReserva(int id, int id_cliente_fk, int id_asiento_fk, int id_comida_fk, int id_pais_origen_fk, int id_pais_destino_fk) {
        return dt_reserva.actualizarReserva(id, id_cliente_fk, id_asiento_fk, id_comida_fk, id_pais_origen_fk, id_pais_destino_fk);
    }
    
    public List<Cm_ClsReserva> mostrarReservasXIdCliente(int id_cliente_fk) {
        System.out.println("id_cliente_fk :" + dt_reserva.mostrarReservasXIdCliente(id_cliente_fk) );
        return dt_reserva.mostrarReservasXIdCliente(id_cliente_fk);
    }
   
     public List<Cm_ClsReserva> mostrarReservaAll() {
       return dt_reserva.mostrarReservaAll();
     }
    
     public void borrarReserva(int id_reserva ) {
          dt_reserva.borrarReserva(id_reserva); 
     }
}
