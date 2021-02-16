/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaNegocio;

import CapaDatos.Dt_ClsPais;

/**
 *
 * @author Dennis David
 */
public class Ng_ClsPais {

    Dt_ClsPais dt_pais =  new Dt_ClsPais();
    
    public Ng_ClsPais() {
    }
    
     public int mostrarPaisAll() {
         return dt_pais.mostrarPaisAll();
     }
     
}
