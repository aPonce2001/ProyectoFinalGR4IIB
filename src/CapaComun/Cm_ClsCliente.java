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
public class Cm_ClsCliente {

    private int id;
    private String nombre;
    private String apellido;
    private String cedula;
    private String id_pais_fk;
    private int passwd;

    public Cm_ClsCliente() {
    }

    public Cm_ClsCliente(int id, String nombre, String apellido, String cedula, String id_pais_fk, int passwd) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.id_pais_fk = id_pais_fk;
        this.passwd = passwd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getId_pais_fk() {
        return id_pais_fk;
    }

    public void setId_pais_fk(String id_pais_fk) {
        this.id_pais_fk = id_pais_fk;
    }

    public int getPasswd() {
        return passwd;
    }

    public void setPasswd(int passwd) {
        this.passwd = passwd;
    }

}