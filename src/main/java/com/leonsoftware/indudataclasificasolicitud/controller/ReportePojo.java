/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonsoftware.indudataclasificasolicitud.controller;

import java.io.Serializable;

/**
 *
 * @author FUJITSU
 */
public class ReportePojo implements Serializable{
    private String profesional;
    private String fechaSolicitud;
    private String tipoSolicitud;
    private String descripcion;
    private String asignacionPropuesta;
    private String gradoConfianza;
    private String aceptar;
    private String porcentaje;

    public ReportePojo() {
        this.profesional = "";
        this.fechaSolicitud = "";
        this.tipoSolicitud = "";
        this.descripcion = "";
        this.asignacionPropuesta = "";
        this.gradoConfianza = "";
        this.gradoConfianza = "";
        this.gradoConfianza = "";
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getAceptar() {
        return aceptar;
    }

    public void setAceptar(String aceptar) {
        this.aceptar = aceptar;
    }
    

    public String getProfesional() {
        return profesional;
    }

    public void setProfesional(String profesional) {
        this.profesional = profesional;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getAsignacionPropuesta() {
        return asignacionPropuesta;
    }

    public void setAsignacionPropuesta(String asignacionPropuesta) {
        this.asignacionPropuesta = asignacionPropuesta;
    }

    public String getGradoConfianza() {
        return gradoConfianza;
    }

    public void setGradoConfianza(String gradoConfianza) {
        this.gradoConfianza = gradoConfianza;
    }

    
}
