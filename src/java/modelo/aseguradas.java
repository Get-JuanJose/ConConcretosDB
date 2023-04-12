/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author MedicinaAviación
 */
public class aseguradas {
    int nit_asegurada;
    String nombre_asegurada;
    int cc_rep_legal;
    String nombre_rep_legal;
    
    public aseguradas(){}
   
    public aseguradas(int nit_asegurada, String nombre_aseguarada, int cc_rep_legal, String nombre_rep_legal){
        this.nit_asegurada = nit_asegurada;
        this.nombre_asegurada = nombre_asegurada;
        this.cc_rep_legal = cc_rep_legal;
        this.nombre_rep_legal = nombre_rep_legal;
    }

    public int getNit_asegurada() {
        return nit_asegurada;
    }

    public void setNit_asegurada(int nit_asegurada) {
        this.nit_asegurada = nit_asegurada;
    }

    public String getNombre_asegurada() {
        return nombre_asegurada;
    }

    public void setNombre_asegurada(String nombre_asegurada) {
        this.nombre_asegurada = nombre_asegurada;
    }

    public int getCc_rep_legal() {
        return cc_rep_legal;
    }

    public void setCc_rep_legal(int cc_rep_legal) {
        this.cc_rep_legal = cc_rep_legal;
    }

    public String getNombre_rep_legal() {
        return nombre_rep_legal;
    }

    public void setNombre_rep_legal(String nombre_rep_legal) {
        this.nombre_rep_legal = nombre_rep_legal;
    }
    
    
    
    
}
