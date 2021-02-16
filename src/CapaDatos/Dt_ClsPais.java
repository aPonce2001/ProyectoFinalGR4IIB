/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaDatos;

import java.util.ArrayList;

/**
 *
 * @author Dennis David
 */
public class Dt_ClsPais extends Dt_ClsConexion {

    public Dt_ClsPais() {
    }

    public int insertarPais(String nombre) {
        return 0;

    }

    public int actualizarPais(int id, String nombre) {
        return 0;

    }

    public int borrarPais(int id) {
        return 0;

    }

    public int mostrarPaisAll() {
       ArrayList<Object[]> parametros = new ArrayList<Object[]>();
       return mostrarQuery("mostrarPaisAll()", parametros);
       

    }

}
