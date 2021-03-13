
package CapaComun;

import java.sql.Date;

//@authors Dennis David Lincango, Kelvin Ojeda, Andrés Ponce

public class Cm_ClsReserva {
    
    private int id;
    Date fecha;
    int idClientFk;
    int idAsientoFk;
    int idComidaFk;
    int idPaisOrigenFk;
    int idPaisDestinoFk;

    public Cm_ClsReserva() {
    }

    public Cm_ClsReserva(int id, Date fecha, int idClientFk, int idAsientoFk, int idComidaFk, int idPaisOrigenFk, int idPaisDestinoFk) {
        this.id = id;
        this.fecha = fecha;
        this.idClientFk = idClientFk;
        this.idAsientoFk = idAsientoFk;
        this.idComidaFk = idComidaFk;
        this.idPaisOrigenFk = idPaisOrigenFk;
        this.idPaisDestinoFk = idPaisDestinoFk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdClientFk() {
        return idClientFk;
    }

    public void setIdClientFk(int idClientFk) {
        this.idClientFk = idClientFk;
    }

    public int getIdAsientoFk() {
        return idAsientoFk;
    }

    public void setIdAsientoFk(int idAsientoFk) {
        this.idAsientoFk = idAsientoFk;
    }

    public int getIdComidaFk() {
        return idComidaFk;
    }

    public void setIdComidaFk(int idComidaFk) {
        this.idComidaFk = idComidaFk;
    }

    public int getIdPaisOrigenFk() {
        return idPaisOrigenFk;
    }

    public int getIdPaisDestinoFk() {
        return idPaisDestinoFk;
    }
}
