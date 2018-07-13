/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leonsoftware.indudataclasificasolicitud.controller;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


/**
 *
 * @author Paco
 */
@Named
@ViewScoped
public class CriterioAsignaController implements Serializable{
        private List<ReportePojo> listaItemsTxt;
        
    
    
    public void leerArchivo(){ //direccion del archivo
        String texto = "";
        
        try{
            this.listaItemsTxt = new ArrayList<ReportePojo>(); 
            BufferedReader bf = new BufferedReader (new FileReader("C:\\indudata\\MatrizDatos.csv"));
            String bfRead;
            while((bfRead = bf.readLine()) !=null){
                ReportePojo reportePojo = new ReportePojo();
                String separador[] = bfRead.split(","); 
                reportePojo.setFechaSolicitud(separador[14]);//
                reportePojo.setTipoSolicitud(separador[12]);
                reportePojo.setDescripcion(separador[13].length()>=100?separador[13].substring(0,100):separador[13]);
                reportePojo.setAsignacionPropuesta(separador[15]);
                reportePojo.setPorcentaje(Double.toString(Math.floor(Math.random()*9*10))+"%");
                reportePojo.setAceptar("");
                this.listaItemsTxt.add(reportePojo);
           }
        }catch(Exception e){
            System.err.println("No se encontro el archivo");
        }
        
    } 

    
       public List getListaItemsTxt() {
        return listaItemsTxt;
    }

    public void setListaItemsTxt(List ListaItemsTxt) {
        this.listaItemsTxt = ListaItemsTxt;
    }
    
}
