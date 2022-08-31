package com.portfolio.ag.Dto;

import javax.validation.constraints.NotBlank;

public class dtoProyecto {
    @NotBlank
    private String nombreE;
    @NotBlank
    private String descripcionE;
    @NotBlank
    private String imgE;
    @NotBlank
    private String urlE;
    
    //Constructores

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreE, String descripcionE, String imgE, String urlE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.imgE = imgE;
        this.urlE = urlE;
    }
    //Getters & Setters

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getImgE() {
        return imgE;
    }

    public void setImgE(String imgE) {
        this.imgE = imgE;
    }

    public String getUrlE() {
        return urlE;
    }

    public void setUrlE(String urlE) {
        this.urlE = urlE;
    }
    
}
