/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaComun;

import java.sql.Date;

//@author Dennis David
 
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
