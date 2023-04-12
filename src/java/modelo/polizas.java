/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author MedicinaAviación
 */
public class polizas {
   
    String numeroPoliza;
    String fechaInicio;
    String fechaFin;
    String valorPrima;
    String valorPrimaSura;
    String nitAseguradora;
    String nombreAseguradora;
    String nitAsegurado;
    String nombreAsegurado;
    String codigoContrato;
    String valorContrato;
    String riesgoVigencia;
    
    public polizas(){}
    
    public polizas(String numeroPoliza, String fechaInicio,
            String fechaFin, String valorPrima,String valorPrimaSura, String nitAseguradora, String nombreAseguradora, 
            String nitAsegurado, String nombreAsegurado,String codigoContrato, String valorContrato, String riesgoVigencia){
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaInicio;
        this.valorPrima = valorPrima;
        this.valorPrimaSura = valorPrimaSura;
        this.nitAseguradora = nitAseguradora;
        this.nombreAseguradora = nombreAseguradora;
        this.nitAsegurado = nitAsegurado;
        this.nombreAsegurado = nombreAsegurado; 
        this.codigoContrato = codigoContrato;
        this.valorContrato = valorContrato;
        this.riesgoVigencia = riesgoVigencia;
    }

    public String getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(String numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getValorPrima() {
        return valorPrima;
    }

    public void setValorPrima(String valorPrima) {
        this.valorPrima = valorPrima;
    }

    public String getNitAseguradora() {
        return nitAseguradora;
    }

    public void setNitAseguradora(String nitAseguradora) {
        this.nitAseguradora = nitAseguradora;
    }

    public String getNitAsegurado() {
        return nitAsegurado;
    }

    public void setNitAsegurado(String nitAsegurado) {
        this.nitAsegurado = nitAsegurado;
    }

    public String getCodigoContrato() {
        return codigoContrato;
    }

    public void setCodigoContrato(String codigoContrato) {
        this.codigoContrato = codigoContrato;
    }

    public String getValorContrato() {
        return valorContrato;
    }

    public void setValorContrato(String valorContrato) {
        this.valorContrato = valorContrato;
    }

    public String getNombreAseguradora() {
        return nombreAseguradora;
    }

    public void setNombreAseguradora(String nombreAseguradora) {
        this.nombreAseguradora = nombreAseguradora;
    }

    public String getNombreAsegurado() {
        return nombreAsegurado;
    }

    public void setNombreAsegurado(String nombreAsegurado) {
        this.nombreAsegurado = nombreAsegurado;
    }

    public String getValorPrimaSura() {
        return valorPrimaSura;
    }

    public void setValorPrimaSura(String valorPrimaSura) {
        this.valorPrimaSura = valorPrimaSura;
    }

    public String getRiesgoVigencia() {
        return riesgoVigencia;
    }

    public void setRiesgoVigencia(String riesgoVigencia) {
        this.riesgoVigencia = riesgoVigencia;
    }
    
    
}
