package com.jdc.peticionesapipost.dto;

import java.util.Date;

public class ArtistaDTO {
    private String nombres;
    private String apellidos;
    private Date fechanacimiento;
    private String nacionalidad;
    private Long disquera;

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Long getDisquera() {
        return disquera;
    }

    public void setDisquera(Long disquera) {
        this.disquera = disquera;
    }
}
