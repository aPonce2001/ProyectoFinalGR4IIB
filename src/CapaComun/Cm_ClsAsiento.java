/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaComun;

/**
 *
 * @author Dennis David
 */
public class Cm_ClsAsiento {
    private int id;
    private String ubicacion;
    private String estado;
    private int id_clse_FK;

    public Cm_ClsAsiento() {
    }

    public Cm_ClsAsiento(int id, String ubicacion, String estado, int id_clse_FK) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.estado = estado;
        this.id_clse_FK = id_clse_FK;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId_clse_FK() {
        return id_clse_FK;
    }

    public void setId_clse_FK(int id_clse_FK) {
        this.id_clse_FK = id_clse_FK;
    }
   
    
}
