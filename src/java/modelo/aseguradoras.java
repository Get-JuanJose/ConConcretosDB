/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author MedicinaAviación
 */
public class aseguradoras {
    int nit_aseguradora;
    String nombre_aseguradora;
    
    public aseguradoras(){}

    public aseguradoras(int nit_aseguradora, String nombre_aseguradora) {
        this.nit_aseguradora = nit_aseguradora;
        this.nombre_aseguradora = nombre_aseguradora;
    }

    public int getNit_aseguradora() {
        return nit_aseguradora;
    }

    public void setNit_aseguradora(int nit_aseguradora) {
        this.nit_aseguradora = nit_aseguradora;
    }

    public String getNombre_aseguradora() {
        return nombre_aseguradora;
    }

    public void setNombre_aseguradora(String nombre_aseguradora) {
        this.nombre_aseguradora = nombre_aseguradora;
    }
    
    
}
