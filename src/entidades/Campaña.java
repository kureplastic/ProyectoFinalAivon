/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.time.LocalDate;

/**
 *
 * @author Fran Gonzalez
 */
public class Campaña {
    
    private int idCampaña;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private float montoMin;
    private float montoTope;
    private int estrellasXCampaña;

    public Campaña() {
    }

    public Campaña(int idCampaña, LocalDate fechaInicio, LocalDate fechaFinal, float montoMin, float montoTope, int estrellasXCampaña) {
        this.idCampaña = idCampaña;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.montoMin = montoMin;
        this.montoTope = montoTope;
        this.estrellasXCampaña = estrellasXCampaña;
    }

    public Campaña(LocalDate fechaInicio, LocalDate fechaFinal, float montoMin, float montoTope, int estrellasXCampaña) {
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.montoMin = montoMin;
        this.montoTope = montoTope;
        this.estrellasXCampaña = estrellasXCampaña;
    }

    public int getIdCampaña() {
        return idCampaña;
    }

    public void setIdCampaña(int idCampaña) {
        this.idCampaña = idCampaña;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public float getMontoMin() {
        return montoMin;
    }

    public void setMontoMin(float montoMin) {
        this.montoMin = montoMin;
    }

    public float getMontoTope() {
        return montoTope;
    }

    public void setMontoTope(float montoTope) {
        this.montoTope = montoTope;
    }

    public int getEstrellasXCampaña() {
        return estrellasXCampaña;
    }

    public void setEstrellasXCampaña(int estrellasXCampaña) {
        this.estrellasXCampaña = estrellasXCampaña;
    }
    
    
    
}
